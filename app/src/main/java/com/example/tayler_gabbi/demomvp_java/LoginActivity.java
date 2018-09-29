package com.example.tayler_gabbi.demomvp_java;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.tayler_gabbi.demomvp_java.interactor.LoginInteractorImpl;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.presenter.LoginPresenterImpl;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginView;

public class LoginActivity extends Activity implements LoginView, View.OnClickListener{

    private ProgressBar progressBar;
    private EditText usuario;
    private EditText password;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        progressBar = findViewById(R.id.progressBar);
        usuario = findViewById(R.id.editText_usuario);
        password = findViewById(R.id.editText_password);

        findViewById(R.id.button_ingresar).setOnClickListener(this);

        presenter = new LoginPresenterImpl(this,new LoginInteractorImpl()) ;

    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {

        presenter.validateCredencials(usuario.getText().toString(),password.getText().toString());

    }

    @Override
    public void showProgress() {

        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {

        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void setUserNameError() {

        usuario.setError("error de usuario");

    }

    @Override
    public void setPasswordError() {

        password.setError("error de password");

    }

    @Override
    public void navigateToHome() {

        Toast.makeText(this,"ingreso",Toast.LENGTH_LONG).show();

    }
}
