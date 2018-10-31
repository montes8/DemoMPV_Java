package com.example.tayler_gabbi.demomvp_java.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.tayler_gabbi.demomvp_java.database.model.Usuario;

import java.util.List;

@Dao
public interface UsuarioDao {

        @Query("select * from Usuario")
        List<Usuario> listaUsuario();

        @Query("select * from Usuario where nombre = :name and contrasenia = :pass")
        Usuario userLOgin(String name,String pass);

        @Query("select * from Usuario where idUsu = :id")
        Usuario verDetalleUsuarioLogeado(Long id);

        @Insert
        Long insertarUsuario(Usuario usuario);


}
