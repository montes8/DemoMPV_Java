package com.example.tayler_gabbi.demomvp_java.database.dao;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.tayler_gabbi.demomvp_java.model.Usuario;

import java.util.List;

public interface UsuarioDao {

        @Query("select * from Usuario")
        List<Usuario> listaUsuario();

        @Query("select * from Usuario where nombreUsuario = :name and contrasenia = :pass")
        Usuario userLOgin(String name,String pass);

        @Query("select * from Usuario where idUsu = :id")
        Usuario verDetalleUsuarioLogeado(Long id);

        @Insert
        Long insertarUsuario(Usuario usuario);


}
