package com.practicamentoria.demopractica.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long idUsuario;
    private String nombre;

    private String email;

    private Integer prioridad;

    private long usuarioRolId;


    @OneToMany(
            fetch = FetchType.EAGER,
            targetEntity = UsuarioRol.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "usuario"
    )
    @JsonManagedReference
    private List<UsuarioRol> usuarioRolList= new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }


}
