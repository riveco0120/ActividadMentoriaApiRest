package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.UsuarioRol;
import com.practicamentoria.demopractica.repositorie.IUsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolServicio {

    @Autowired
    IUsuarioRolRepository iUsuarioRolRepository;

    public ArrayList<UsuarioRol> obtenerUsuariosRol() {
        return (ArrayList<UsuarioRol>) iUsuarioRolRepository.findAll();
    }

    public UsuarioRol guardarUsuarioRol(UsuarioRol usuarioRol) {

        return iUsuarioRolRepository.save(usuarioRol);
    }

    public Optional<UsuarioRol> obtenerPorIdRol(Long id) {

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

    public UsuarioRol actualizarUsuarioRol(UsuarioRol usuarioRol){
        return  iUsuarioRolRepository.save(usuarioRol);

    }

}
