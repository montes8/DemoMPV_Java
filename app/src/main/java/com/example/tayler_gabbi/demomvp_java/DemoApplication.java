package com.example.tayler_gabbi.demomvp_java;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.example.tayler_gabbi.demomvp_java.database.DataBase;

public class DemoApplication extends Application{

    public static DataBase dataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        dataBase = Room.databaseBuilder(this,DataBase.class,"demo_database.db")
                .build();
    }
}
