package com.practicamentoria.demopractica.repositorie;

import com.practicamentoria.demopractica.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUsuarioRepositorie extends CrudRepository<Usuario,Long> {
    public abstract ArrayList<Usuario> prioridad(Integer prioridad);

}
