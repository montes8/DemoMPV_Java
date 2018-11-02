package com.example.tayler_gabbi.demomvp_java.interfaces;

public interface LoginInteractor {

    void validateUser(String user, String password, OnLoginFinishListener listener);
}
