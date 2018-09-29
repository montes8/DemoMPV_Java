package com.example.tayler_gabbi.demomvp_java.interfaces;

public interface LoginPresenter {

    void validateCredencials(String userName,String password);

    void onDestroy();
}
