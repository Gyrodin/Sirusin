package com.example.kinopoiskViewer.data.database

import androidx.room.*

@Dao
interface FilmDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFilm(film: FilmDB)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllFilms(films: List<FilmDB>)

    @Delete
    suspend fun deleteFilm(film: FilmDB)

    @Query("SELECT * FROM films")
    suspend fun getAllFilms(): List<FilmDB>

    @Update
    suspend fun updateFilm(film: FilmDB)

    @Query("SELECT * FROM films WHERE filmId = :id")
    suspend fun getFilm(id: Int): FilmDB?
}