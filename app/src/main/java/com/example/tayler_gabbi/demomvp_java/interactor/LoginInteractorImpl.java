package com.example.tayler_gabbi.demomvp_java.interactor;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.tayler_gabbi.demomvp_java.DemoApplication;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginFinishedListener;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginInteractor;
import com.example.tayler_gabbi.demomvp_java.model.Usuario;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String userName, final String password, final LoginFinishedListener listener) {


        Thread hiloRegister = new Thread(new Runnable() {
            @Override
            public void run() {

                final Usuario usuario = DemoApplication.dataBase.usuarioDao().userLOgin(userName,password);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if(TextUtils.isEmpty(userName)){
                            listener.onUserNameError();
                            return;
                        }
                        if(TextUtils.isEmpty(password)){
                            listener.onPasswordError();
                            return;
                        }
                        if(usuario == null){

                            listener.onUsuarioNull();
                        }
                        listener.onSuccess();
                    }
                }, 1000);

            }
        }) ;

        hiloRegister.start();

    }
}
