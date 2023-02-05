package com.example.kinopoiskViewer.ui.list.adapter

import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kinopoiskViewer.R
import com.example.kinopoiskViewer.data.model.Film
import com.example.kinopoiskViewer.databinding.FilmListItemBinding

class FilmViewHolder(
    private val binding: FilmListItemBinding,
    private val filmItemClickListener: FilmsListAdapter.FilmItemClickListener,
    private val filmItemLongClickListener: FilmsListAdapter.FilmItemLongClickListener,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(film: Film, position: Int) {
        binding.nameRu.text = itemView.context.getString(R.string.numbered_name_template, position + 1, film.nameRu)
        binding.year.text = film.year
        binding.posterPreview.load(film.posterUrlPreview)
        binding.genre.text = film.genres.joinToString { it.genre }
        binding.favouriteStar.isVisible = film.isFavourite

        binding.root.setOnClickListener {
            filmItemClickListener.openFilmDetails(film.filmId)
        }

        binding.root.setOnLongClickListener {
            filmItemLongClickListener.markAsFavorite(film)
            true
        }
    }

}
