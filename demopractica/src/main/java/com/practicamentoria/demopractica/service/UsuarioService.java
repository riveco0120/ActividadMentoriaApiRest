package com.practicamentoria.demopractica.service;


import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.repositorie.IUsuarioRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepositorie usuarioRepository;
    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<Usuario> obtenerPorPrioridad(Integer p){
        return usuarioRepository.prioridad(p);
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return  false;
        }
    }
}
