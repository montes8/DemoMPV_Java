package com.example.tayler_gabbi.demomvp_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.tayler_gabbi.demomvp_java.model.PresenterImpl;
import com.example.tayler_gabbi.demomvp_java.presenter.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    EditText editPass,editUser;
    ProgressBar progressBar;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser = findViewById(R.id.edit_usuario);
        editPass = findViewById(R.id.edit_pasword);
        progressBar = findViewById(R.id.progressBar);

        presenter = new PresenterImpl(this);

    }


    @Override
    public void loginValidations() {

    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginError() {

    }
}
