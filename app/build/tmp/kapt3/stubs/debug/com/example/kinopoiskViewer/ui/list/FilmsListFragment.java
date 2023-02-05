package com.example.kinopoiskViewer.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J\u0016\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J$\u0010\"\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 0$2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/FilmsListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemClickListener;", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemLongClickListener;", "()V", "adapter", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter;", "binding", "Lcom/example/kinopoiskViewer/databinding/FragmentMainBinding;", "filmsViewModel", "Lcom/example/kinopoiskViewer/ui/list/FilmsViewModel;", "isLandscape", "", "()Z", "lastOpenedFilmId", "", "loadTopFilms", "", "markAsFavorite", "film", "Lcom/example/kinopoiskViewer/data/model/Film;", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "openFilmDetails", "id", "renderFavoriteFilms", "localFilms", "", "Lcom/example/kinopoiskViewer/data/database/FilmDB;", "renderTopFilms", "result", "Lcom/example/kinopoiskViewer/data/state/Result;", "searchFilm", "query", "", "showOnlyFavorites", "Companion", "app_debug"})
public final class FilmsListFragment extends androidx.fragment.app.Fragment implements com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemClickListener, com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemLongClickListener {
    private com.example.kinopoiskViewer.ui.list.FilmsViewModel filmsViewModel;
    private com.example.kinopoiskViewer.databinding.FragmentMainBinding binding;
    private final com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskViewer.ui.list.FilmsListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "FilmsListFragment";
    private static final int UNKNOWN_FILM_ID = -1;
    private int lastOpenedFilmId = -1;
    
    public FilmsListFragment() {
        super();
    }
    
    private final boolean isLandscape() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void openFilmDetails(int id) {
    }
    
    @java.lang.Override()
    public void markAsFavorite(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.data.model.Film film) {
    }
    
    private final void loadTopFilms(boolean isLandscape) {
    }
    
    private final void renderTopFilms(com.example.kinopoiskViewer.data.state.Result<? extends java.util.List<com.example.kinopoiskViewer.data.model.Film>> result, boolean isLandscape) {
    }
    
    private final void renderFavoriteFilms(java.util.List<com.example.kinopoiskViewer.data.database.FilmDB> localFilms) {
    }
    
    private final void showOnlyFavorites() {
    }
    
    private final void searchFilm(java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/FilmsListFragment$Companion;", "", "()V", "TAG", "", "UNKNOWN_FILM_ID", "", "newInstance", "Lcom/example/kinopoiskViewer/ui/list/FilmsListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskViewer.ui.list.FilmsListFragment newInstance() {
            return null;
        }
    }
}