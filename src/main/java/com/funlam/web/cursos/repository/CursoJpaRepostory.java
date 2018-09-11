package com.funlam.web.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.funlam.web.cursos.entity.Curso;

@Repository("cursoJpaRepository")
public interface CursoJpaRepostory  extends JpaRepository<Curso, Integer> {

	@Query("SELECT x FROM Curso x")
	public List<Curso> seleccionarTodo();
	
	@Query("SELECT x FROM Curso x where x.duracion_horas =:horas")
	public List<Curso> getCursoByCriteria(@Param("horas") int horas);
}
