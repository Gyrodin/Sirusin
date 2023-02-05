package com.example.kinopoiskViewer.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kinopoiskViewer.data.model.Countries
import com.example.kinopoiskViewer.data.model.Genres

@Entity(tableName = "films")
data class FilmDB(
    @PrimaryKey
    val filmId: Int,
    @ColumnInfo(name = "nameRu")
    val nameRu: String,
    @ColumnInfo(name = "year")
    val year: String,
    val posterUrlPreview: String,
    @ColumnInfo(name = "genres")
    val genres: List<Genres?>,
    @ColumnInfo(name = "description")
    val description: String?,
    @ColumnInfo(name = "countries")
    val countries: List<Countries?>,


    @ColumnInfo(name = "isFavourite")
    var isFavourite: Boolean
)
