// Generated by view binder compiler. Do not edit!
package com.example.kinopoiskViewer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kinopoiskViewer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFilmDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView countries;

  @NonNull
  public final ScrollView crollView;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView genres;

  @NonNull
  public final TextView nameRu;

  @NonNull
  public final ImageView posterPreview;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Toolbar toolbar1;

  @NonNull
  public final TextView year;

  private FragmentFilmDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView countries, @NonNull ScrollView crollView, @NonNull TextView description,
      @NonNull TextView genres, @NonNull TextView nameRu, @NonNull ImageView posterPreview,
      @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar1, @NonNull TextView year) {
    this.rootView = rootView;
    this.countries = countries;
    this.crollView = crollView;
    this.description = description;
    this.genres = genres;
    this.nameRu = nameRu;
    this.posterPreview = posterPreview;
    this.progressBar = progressBar;
    this.toolbar1 = toolbar1;
    this.year = year;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFilmDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFilmDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_film_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFilmDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.countries;
      TextView countries = ViewBindings.findChildViewById(rootView, id);
      if (countries == null) {
        break missingId;
      }

      id = R.id.crollView;
      ScrollView crollView = ViewBindings.findChildViewById(rootView, id);
      if (crollView == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.genres;
      TextView genres = ViewBindings.findChildViewById(rootView, id);
      if (genres == null) {
        break missingId;
      }

      id = R.id.name_ru;
      TextView nameRu = ViewBindings.findChildViewById(rootView, id);
      if (nameRu == null) {
        break missingId;
      }

      id = R.id.poster_preview;
      ImageView posterPreview = ViewBindings.findChildViewById(rootView, id);
      if (posterPreview == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.toolbar1;
      Toolbar toolbar1 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar1 == null) {
        break missingId;
      }

      id = R.id.year;
      TextView year = ViewBindings.findChildViewById(rootView, id);
      if (year == null) {
        break missingId;
      }

      return new FragmentFilmDetailsBinding((ConstraintLayout) rootView, countries, crollView,
          description, genres, nameRu, posterPreview, progressBar, toolbar1, year);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}