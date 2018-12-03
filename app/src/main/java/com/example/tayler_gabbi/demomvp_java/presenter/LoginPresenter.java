package com.example.tayler_gabbi.demomvp_java.presenter;


import com.example.tayler_gabbi.demomvp_java.database.UsuarioDao;

public interface LoginPresenter {

    void perfomLogin(String userName, String password, UsuarioDao usuarioDao);
}
