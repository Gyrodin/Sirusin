package com.example.kinopoiskViewer.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/kinopoiskViewer/data/api/ApiService;", "", "getFilm", "Lcom/example/kinopoiskViewer/data/model/Film;", "id", "", "token", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopFilms", "Lcom/example/kinopoiskViewer/data/model/TopFilms;", "page", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2.2/films/{id}")
    public abstract java.lang.Object getFilm(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "X-API-KEY")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskViewer.data.model.Film> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2.2/films/top")
    public abstract java.lang.Object getTopFilms(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "X-API-KEY")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskViewer.data.model.TopFilms> continuation);
}