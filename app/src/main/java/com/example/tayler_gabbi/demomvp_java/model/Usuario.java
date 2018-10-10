package com.example.tayler_gabbi.demomvp_java.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    private Long idUsu;

    private String nombre;
    private String contrasenia;

    public Usuario( String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }
}
