package com.example.kinopoiskViewer.data.database

import androidx.room.TypeConverter
import com.example.kinopoiskViewer.data.model.Countries
import com.example.kinopoiskViewer.data.model.Genres
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.ArrayList


class FilmTypeConverters {

    @TypeConverter
    fun fromGenres(genres: List<Genres>): String? {
        val gson = Gson()
        return gson.toJson(genres)
    }


    @TypeConverter
    fun toGenres(genres: String): List<Genres> {
        val genresList = object : TypeToken<ArrayList<Genres>>() {}.type
        return Gson().fromJson(genres, genresList)
    }

    @TypeConverter
    fun fromCountries(countries: List<Countries>): String? {
        val gson = Gson()
        return gson.toJson(countries)
    }


    @TypeConverter
    fun toCountries(countries: String): List<Countries> {
        val countriesList = object : TypeToken<ArrayList<Countries>>() {}.type
        return Gson().fromJson(countries, countriesList)
    }

}

/*    @TypeConverter
    fun fromGenres(genres: List<String>) = Json.encodeToString(genres)


    @TypeConverter
    fun toGenres(genres: String) = Json.decodeFromString<List<Genres>>(genres)

    @TypeConverter
    fun fromCountries(countries: List<Countries>) = Json.encodeToString(countries)


    @TypeConverter
    fun toCountries(countries: String) = Json.decodeFromString<List<Countries>>(countries)*/