package com.example.android.emporg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vrinda on 02-11-2017.
 */

public class MyOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "myDatabase";
    private static final int DATABASE_VERSION = 1;

    public static final String rMaster = "employerMaster";
    public static final String eMaster = "employeeMaster";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + rMaster
                + "(r_mobileNumber TEXT PRIMARY KEY, r_name TEXT, r_emailId TEXT, r_companyName TEXT, r_companyId TEXT,r_password TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + eMaster
                + "(e_mobileNumber TEXT PRIMARY KEY, e_name TEXT, e_emailId TEXT, e_companyId TEXT, e_designation TEXT, e_dateOfBirth TEXT, e_gender TEXT, e_address TEXT, e_password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
