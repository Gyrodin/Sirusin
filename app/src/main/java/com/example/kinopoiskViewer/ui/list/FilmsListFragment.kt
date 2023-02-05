package com.example.kinopoiskViewer.ui.list

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kinopoiskViewer.MainActivity
import com.example.kinopoiskViewer.R
import com.example.kinopoiskViewer.data.database.FilmDB
import com.example.kinopoiskViewer.data.model.Film
import com.example.kinopoiskViewer.data.state.Result
import com.example.kinopoiskViewer.databinding.FragmentMainBinding
import com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter


class FilmsListFragment :
    Fragment(R.layout.fragment_main),
    FilmsListAdapter.FilmItemClickListener,
    FilmsListAdapter.FilmItemLongClickListener {

    private lateinit var filmsViewModel: FilmsViewModel
    private lateinit var binding: FragmentMainBinding
    private val adapter: FilmsListAdapter = FilmsListAdapter(this, this)

    companion object {
        fun newInstance() = FilmsListFragment()
        const val TAG: String = "FilmsListFragment"
        private const val UNKNOWN_FILM_ID: Int = -1
    }

    private var lastOpenedFilmId: Int = UNKNOWN_FILM_ID

    private val isLandscape: Boolean
        get() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lastOpenedFilmId = savedInstanceState?.getInt(MainActivity.ARG_FILM_ID, UNKNOWN_FILM_ID) ?: UNKNOWN_FILM_ID
        if (isLandscape) openFilmDetails(lastOpenedFilmId)

        binding = FragmentMainBinding.bind(view)
        binding.filmsListRecycler.layoutManager = LinearLayoutManager(context)
        filmsViewModel = ViewModelProvider(this).get(FilmsViewModel::class.java)
        binding.filmsListRecycler.adapter = adapter
        loadTopFilms(isLandscape)

        filmsViewModel.localFilms.observe(viewLifecycleOwner) { filmsDB ->
            renderFavoriteFilms(filmsDB)
        }

        binding.buttonPopular.setOnClickListener {
            binding.buttonPopular.isEnabled = false
            binding.buttonFavourite.isEnabled = true
            binding.tvPopular.visibility = View.VISIBLE
            binding.tvFavourite.visibility = View.GONE
            binding.buttonFavourite.visibility = View.VISIBLE
            loadTopFilms(isLandscape)
        }

        binding.buttonFavourite.setOnClickListener {
            binding.buttonPopular.isEnabled = true
            binding.buttonFavourite.isEnabled = false
            binding.tvPopular.visibility = View.GONE
            binding.tvFavourite.visibility = View.VISIBLE
            showOnlyFavorites()
        }

        binding.edSearch.addTextChangedListener {
            it?.toString()?.let(::searchFilm)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(MainActivity.ARG_FILM_ID, lastOpenedFilmId)
    }

    override fun openFilmDetails(id: Int) {
        lastOpenedFilmId = id
        requireActivity().supportFragmentManager.setFragmentResult(
            MainActivity.REQUEST_KEY_OPEN_DESCRIPTION,
            bundleOf(MainActivity.ARG_FILM_ID to id)
        )
    }

    override fun markAsFavorite(film: Film) {
        filmsViewModel.markAsFavorite(film)
    }

    private fun loadTopFilms(isLandscape: Boolean) {
        filmsViewModel.getTopFilms().observe(viewLifecycleOwner) { result ->
            renderTopFilms(result, isLandscape)
        }
    }

    private fun renderTopFilms(result: Result<List<Film>>, isLandscape: Boolean) {
        when (result) {
            is Result.Loading -> {
                binding.filmsListRecycler.visibility = View.GONE
                binding.progressBar.visibility = View.VISIBLE
            }
            is Result.Success -> {
                binding.filmsListRecycler.visibility = View.VISIBLE
                binding.progressBar.visibility = View.GONE
                adapter.setItems(result.data)
                filmsViewModel.fetchFavoriteFilmsFromDatabase()
                if (isLandscape && result.data.isNotEmpty() && lastOpenedFilmId == UNKNOWN_FILM_ID) {
                    openFilmDetails(result.data[0].filmId)
                }
            }
            is Result.Error -> {
                filmsViewModel.fetchFavoriteFilmsFromDatabase()
                binding.filmsListRecycler.visibility = View.GONE
                binding.progressBar.visibility = View.GONE
                Toast.makeText(context, "Ошибка при загрузке данных", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun renderFavoriteFilms(localFilms: List<FilmDB>) {
        if (adapter.getItems().isEmpty()) {
            val films = localFilms.map {
                Film(
                    filmId = it.filmId,
                    nameRu = it.nameRu,
                    nameEn = it.nameRu,
                    year = it.year,
                    filmLength = "",
                    countries = it.countries.filterNotNull(),
                    genres = it.genres.filterNotNull(),
                    rating = "",
                    ratingVoteCount = "",
                    posterUrl = "",
                    posterUrlPreview = it.posterUrlPreview,
                    slogan = "",
                    description = it.description.orEmpty(),
                    ratingKinopoisk = "",
                    webUrl = "",
                    isFavourite = it.isFavourite
                )
            }
            binding.filmsListRecycler.visibility = View.VISIBLE
            binding.progressBar.visibility = View.GONE
            adapter.setItems(films)
        } else {
            val updatedFilms = adapter.getItems().map { item ->
                val dbItem = localFilms.find { it.filmId == item.filmId }
                if (dbItem == null) {
                    item.copy(isFavourite = false)
                } else {
                    item.copy(isFavourite = dbItem.isFavourite)
                }
            }
            adapter.setItems(updatedFilms)
        }
    }

    private fun showOnlyFavorites() {
        val onlyFavorite = adapter.getItems().filter { it.isFavourite }
        adapter.setItems(onlyFavorite)
    }

    private fun searchFilm(query: String) {
        val trimmed = query.trim()
        if (trimmed.isNotEmpty()) {
            val filteredItems = adapter.getItems().filter { it.nameRu.contains(query, ignoreCase = true) }
            adapter.setItems(filteredItems)
        } else when {
            binding.buttonPopular.isEnabled -> {
                adapter.setItems(emptyList())
                filmsViewModel.fetchFavoriteFilmsFromDatabase()
            }
            binding.buttonFavourite.isEnabled -> {
                loadTopFilms(isLandscape)
            }
        }
    }

}