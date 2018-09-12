package com.funlam.web.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funlam.web.cursos.entity.Usuario;
import com.funlam.web.cursos.repository.UsuarioJpaRepository;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

	@Autowired
	@Qualifier("usuarioJpaRepository")
	private UsuarioJpaRepository usuarioJpa;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> consultar() {
		return usuarioJpa.findAll();
	}
}
