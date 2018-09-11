package com.funlam.web.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursosApplication {

	public static void main(String[] args) {
		System.out.println("localhost:8080/curso/");
		SpringApplication.run(CursosApplication.class, args);
	}
}
