package org.cscarella.springcloud.msvc.cursos.services;

import org.cscarella.springcloud.msvc.cursos.models.Usuario;
import org.cscarella.springcloud.msvc.cursos.models.entity.Curso;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ICursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    Optional<Usuario> asignarUsuario(Usuario usuario, Long idCurso); //ASIGNA USUARIO EXISTENTE EN MSVC USUARIO
    Optional<Usuario> crearUsuario(Usuario usuario, Long idCurso); //USUARIO NO EXISTENTE EN MSVC USUARIO
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long idCurso); //ELIMINA USUARIO DEL CURSO
}
