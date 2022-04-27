package com.practicamentoria.demopractica.repositorie;

import com.practicamentoria.demopractica.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRolRepository extends CrudRepository<Usuario,Long> {
}
