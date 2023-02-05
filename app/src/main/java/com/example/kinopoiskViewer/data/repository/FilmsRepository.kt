package com.example.kinopoiskViewer.data.repository

import com.example.kinopoiskViewer.TOKEN
import com.example.kinopoiskViewer.data.api.ApiService

class FilmsRepository(private val apiService: ApiService) {

    suspend fun getFilm(id: Int) = apiService.getFilm(id, TOKEN)
    suspend fun getTopFilms(page: Int) = apiService.getTopFilms(page, TOKEN)

}