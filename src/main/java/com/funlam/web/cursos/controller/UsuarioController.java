package com.funlam.web.cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funlam.web.cursos.entity.Usuario;
import com.funlam.web.cursos.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	@Qualifier("usuarioJpaRepository")
	private UsuarioJpaRepository usuarioJpa;
	
	@GetMapping("/register")
	public String registro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarioAdd";
	}
	
	@PostMapping("/register")
	public String saveUsuario(Usuario usuario) {
		usuarioJpa.save(usuario);
		return "usuarioShw";
	}
}
