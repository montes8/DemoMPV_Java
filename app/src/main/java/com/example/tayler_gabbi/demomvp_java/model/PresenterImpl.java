package com.example.tayler_gabbi.demomvp_java.model;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.tayler_gabbi.demomvp_java.database.Usuario;
import com.example.tayler_gabbi.demomvp_java.database.UsuarioDao;
import com.example.tayler_gabbi.demomvp_java.presenter.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.view.LoginView;

import java.util.ArrayList;


public class PresenterImpl implements LoginPresenter {

    private LoginView loginView;

    public PresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void perfomLogin( String userName, String password, UsuarioDao usuarioDao) {

        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)){

            loginView.loginValidations();

        }else {

            ArrayList<Usuario> listaUsuario = (ArrayList<Usuario>) usuarioDao.queryBuilder().where(UsuarioDao.Properties.Usuario.eq(userName)).list();

                    if(listaUsuario!= null && listaUsuario.size() > 0) {

                        loginView.loginSuccess();

                    } else {

                        loginView.loginError();
                    }
                }
    }


}
