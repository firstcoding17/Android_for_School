package com.example.appsu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
private static final int VERSION = 0;
private static final  String DB_name = "school.db";
SQLiteDatabase mDB = null;


    public DBhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mDB = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE subject_sechedule(_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id INTEGER, do BOOL");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Cursor select(String query){
        return mDB.rawQuery(query,null);
    }

}
