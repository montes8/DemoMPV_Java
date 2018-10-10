package com.example.tayler_gabbi.demomvp_java.interfaces;

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPasswordError();

    void setUsuarioNull();

    void navigateToHome();
}
