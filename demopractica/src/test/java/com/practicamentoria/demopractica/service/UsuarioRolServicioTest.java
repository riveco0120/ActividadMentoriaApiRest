package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.UsuarioRol;
import com.practicamentoria.demopractica.repositorie.IUsuarioRolRepository;
import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UsuarioRolServicioTest {

    @Autowired
    IUsuarioRolRepository usuarioRolRepository;

    @Test
    @Name("Test para guardar usuario")
    public void testGuardarUsuario(){
        UsuarioRol usuarioModel=new UsuarioRol("Ingeniero");
        UsuarioRol usuarioModelRegistrado = usuarioRolRepository.save(usuarioModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    @Name("Test para buscar por id")
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<UsuarioRol> usuarioModelBuscado= usuarioRolRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getRol()).isEqualTo(idBuscado);
    }
}