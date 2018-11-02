package com.example.tayler_gabbi.demomvp_java.interactores;

import android.os.Handler;

import com.example.tayler_gabbi.demomvp_java.interfaces.LoginInteractor;
import com.example.tayler_gabbi.demomvp_java.interfaces.OnLoginFinishListener;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void validateUser(final String user, final String password, final OnLoginFinishListener listener) {


                if(!user.equals("") && !password.equals("")){

                    listener.exitOperacion();

                }else {
                    if (user.equals("")) {
                        listener.userNameError();
                    }else {
                        if(password.equals("")){
                            listener.passwordError();
                        }
                    }
                }
            

    }
}
