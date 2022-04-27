package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.repositorie.IUsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolServicios {

    @Autowired
    IUsuarioRolRepository iUsuarioRolRepository;


    public ArrayList<Usuario> obtenerUsuariosRol() {
        return (ArrayList<Usuario>)   iUsuarioRolRepository.findAll();
    }

    public Usuario guardarUsuarioRol(Usuario usuario) {

        return iUsuarioRolRepository.save(usuario);
    }

    public Optional<Usuario> obtenerPorIdRol(Long id) {

        return iUsuarioRolRepository.findById(id);
    }


    public boolean eliminarUsuarioRol(Long id) {
        try {
            iUsuarioRolRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Usuario actualizarUsuarioRol(Usuario usuario){
        return  iUsuarioRolRepository.save(usuario);

    }

}
