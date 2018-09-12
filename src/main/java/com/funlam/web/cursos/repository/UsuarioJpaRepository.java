package com.funlam.web.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.funlam.web.cursos.entity.Usuario;

@Repository("usuarioJpaRepository")
public interface UsuarioJpaRepository  extends JpaRepository<Usuario, Integer> {
	
}
