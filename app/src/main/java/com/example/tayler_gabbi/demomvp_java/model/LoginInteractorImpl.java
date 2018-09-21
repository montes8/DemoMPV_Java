package com.example.tayler_gabbi.demomvp_java.model;


import android.os.Handler;
import android.text.TextUtils;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String userName, final String password, final OnLoginFinishedListener listener) {

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
                listener.onSuccess();
            }
        }, 1000);
    }
}
