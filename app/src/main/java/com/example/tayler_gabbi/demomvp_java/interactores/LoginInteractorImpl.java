package com.example.tayler_gabbi.demomvp_java.interactores;

import android.os.Handler;
import android.text.TextUtils;

import com.example.tayler_gabbi.demomvp_java.interfaces.LoginInteractor;
import com.example.tayler_gabbi.demomvp_java.interfaces.OnLoginFinishListener;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void validateUser(final String user, final String password, final OnLoginFinishListener listener) {


        if(TextUtils.isEmpty(user)){
            listener.userNameError();
            return;
        }
        if(TextUtils.isEmpty(password)){
            listener.passwordError();
            return;
        }

        listener.exitOperacion();

    }
}
