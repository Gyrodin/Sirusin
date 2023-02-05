package com.example.kinopoiskViewer.ui.details

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

class FilmDetailsViewModel : ViewModel() {

    private val filmsRepository = FilmsRepository(RetrofitBuilder.apiService)

    private val appDatabase = AppDatabase.getDatabase()

    private val _localFilms = MutableLiveData<FilmDB>()
    val localFilms: LiveData<FilmDB>
        get() = _localFilms


    fun getFilmFromDatabase() =
        viewModelScope.launch {
            try {
                _localFilms.postValue(appDatabase.filmDao().getFilm(1))
            } catch (exception: Exception) {
                throw exception
            }
        }

    fun getFilm(id: Int) = liveData(Dispatchers.IO) {
        emit(Result.Loading)
        try {
            emit(Result.Success(filmsRepository.getFilm(id)))
        } catch (e: Exception) {
            emit(Result.Error(e))
        }
    }
}