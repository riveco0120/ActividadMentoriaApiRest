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

    @ManyToOne(optional = false)
    @JoinColumn(name = "idUsuario")
    private Usuario role;

    public UsuarioRol() {
    }

    public UsuarioRol(String rol) {
        this.rol = rol;
    }
}
