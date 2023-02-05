package com.example.kinopoiskViewer.ui.list.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskViewer.data.model.Film
import com.example.kinopoiskViewer.databinding.FilmListItemBinding


class FilmsListAdapter(
    private val filmItemClickListener: FilmItemClickListener,
    private val filmItemLongClickListener: FilmItemLongClickListener,
) : RecyclerView.Adapter<FilmViewHolder>() {

    private var currentItems: List<Film> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(films: List<Film>) {
        currentItems = films
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = FilmListItemBinding.inflate(layoutInflater, parent, false)
        return FilmViewHolder(binding, filmItemClickListener, filmItemLongClickListener)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = currentItems[position]
        holder.bind(film, position)
    }

    override fun getItemCount(): Int = currentItems.size

    fun interface FilmItemClickListener {
        fun openFilmDetails(id: Int)
    }

    fun interface FilmItemLongClickListener {
        fun markAsFavorite(film: Film)
    }

    fun getItems(): List<Film>{
        return currentItems
    }

}