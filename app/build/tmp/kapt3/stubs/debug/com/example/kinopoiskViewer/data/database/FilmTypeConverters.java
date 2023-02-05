package com.example.kinopoiskViewer.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/kinopoiskViewer/data/database/FilmTypeConverters;", "", "()V", "fromCountries", "", "countries", "", "Lcom/example/kinopoiskViewer/data/model/Countries;", "fromGenres", "genres", "Lcom/example/kinopoiskViewer/data/model/Genres;", "toCountries", "toGenres", "app_debug"})
public final class FilmTypeConverters {
    
    public FilmTypeConverters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Genres> genres) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Genres> toGenres(@org.jetbrains.annotations.NotNull()
    java.lang.String genres) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCountries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Countries> countries) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Countries> toCountries(@org.jetbrains.annotations.NotNull()
    java.lang.String countries) {
        return null;
    }
}