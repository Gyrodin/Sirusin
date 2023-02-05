package com.example.kinopoiskViewer.data.model

import com.google.gson.annotations.SerializedName

data class TopFilms(
    @SerializedName("pagesCount")
    val pagesCount: Int,
    @SerializedName("films")
    val films: List<Film>
)
