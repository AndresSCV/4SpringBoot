package com.funlam.web.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
		for (int i=0; i < 5; i++) {

			System.out.println("-----------------------------------");
		}
		System.out.println("localhost:8080/curso/");
	}
}
