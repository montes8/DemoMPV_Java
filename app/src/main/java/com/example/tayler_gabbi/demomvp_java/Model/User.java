package com.example.tayler_gabbi.demomvp_java.Model;

import android.text.TextUtils;

public class User implements IUser {

    String email,password;

    @Override
    public String getUsuario() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValisData() {



        return !TextUtils.isEmpty(getUsuario())&& !TextUtils.isEmpty(getPassword())&&
                getPassword().length()>6;
    }
}
