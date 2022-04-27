package com.practicamentoria.demopractica.controller;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.service.UsuarioRolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class UsuarioRolController {
    @Autowired
    UsuarioRolServicio usuarioRolService;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuario(){
        return usuarioRolService.obtenerUsuariosRol();
    }

    @PostMapping()
    public Usuario guardar(@RequestBody Usuario usuario){
        return usuarioRolService.guardarUsuarioRol(usuario);
    }

    @GetMapping(path = "/get/{id}/")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioRolService.obtenerPorIdRol(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioRolService.eliminarUsuarioRol(id);
        if(ok){
            return "Se selimino el Rol";
        }
        else {
            return "No se ha eliminado el Rol";
        }
    }

    @PutMapping(value = "/actualizar/")
    public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
        return usuarioRolService.actualizarUsuarioRol(usuario);
    }

}
