package com.example.kinopoiskViewer

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kinopoiskViewer.data.database.AppDatabase
import com.example.kinopoiskViewer.ui.details.FilmDetailsFragment
import com.example.kinopoiskViewer.ui.list.FilmsListFragment

class MainActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_KEY_OPEN_DESCRIPTION: String = "KEY_OPEN_DESCRIPTION"
        const val ARG_FILM_ID: String = "ARG_FILM_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        when (resources.configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                if (savedInstanceState == null) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container_list, FilmsListFragment.newInstance())
                        .commit()
                }
            }
            Configuration.ORIENTATION_PORTRAIT -> {
                if (savedInstanceState == null) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container_list, FilmsListFragment.newInstance())
                        .commit()
                }
            }
            else -> Unit
        }
        AppDatabase.init(applicationContext)

        supportFragmentManager.setFragmentResultListener(REQUEST_KEY_OPEN_DESCRIPTION, this) { _, result ->
            val filmId = result.getInt(ARG_FILM_ID, 0)
            val container = if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                R.id.fragment_container_list
            } else {
                R.id.fragment_container_description
            }
            val detailsFragment = FilmDetailsFragment.newInstance(filmId)
            supportFragmentManager.beginTransaction()
                .add(container, detailsFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}