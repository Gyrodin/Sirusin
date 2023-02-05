package com.example.kinopoiskViewer.ui.list.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmViewHolder;", "filmItemClickListener", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemClickListener;", "filmItemLongClickListener", "Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemLongClickListener;", "(Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemClickListener;Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemLongClickListener;)V", "currentItems", "", "Lcom/example/kinopoiskViewer/data/model/Film;", "getItemCount", "", "getItems", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "films", "FilmItemClickListener", "FilmItemLongClickListener", "app_debug"})
public final class FilmsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kinopoiskViewer.ui.list.adapter.FilmViewHolder> {
    private final com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemClickListener filmItemClickListener = null;
    private final com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemLongClickListener filmItemLongClickListener = null;
    private java.util.List<com.example.kinopoiskViewer.data.model.Film> currentItems;
    
    public FilmsListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemClickListener filmItemClickListener, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.ui.list.adapter.FilmsListAdapter.FilmItemLongClickListener filmItemLongClickListener) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskViewer.data.model.Film> films) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskViewer.ui.list.adapter.FilmViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskViewer.ui.list.adapter.FilmViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskViewer.data.model.Film> getItems() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemClickListener;", "", "openFilmDetails", "", "id", "", "app_debug"})
    public static abstract interface FilmItemClickListener {
        
        public abstract void openFilmDetails(int id);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinopoiskViewer/ui/list/adapter/FilmsListAdapter$FilmItemLongClickListener;", "", "markAsFavorite", "", "film", "Lcom/example/kinopoiskViewer/data/model/Film;", "app_debug"})
    public static abstract interface FilmItemLongClickListener {
        
        public abstract void markAsFavorite(@org.jetbrains.annotations.NotNull()
        com.example.kinopoiskViewer.data.model.Film film);
    }
}