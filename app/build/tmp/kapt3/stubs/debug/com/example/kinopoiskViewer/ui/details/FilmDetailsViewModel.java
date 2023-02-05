package com.example.kinopoiskViewer.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/example/kinopoiskViewer/ui/details/FilmDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_localFilms", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/kinopoiskViewer/data/database/FilmDB;", "appDatabase", "Lcom/example/kinopoiskViewer/data/database/AppDatabase;", "filmsRepository", "Lcom/example/kinopoiskViewer/data/repository/FilmsRepository;", "localFilms", "Landroidx/lifecycle/LiveData;", "getLocalFilms", "()Landroidx/lifecycle/LiveData;", "getFilm", "Lcom/example/kinopoiskViewer/data/state/Result;", "Lcom/example/kinopoiskViewer/data/model/Film;", "id", "", "getFilmFromDatabase", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class FilmDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kinopoiskViewer.data.repository.FilmsRepository filmsRepository = null;
    private final com.example.kinopoiskViewer.data.database.AppDatabase appDatabase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.kinopoiskViewer.data.database.FilmDB> _localFilms = null;
    
    public FilmDetailsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kinopoiskViewer.data.database.FilmDB> getLocalFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFilmFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kinopoiskViewer.data.state.Result<com.example.kinopoiskViewer.data.model.Film>> getFilm(int id) {
        return null;
    }
}