package com.funlam.web.cursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funlam.web.cursos.entity.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/register")
	public String registro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarioAdd";
	}
}
