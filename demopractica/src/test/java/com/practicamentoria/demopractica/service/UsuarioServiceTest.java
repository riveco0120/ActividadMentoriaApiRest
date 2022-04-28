package com.practicamentoria.demopractica.service;

import com.practicamentoria.demopractica.models.Usuario;
import com.practicamentoria.demopractica.repositorie.IUsuarioRepository;
import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UsuarioServiceTest {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @Test
    @Name("Test para guardar usuario")
    public void testGuardarUsuario(){
        Usuario usuarioModel=new Usuario("aquaman","aqua@gmail.com",99);
        Usuario usuarioModelRegistrado = usuarioRepository.save(usuarioModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    @Name("Test para buscar por id")
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<Usuario> usuarioModelBuscado=usuarioRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getIdUsuario()).isEqualTo(idBuscado);
    }

    @Test
    @Name("Test para listar todos")
    public void testListarUsuarios(){
        List<Usuario> usuarioModelList=(List<Usuario>) usuarioRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }

    @Test
    @Name("Test para actualizar")
    @Rollback(false)
    void testActualizarUsuario(){
        Long idUsuario=1L;
        String nombre ="Richard Vellojin coneo";//Nuevo nombre
        String email ="richardvellojin@correo.com";//Nuevo correo
        int prioridad=2;
        Usuario usuarioUno = new Usuario(nombre,email,prioridad);//valores nuevos
        usuarioUno.setIdUsuario(idUsuario);//Agregando valor id
        usuarioRepository.save(usuarioUno);//Agregando usuario

        Optional<Usuario> usuarioActualizado = usuarioRepository.findById(idUsuario);
        assertThat(usuarioActualizado.get().getNombre()).isEqualTo(nombre);

    }


    @Test
    @Name("Test para eliminar usuario")
    @Rollback(false)
    void testEliminarUsuario(){
        Long idUsuario=1L;//ID del usuario a eliminar
        //Verificando si existe el usuario con ese id
        boolean eliminarExistente= usuarioRepository.findById(idUsuario).isPresent();
        usuarioRepository.deleteById(idUsuario);//pasando al repositorio el id del usuario a eliminar
        //Verificando que no existe depues de eliminar
        boolean noExisteDespuesDeEliminar= usuarioRepository.findById(idUsuario).isPresent();
        assertTrue(eliminarExistente);
        assertFalse(noExisteDespuesDeEliminar);

    }

}