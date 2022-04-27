package com.practicamentoria.demopractica.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long idRol;
    private String rol;

    private long idUsuario;

    public UsuarioRol() {
    }

    public UsuarioRol(String rol) {
        this.rol = rol;
    }
}
