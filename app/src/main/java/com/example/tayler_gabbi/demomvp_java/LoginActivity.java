package com.example.tayler_gabbi.demomvp_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity implements LoginView{

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

        presenter = new LoginPresenterImpl(this);

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
    public void setErrorUser() {

        editUser.setError("Campo Obligatorio");

    }

    @Override
    public void setErrorPassword() {

        editPass.setError("Campo Obligatorio");

    }

    @Override
    public void navigationToHome() {

      Intent intent = new Intent(this,HomeActivity.class);
      startActivity(intent);

    }

    //metodo click
    public void validacion(View v){

        presenter.validateusuario(editUser.getText().toString(),editPass.getText().toString());
    }
}
