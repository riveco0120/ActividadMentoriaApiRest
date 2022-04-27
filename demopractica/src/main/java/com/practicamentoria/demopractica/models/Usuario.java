package com.practicamentoria.demopractica.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long idUsuario;
    private String nombre;

    private String email;

    private Integer prioridad;

    private long usuarioRolId;

    public Usuario() {
    }

    public Usuario(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }


}
