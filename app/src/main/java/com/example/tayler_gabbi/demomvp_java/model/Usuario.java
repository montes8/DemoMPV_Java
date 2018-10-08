package com.example.tayler_gabbi.demomvp_java.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    private Long idUsu;

    private String nombre;
    private String nombreUsuario;
    private String contrasenia;
    private String pais;
}
