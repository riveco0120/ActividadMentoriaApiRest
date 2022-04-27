package com.practicamentoria.demopractica.controller;


import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuario(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario guardar(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Usuario> obtenerUsuarioPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se selimino el usuario";
        }
        else {
            return "No se ha eliminado el usuario";
        }
    }

    
}
