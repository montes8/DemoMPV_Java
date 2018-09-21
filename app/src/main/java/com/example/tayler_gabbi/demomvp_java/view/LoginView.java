package com.example.tayler_gabbi.demomvp_java.view;

public interface LoginView {

    void showProgress();
    
    void hideProgress();

    void setUserNameError();

    void setPasswordError();

    void navigateToHome();
}
