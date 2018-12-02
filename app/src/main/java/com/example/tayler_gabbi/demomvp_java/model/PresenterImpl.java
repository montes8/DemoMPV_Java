package com.example.tayler_gabbi.demomvp_java.model;

import android.text.TextUtils;

import com.example.tayler_gabbi.demomvp_java.presenter.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.view.LoginView;


public class PresenterImpl implements LoginPresenter {

    LoginView loginView;

    public PresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void perfomLogin(final String userName, final String password,ConexionSQLiteHelper conn) {

        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)){

            loginView.loginValidations();

        }else {

            if(conn.userLogin(userName,password)){

                loginView.loginSuccess();
            }else {

                loginView.loginError();
            }

                }
    }


}
