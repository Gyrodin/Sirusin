package com.example.kinopoiskViewer.ui.list

import androidx.lifecycle.*
import com.example.kinopoiskViewer.data.api.RetrofitBuilder
import com.example.kinopoiskViewer.data.database.AppDatabase
import com.example.kinopoiskViewer.data.database.FilmDB
import com.example.kinopoiskViewer.data.model.Film
import com.example.kinopoiskViewer.data.repository.FilmsRepository
import com.example.kinopoiskViewer.data.state.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FilmsViewModel : ViewModel() {

    private val filmRepository = FilmsRepository(RetrofitBuilder.apiService)
    private val appDatabase = AppDatabase.getDatabase()

    private val _localFilms = MutableLiveData<List<FilmDB>>()
    val localFilms: LiveData<List<FilmDB>>
        get() = _localFilms


    fun fetchFavoriteFilmsFromDatabase() =
        viewModelScope.launch {
            try {
                _localFilms.postValue(appDatabase.filmDao().getAllFilms())
            } catch (exception: Exception) {
                throw exception
            }
        }

    fun setAllFilmsToDatabase(films: List<FilmDB>) =
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                appDatabase.filmDao().insertAllFilms(films)
                fetchFavoriteFilmsFromDatabase()
            }
        }

    fun getTopFilms(page: Int) = liveData(Dispatchers.IO) {
        emit(Result.Loading)
        try {
            val topFilms = filmRepository.getTopFilms(page)
            val resultSuccess = Result.Success(topFilms.films)
            emit(resultSuccess)
        } catch (error: Exception) {
            val resultError = Result.Error(error)
            emit(resultError)
        }

    }

    fun getTopFilms() = liveData(Dispatchers.IO) {
        emit(Result.Loading)
        try {
            //загрузка всех страниц фильмов в один список
            var films: List<Film>
            var topFilms = filmRepository.getTopFilms(1)
            films = topFilms.films
            val cntPages = topFilms.pagesCount
            for (i in 2..cntPages)
                films += filmRepository.getTopFilms(i).films
            emit(Result.Success(data = films))
        } catch (error: Exception) {
            val resultError = Result.Error(error)
            emit(resultError)
        }
    }

    fun markAsFavorite(film: Film) {
        viewModelScope.launch(Dispatchers.IO) {
            val localFilm = appDatabase.filmDao().getFilm(film.filmId)
            if (localFilm == null) {
                val filmDB = FilmDB(
                    filmId = film.filmId,
                    nameRu = film.nameRu,
                    year = film.year,
                    countries = film.countries,
                    genres = film.genres,
                    posterUrlPreview = film.posterUrlPreview,
                    description = film.description.orEmpty(),
                    isFavourite = true
                )
                appDatabase.filmDao().insertFilm(filmDB)
            } else {
                appDatabase.filmDao().deleteFilm(localFilm)
            }
            _localFilms.postValue(appDatabase.filmDao().getAllFilms())
        }
    }
}