package org.cscarella.springcloud.msvc.cursos.repositories;

import org.cscarella.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface ICursoRepository extends CrudRepository<Curso, Long> {
}
