package com.example.androiddevelopment.imenik.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by androiddevelopment on 20.3.17..
 */

public class ORMliteHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "ispit.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<Imenik, Integer> mImenikDao = null;
    private Dao<Kontakt, Integer> mKontaktDao = null;

    public ORMliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Imenik.class);
            TableUtils.createTable(connectionSource, Kontakt.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Imenik.class, true);
            TableUtils.dropTable(connectionSource, Kontakt.class, true);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }

    public Dao<Imenik, Integer> getmImenikDao() throws SQLException {
        if(mImenikDao == null) {
            mImenikDao = getDao(Imenik.class);
        }

        return mImenikDao;
    }

    public Dao<Kontakt, Integer> getmKontaktDao() throws SQLException {
        if(mKontaktDao == null) {
            mKontaktDao = getDao(Kontakt.class);
        }

        return mKontaktDao;
    }

    @Override
    public void close() {
        mImenikDao = null;
        mKontaktDao = null;

        super.close();
    }
}
