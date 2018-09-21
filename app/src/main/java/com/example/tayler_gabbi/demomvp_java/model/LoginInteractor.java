package com.example.tayler_gabbi.demomvp_java.model;

public interface LoginInteractor {

    interface  OnLoginFinishedListener{

        void onUserNameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String userName,String password,OnLoginFinishedListener listener);
}
