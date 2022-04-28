package com.practicamentoria.demopractica.controller;

import com.practicamentoria.demopractica.models.UsuarioRol;
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
    public ArrayList<UsuarioRol> obtenerUsuario(){
        return usuarioRolService.obtenerUsuariosRol();
    }

    @PostMapping()
    public UsuarioRol guardar(@RequestBody UsuarioRol usuarioRol){
        return usuarioRolService.guardarUsuarioRol(usuarioRol) ;
    }

    @GetMapping(path = "/get/{id}/")
    public Optional<UsuarioRol> obtenerUsuarioPorId(@PathVariable("id") Long id){
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
    public UsuarioRol actualizarUsuario(@RequestBody UsuarioRol usuarioRol) {
        return usuarioRolService.actualizarUsuarioRol(usuarioRol);
    }

}
