package com.nabaetechnology.inovasipembelajaran;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBKonsep extends SQLiteAssetHelper {
    private static final String DATABASE_NAME="materi_db.sqlite";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_NAME="peta_konsep";
    private static final String KEY_ID="ID";
    private static final String KEY_ISI ="isi";

    public DBKonsep(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    public boolean isNull(){
        SQLiteDatabase db = this.getWritableDatabase();
        String count = "SELECT count(*) FROM "+TABLE_NAME+"";
        Cursor mcursora = db.rawQuery(count, null);
        mcursora.moveToFirst();
        int icounta = mcursora.getInt(0);
        db.close();
        return icounta <= 0;
    }

    //untuk mendapatkan data
    @SuppressLint("Range")
    public Materi findMateri()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(TABLE_NAME,new
                String[]{KEY_ID, KEY_ISI},null,null,null,null,null);
        Materi u=new Materi();
        if (cursor!=null && cursor.moveToFirst())
        {
            cursor.moveToFirst();
            u.setId(cursor.getInt(cursor.getColumnIndex("ID")));
            u.setIsi(cursor.getString(cursor.getColumnIndex("isi")));
            ;
        }else
        {
            u.setId(0);
            u.setIsi("");
        }
        db.close();
        return u;
    }
}