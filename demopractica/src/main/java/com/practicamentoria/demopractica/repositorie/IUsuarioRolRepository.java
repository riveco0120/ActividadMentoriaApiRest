package com.practicamentoria.demopractica.repositorie;

import com.practicamentoria.demopractica.models.UsuarioRol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRolRepository extends CrudRepository<UsuarioRol,Long> {
}
