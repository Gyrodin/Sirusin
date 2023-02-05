package com.example.kinopoiskViewer.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00120\fJ \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00120\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013J\u0014\u0010\u0019\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/FilmsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_localFilms", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kinopoiskViewer/data/database/FilmDB;", "appDatabase", "Lcom/example/kinopoiskViewer/data/database/AppDatabase;", "filmRepository", "Lcom/example/kinopoiskViewer/data/repository/FilmsRepository;", "localFilms", "Landroidx/lifecycle/LiveData;", "getLocalFilms", "()Landroidx/lifecycle/LiveData;", "fetchFavoriteFilmsFromDatabase", "Lkotlinx/coroutines/Job;", "getTopFilms", "Lcom/example/kinopoiskViewer/data/state/Result;", "Lcom/example/kinopoiskViewer/data/model/Film;", "page", "", "markAsFavorite", "", "film", "setAllFilmsToDatabase", "films", "app_debug"})
public final class FilmsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kinopoiskViewer.data.repository.FilmsRepository filmRepository = null;
    private final com.example.kinopoiskViewer.data.database.AppDatabase appDatabase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskViewer.data.database.FilmDB>> _localFilms = null;
    
    public FilmsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kinopoiskViewer.data.database.FilmDB>> getLocalFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchFavoriteFilmsFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setAllFilmsToDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.database.FilmDB> films) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kinopoiskViewer.data.state.Result<java.util.List<com.example.kinopoiskViewer.data.model.Film>>> getTopFilms(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kinopoiskViewer.data.state.Result<java.util.List<com.example.kinopoiskViewer.data.model.Film>>> getTopFilms() {
        return null;
    }
    
    public final void markAsFavorite(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.data.model.Film film) {
    }
}