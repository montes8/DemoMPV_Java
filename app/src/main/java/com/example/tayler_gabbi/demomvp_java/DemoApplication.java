package com.example.tayler_gabbi.demomvp_java;

import android.app.Application;

import com.example.tayler_gabbi.demomvp_java.database.DaoMaster;
import com.example.tayler_gabbi.demomvp_java.database.DaoSession;

import org.greenrobot.greendao.database.Database;

public class DemoApplication extends Application{

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"mydb");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
