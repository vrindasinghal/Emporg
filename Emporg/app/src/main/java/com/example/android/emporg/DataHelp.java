package com.example.android.emporg;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vrinda on 13-11-2017.
 */

public class DataHelp {
    SQLiteDatabase db;
    SQLiteOpenHelper mhelper;
    MyOpenHelper myhelp;

    Context context;

    public DataHelp(Context con) {
        this.context = con;
        mhelper = new MyOpenHelper(this.context);
        myhelp = new MyOpenHelper(this.context);
        this.db = mhelper.getWritableDatabase();
    }

    public Integer insertNewRecordInR(String rMobileNumber, String rName, String rEmailId, String rCompanyName, String rCompanyId, String rPassword) {

        try {
            ContentValues conV = new ContentValues();
            conV.put("r_mobileNumber", rMobileNumber);
            conV.put("r_name", rName);
            conV.put("r_emailId", rEmailId);
            conV.put("r_companyName", rCompanyName);
            conV.put("r_companyId", rCompanyId);
            conV.put("r_password", rPassword);
            db.insert(MyOpenHelper.rMaster, null, conV);
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    public Integer insertNewRecordInE(String eMobileNumber, String eName, String eEmailId, String eDesignation, String eDateOfBirth,String eGender,String eAddress, String eCompanyId, String ePassword) {

        try {
            ContentValues conV = new ContentValues();
            conV.put("e_mobileNumber", eMobileNumber);
            conV.put("e_name", eName);
            conV.put("e_emailId", eEmailId);
            conV.put("e_designation", eDesignation);
            conV.put("e_companyId", eCompanyId);
            conV.put("e_address", eGender);
            conV.put("e_dateOfBirth", eDateOfBirth);
            conV.put("e_gender", eAddress);
            conV.put("r_password", ePassword);
            db.insert(MyOpenHelper.eMaster, null, conV);
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }
}
