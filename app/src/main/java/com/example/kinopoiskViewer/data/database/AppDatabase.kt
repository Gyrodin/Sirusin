package com.example.kinopoiskViewer.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [FilmDB::class], version = 1)
@TypeConverters(FilmTypeConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun filmDao(): FilmDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        private const val DATABASE_NAME = "filmdb"

        fun init(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room
                        .databaseBuilder(
                            context,
                            AppDatabase::class.java,
                            DATABASE_NAME
                        ).build()
                }
            }

            return INSTANCE!!
        }

        fun getDatabase() = INSTANCE!!
    }

}