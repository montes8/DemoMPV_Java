package com.example.tayler_gabbi.demomvp_java.interfaces;

public interface LoginInteractor {

    void login(String userName,String password,LoginFinishedListener listener);
}
