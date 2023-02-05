package com.example.kinopoiskViewer.data.api

import com.example.kinopoiskViewer.data.model.Film
import com.example.kinopoiskViewer.data.model.TopFilms
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("v2.2/films/{id}")
    suspend fun getFilm(
        @Path("id") id: Int,
        @Header("X-API-KEY") token: String,
    ): Film

    @GET("v2.2/films/top")
    suspend fun getTopFilms(
        @Query("page") page: Int,
        @Header("X-API-KEY") token: String,
    ): TopFilms

}