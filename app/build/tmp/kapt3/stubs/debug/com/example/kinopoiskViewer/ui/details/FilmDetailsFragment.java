package com.example.kinopoiskViewer.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J8\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kinopoiskViewer/ui/details/FilmDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/kinopoiskViewer/databinding/FragmentFilmDetailsBinding;", "filmDetailsViewModel", "Lcom/example/kinopoiskViewer/ui/details/FilmDetailsViewModel;", "sendText", "", "getSendText", "()Ljava/lang/String;", "setSendText", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "renderFilm", "name", "year", "genres", "country", "description", "previewUrl", "Companion", "app_debug"})
public final class FilmDetailsFragment extends androidx.fragment.app.Fragment {
    private com.example.kinopoiskViewer.ui.details.FilmDetailsViewModel filmDetailsViewModel;
    private com.example.kinopoiskViewer.databinding.FragmentFilmDetailsBinding binding;
    public java.lang.String sendText;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskViewer.ui.details.FilmDetailsFragment.Companion Companion = null;
    
    public FilmDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSendText() {
        return null;
    }
    
    public final void setSendText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void renderFilm(java.lang.String name, java.lang.String year, java.lang.String genres, java.lang.String country, java.lang.String description, java.lang.String previewUrl) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kinopoiskViewer/ui/details/FilmDetailsFragment$Companion;", "", "()V", "newInstance", "Lcom/example/kinopoiskViewer/ui/details/FilmDetailsFragment;", "id", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskViewer.ui.details.FilmDetailsFragment newInstance(int id) {
            return null;
        }
    }
}