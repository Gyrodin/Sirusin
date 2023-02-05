package com.example.kinopoiskViewer.data.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.kinopoiskViewer.data.database.FilmTypeConverters.class})
@androidx.room.Database(entities = {com.example.kinopoiskViewer.data.database.FilmDB.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinopoiskViewer/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "filmDao", "Lcom/example/kinopoiskViewer/data/database/FilmDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskViewer.data.database.AppDatabase.Companion Companion = null;
    private static com.example.kinopoiskViewer.data.database.AppDatabase INSTANCE;
    private static final java.lang.String DATABASE_NAME = "filmdb";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kinopoiskViewer.data.database.FilmDao filmDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kinopoiskViewer/data/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/example/kinopoiskViewer/data/database/AppDatabase;", "getDatabase", "init", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskViewer.data.database.AppDatabase init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskViewer.data.database.AppDatabase getDatabase() {
            return null;
        }
    }
}