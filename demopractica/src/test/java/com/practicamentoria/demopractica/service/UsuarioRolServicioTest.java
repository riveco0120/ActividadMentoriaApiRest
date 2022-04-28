package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.models.UsuarioRol;
import com.practicamentoria.demopractica.repositorie.IUsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UsuarioRolServicioTest {

    @Autowired
    IUsuarioRolRepository usuarioRolRepository;

    @Test
    void obtenerUsuariosRol() {
    }

    @Test
    void guardarUsuarioRol() {
        UsuarioRol usuarioRol=new UsuarioRol("campintero");
        UsuarioRol usuarioRolModelRegistrado = usuarioRolRepository.save(usuarioRol);
        assertNotNull(usuarioRolModelRegistrado);
    }

    @Test
    void obtenerPorIdRol() {
    }
}