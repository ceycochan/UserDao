package com.nshane.userdao.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.nshane.userdao.model.DBMetaData;


public class DBOpenHelper extends SQLiteOpenHelper {

    //单例模式
    private volatile static DBOpenHelper mInstance = null;

    public synchronized static DBOpenHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new DBOpenHelper(context);
        }
        return mInstance;
    }


    private DBOpenHelper(Context context) {
        super(context, DBMetaData.DATABASE_NAME, null, DBMetaData.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBMetaData.WatchTableMetaData.SQL_CREATE_TABLE);
        db.execSQL(DBMetaData.SearchWordTableMetaData.SQL_CREATE_TABLE);
        db.execSQL(DBMetaData.FavoriteTableMetaData.SQL_CREATE_TABLE);
        db.execSQL(DBMetaData.HistoryTableMetaData.SQL_CREATE_TABLE);
        LogUtil.d("DB create");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBMetaData.WatchTableMetaData.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DBMetaData.SearchWordTableMetaData.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DBMetaData.FavoriteTableMetaData.TABLE_NAME);
        onCreate(db);
        LogUtil.d("DB upgrade");
    }

}


