package com.example.kinopoiskViewer.ui.details

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.example.kinopoiskViewer.R
import com.example.kinopoiskViewer.data.state.Result
import com.example.kinopoiskViewer.databinding.FragmentFilmDetailsBinding


class FilmDetailsFragment : Fragment(R.layout.fragment_film_details) {

    private lateinit var filmDetailsViewModel: FilmDetailsViewModel
    private lateinit var binding: FragmentFilmDetailsBinding
    lateinit var sendText: String

    companion object {
        fun newInstance(id: Int): FilmDetailsFragment {
            val args = Bundle()
            args.putInt("id", id)
            val fragment = FilmDetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar1)
        toolbar.setTitle("Информация о фильме:")

        binding = FragmentFilmDetailsBinding.bind(view)
        filmDetailsViewModel = ViewModelProvider(this).get(FilmDetailsViewModel::class.java)

        filmDetailsViewModel.getFilm(this.requireArguments().getInt("id")).observe(viewLifecycleOwner) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.crollView.visibility = View.GONE
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Result.Success -> {
                    binding.crollView.visibility = View.VISIBLE
                    binding.progressBar.visibility = View.GONE
                    renderFilm(
                        name = result.data.nameRu,
                        year = result.data.year,
                        genres = result.data.genres.joinToString { it.genre },
                        country = result.data.countries.joinToString { it.country },
                        description = result.data.description.orEmpty(),
                        previewUrl = result.data.posterUrlPreview
                    )
                    sendText = result.data.webUrl ?: "здесь должна была быть ссылка на фильм"
                }
                is Result.Error -> {
                    filmDetailsViewModel.getFilmFromDatabase()
                    binding.crollView.visibility = View.GONE
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(activity, "Ошибка при загрузке данных", Toast.LENGTH_LONG)
                }
            }
        }

        filmDetailsViewModel.localFilms.observe(viewLifecycleOwner) {
            binding.crollView.visibility = View.VISIBLE
            binding.progressBar.visibility = View.GONE
            renderFilm(
                name = it.nameRu,
                year = it.year,
                genres = it.genres.joinToString { it?.genre.orEmpty() },
                country = it.countries.joinToString { it?.country.orEmpty() },
                description = it.description.orEmpty(),
                previewUrl = it.posterUrlPreview
            )
        }
    }

    private fun renderFilm(
        name: String,
        year: String,
        genres: String,
        country: String,
        description: String,
        previewUrl: String,
    ) {
        binding.nameRu.text = name
        binding.year.text = getString(R.string.year_template, year)
        binding.genres.text = getString(R.string.genres_template, genres)
        binding.countries.text = getString(R.string.country_template, country)
        binding.description.text = getString(R.string.description_template, description)
        binding.posterPreview.load(previewUrl)
    }
}