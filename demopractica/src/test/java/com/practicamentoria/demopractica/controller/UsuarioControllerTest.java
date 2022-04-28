package com.practicamentoria.demopractica.controller;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.repositorie.IUsuarioRepository;
import com.practicamentoria.demopractica.service.UsuarioService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class UsuarioControllerTest {

    @MockBean
    IUsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;

    @Test
    public void testUsuarioMock(){
        when(usuarioRepository.findAll()).thenReturn(new ArrayList<>());
        assertThat(usuarioService.obtenerUsuarios()).isEmpty();
        verify(usuarioRepository).findAll();
       }

    @Test
    @DisplayName("Test para guardar usuario")
    public void testGuardar(){
        var usuario = new Usuario("Richard","rvellojin@gmail.com",2);

       }
}