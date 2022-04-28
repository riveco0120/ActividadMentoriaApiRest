package com.practicamentoria.demopractica.controller;

import com.practicamentoria.demopractica.repositorie.IUsuarioRepository;
import com.practicamentoria.demopractica.repositorie.IUsuarioRolRepository;
import com.practicamentoria.demopractica.service.UsuarioRolServicio;
import com.practicamentoria.demopractica.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UsuarioRolControllerTest {
    @MockBean
    IUsuarioRolRepository usuarioRepository;

    @Autowired
    UsuarioRolServicio usuarioService;

    @Test
    public void testUsuarioMock(){
        when(usuarioRepository.findAll()).thenReturn(new ArrayList<>());
        assertThat(usuarioService.obtenerUsuariosRol()).isEmpty();
        verify(usuarioRepository).findAll();
    }

}