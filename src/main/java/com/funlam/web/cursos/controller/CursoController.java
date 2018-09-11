package com.funlam.web.cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funlam.web.cursos.entity.Curso;
import com.funlam.web.cursos.repository.CursoJpaRepostory;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepostory cursoJpa;
	
	@GetMapping("/crear")
	public String crearCurso() {
		Curso curso = new Curso();
		//curso.setId(1); Si se quiere actualizar
		curso.setNombre("Programacion web");
		curso.setPrecio(350000);
		curso.setDuracion_horas(70);
		cursoJpa.save(curso);
		return "curso_creado";
	}
	
	@GetMapping("/consultar")
	public String consultar(Model model) {
		model.addAttribute("cursos", cursoJpa.findAll());
		return "lista_cursos";
	}
	
	@GetMapping("/consultartodos")
	public String consultartodos(Model model) {
		model.addAttribute("cursos", this.cursoJpa.seleccionarTodo());
		return "lista_cursos";
	}
	
	@GetMapping("/consultarporhoras")
	public String consultarporhoras(Model model) {
		model.addAttribute("cursos", this.cursoJpa.getCursoByCriteria(64));
		return "lista_cursos";
	}
	
	@GetMapping("/")
	public String ejemploBoostrap(Model model) {
		//model.addAttribute("cursos", this.cursoJpa.getCursoByCriteria(64));
		return "index_boostrap";
	}
}
