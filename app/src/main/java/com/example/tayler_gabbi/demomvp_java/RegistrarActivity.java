package com.example.tayler_gabbi.demomvp_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tayler_gabbi.demomvp_java.model.PresenterImpl;
import com.example.tayler_gabbi.demomvp_java.model.PresenterRegistrarImpl;
import com.example.tayler_gabbi.demomvp_java.presenter.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.presenter.RegistrarPresenter;
import com.example.tayler_gabbi.demomvp_java.view.RegistrarView;

public class RegistrarActivity extends AppCompatActivity implements RegistrarView{

    private EditText nombre,usuario,contrasenia;
    private Button btnRegistrar;
    private RegistrarPresenter registrarPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        nombre = findViewById(R.id.edit_text_name);
        usuario = findViewById(R.id.edit_text_usuario);
        contrasenia = findViewById(R.id.edit_text_password);
        btnRegistrar = findViewById(R.id.button_register_ingresar);


        registrarPresenter = new PresenterRegistrarImpl(this);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registrarPresenter.registrarUsuario(nombre.getText().toString(),usuario.getText().toString(),contrasenia.getText().toString());
            }
        });


    }

    @Override
    public void registrarSuccess() {

    }

    @Override
    public void nameError() {

    }

    @Override
    public void usuarioError() {

    }

    @Override
    public void passwordError() {

    }

    @Override
    public void registerError() {

    }
}
