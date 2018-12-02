package com.example.tayler_gabbi.demomvp_java.presenter;

import com.example.tayler_gabbi.demo_mvp_simple.database.ConexionSQLiteHelper;

public interface LoginPresenter {

    void perfomLogin(String userName, String password, ConexionSQLiteHelper conn);
}
