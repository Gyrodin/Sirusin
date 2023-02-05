package com.example.kinopoiskViewer.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kinopoiskViewer.data.model.Countries;
import com.example.kinopoiskViewer.data.model.Genres;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FilmDao_Impl implements FilmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FilmDB> __insertionAdapterOfFilmDB;

  private final FilmTypeConverters __filmTypeConverters = new FilmTypeConverters();

  private final EntityDeletionOrUpdateAdapter<FilmDB> __deletionAdapterOfFilmDB;

  private final EntityDeletionOrUpdateAdapter<FilmDB> __updateAdapterOfFilmDB;

  public FilmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFilmDB = new EntityInsertionAdapter<FilmDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `films` (`filmId`,`nameRu`,`year`,`posterUrlPreview`,`genres`,`description`,`countries`,`isFavourite`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmDB value) {
        stmt.bindLong(1, value.getFilmId());
        if (value.getNameRu() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNameRu());
        }
        if (value.getYear() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getYear());
        }
        if (value.getPosterUrlPreview() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPosterUrlPreview());
        }
        final String _tmp;
        _tmp = __filmTypeConverters.fromGenres(value.getGenres());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        final String _tmp_1;
        _tmp_1 = __filmTypeConverters.fromCountries(value.getCountries());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        final int _tmp_2;
        _tmp_2 = value.isFavourite() ? 1 : 0;
        stmt.bindLong(8, _tmp_2);
      }
    };
    this.__deletionAdapterOfFilmDB = new EntityDeletionOrUpdateAdapter<FilmDB>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `films` WHERE `filmId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmDB value) {
        stmt.bindLong(1, value.getFilmId());
      }
    };
    this.__updateAdapterOfFilmDB = new EntityDeletionOrUpdateAdapter<FilmDB>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `films` SET `filmId` = ?,`nameRu` = ?,`year` = ?,`posterUrlPreview` = ?,`genres` = ?,`description` = ?,`countries` = ?,`isFavourite` = ? WHERE `filmId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmDB value) {
        stmt.bindLong(1, value.getFilmId());
        if (value.getNameRu() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNameRu());
        }
        if (value.getYear() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getYear());
        }
        if (value.getPosterUrlPreview() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPosterUrlPreview());
        }
        final String _tmp;
        _tmp = __filmTypeConverters.fromGenres(value.getGenres());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        final String _tmp_1;
        _tmp_1 = __filmTypeConverters.fromCountries(value.getCountries());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        final int _tmp_2;
        _tmp_2 = value.isFavourite() ? 1 : 0;
        stmt.bindLong(8, _tmp_2);
        stmt.bindLong(9, value.getFilmId());
      }
    };
  }

  @Override
  public Object insertFilm(final FilmDB film, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFilmDB.insert(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAllFilms(final List<FilmDB> films,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFilmDB.insert(films);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFilm(final FilmDB film, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFilmDB.handle(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateFilm(final FilmDB film, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFilmDB.handle(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllFilms(final Continuation<? super List<FilmDB>> continuation) {
    final String _sql = "SELECT * FROM films";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FilmDB>>() {
      @Override
      public List<FilmDB> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "filmId");
          final int _cursorIndexOfNameRu = CursorUtil.getColumnIndexOrThrow(_cursor, "nameRu");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfPosterUrlPreview = CursorUtil.getColumnIndexOrThrow(_cursor, "posterUrlPreview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
          final List<FilmDB> _result = new ArrayList<FilmDB>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmDB _item;
            final int _tmpFilmId;
            _tmpFilmId = _cursor.getInt(_cursorIndexOfFilmId);
            final String _tmpNameRu;
            if (_cursor.isNull(_cursorIndexOfNameRu)) {
              _tmpNameRu = null;
            } else {
              _tmpNameRu = _cursor.getString(_cursorIndexOfNameRu);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpPosterUrlPreview;
            if (_cursor.isNull(_cursorIndexOfPosterUrlPreview)) {
              _tmpPosterUrlPreview = null;
            } else {
              _tmpPosterUrlPreview = _cursor.getString(_cursorIndexOfPosterUrlPreview);
            }
            final List<Genres> _tmpGenres;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __filmTypeConverters.toGenres(_tmp);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final List<Countries> _tmpCountries;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCountries)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCountries);
            }
            _tmpCountries = __filmTypeConverters.toCountries(_tmp_1);
            final boolean _tmpIsFavourite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_2 != 0;
            _item = new FilmDB(_tmpFilmId,_tmpNameRu,_tmpYear,_tmpPosterUrlPreview,_tmpGenres,_tmpDescription,_tmpCountries,_tmpIsFavourite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFilm(final int id, final Continuation<? super FilmDB> continuation) {
    final String _sql = "SELECT * FROM films WHERE filmId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<FilmDB>() {
      @Override
      public FilmDB call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "filmId");
          final int _cursorIndexOfNameRu = CursorUtil.getColumnIndexOrThrow(_cursor, "nameRu");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfPosterUrlPreview = CursorUtil.getColumnIndexOrThrow(_cursor, "posterUrlPreview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
          final FilmDB _result;
          if(_cursor.moveToFirst()) {
            final int _tmpFilmId;
            _tmpFilmId = _cursor.getInt(_cursorIndexOfFilmId);
            final String _tmpNameRu;
            if (_cursor.isNull(_cursorIndexOfNameRu)) {
              _tmpNameRu = null;
            } else {
              _tmpNameRu = _cursor.getString(_cursorIndexOfNameRu);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpPosterUrlPreview;
            if (_cursor.isNull(_cursorIndexOfPosterUrlPreview)) {
              _tmpPosterUrlPreview = null;
            } else {
              _tmpPosterUrlPreview = _cursor.getString(_cursorIndexOfPosterUrlPreview);
            }
            final List<Genres> _tmpGenres;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __filmTypeConverters.toGenres(_tmp);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final List<Countries> _tmpCountries;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCountries)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCountries);
            }
            _tmpCountries = __filmTypeConverters.toCountries(_tmp_1);
            final boolean _tmpIsFavourite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_2 != 0;
            _result = new FilmDB(_tmpFilmId,_tmpNameRu,_tmpYear,_tmpPosterUrlPreview,_tmpGenres,_tmpDescription,_tmpCountries,_tmpIsFavourite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
