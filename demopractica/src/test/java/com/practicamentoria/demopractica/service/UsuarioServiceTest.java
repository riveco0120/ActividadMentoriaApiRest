package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.repositorie.IUsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UsuarioServiceTest {

    @Autowired
    IUsuarioRepository usuarioRepository;
    @Test
    public void testGuardarUsuario(){
        Usuario usuarioModel=new Usuario("aquaman","aqua@gmail.com",99);
        Usuario usuarioModelRegistrado = usuarioRepository.save(usuarioModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<Usuario> usuarioModelBuscado=usuarioRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getIdUsuario()).isEqualTo(idBuscado);
    }

    @Test
    public void testListarUsuarios(){
        List<Usuario> usuarioModelList=(List<Usuario>) usuarioRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }

    @Test void testObtenerPrioridad(){

    }
    
}