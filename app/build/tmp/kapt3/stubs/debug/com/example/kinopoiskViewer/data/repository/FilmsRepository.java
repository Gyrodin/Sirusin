package com.example.kinopoiskViewer.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/kinopoiskViewer/data/repository/FilmsRepository;", "", "apiService", "Lcom/example/kinopoiskViewer/data/api/ApiService;", "(Lcom/example/kinopoiskViewer/data/api/ApiService;)V", "getFilm", "Lcom/example/kinopoiskViewer/data/model/Film;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopFilms", "Lcom/example/kinopoiskViewer/data/model/TopFilms;", "page", "app_debug"})
public final class FilmsRepository {
    private final com.example.kinopoiskViewer.data.api.ApiService apiService = null;
    
    public FilmsRepository(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.data.api.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFilm(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskViewer.data.model.Film> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopFilms(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskViewer.data.model.TopFilms> continuation) {
        return null;
    }
}