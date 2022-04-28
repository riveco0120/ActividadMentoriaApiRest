package com.practicamentoria.demopractica.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "roles")
public class UsuarioRol{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long idRol;

    private String rol;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = Usuario.class,
            optional = false)
    @JoinColumn(name = "usuarioID", nullable = false)
    @JsonBackReference
    private Usuario usuario;

    public UsuarioRol() {
    }

    public UsuarioRol(String rol) {
        this.rol = rol;
    }
    
}
