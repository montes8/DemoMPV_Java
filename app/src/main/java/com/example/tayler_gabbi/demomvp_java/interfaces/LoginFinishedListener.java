package com.example.tayler_gabbi.demomvp_java.interfaces;

public interface LoginFinishedListener {

    void onUserNameError();

    void onPasswordError();

    void onUsuarioNull();

    void onSuccess();
}
