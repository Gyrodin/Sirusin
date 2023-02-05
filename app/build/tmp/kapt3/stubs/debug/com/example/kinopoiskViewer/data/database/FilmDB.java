package com.example.kinopoiskViewer.data.database;

import java.lang.System;

@androidx.room.Entity(tableName = "films")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003Jk\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/example/kinopoiskViewer/data/database/FilmDB;", "", "filmId", "", "nameRu", "", "year", "posterUrlPreview", "genres", "", "Lcom/example/kinopoiskViewer/data/model/Genres;", "description", "countries", "Lcom/example/kinopoiskViewer/data/model/Countries;", "isFavourite", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Z)V", "getCountries", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getFilmId", "()I", "getGenres", "()Z", "setFavourite", "(Z)V", "getNameRu", "getPosterUrlPreview", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class FilmDB {
    @androidx.room.PrimaryKey()
    private final int filmId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nameRu")
    private final java.lang.String nameRu = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "year")
    private final java.lang.String year = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrlPreview = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "genres")
    private final java.util.List<com.example.kinopoiskViewer.data.model.Genres> genres = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "countries")
    private final java.util.List<com.example.kinopoiskViewer.data.model.Countries> countries = null;
    @androidx.room.ColumnInfo(name = "isFavourite")
    private boolean isFavourite;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskViewer.data.database.FilmDB copy(int filmId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Countries> countries, boolean isFavourite) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FilmDB(int filmId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Countries> countries, boolean isFavourite) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getFilmId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Genres> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Genres> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Countries> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Countries> getCountries() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isFavourite() {
        return false;
    }
    
    public final void setFavourite(boolean p0) {
    }
}