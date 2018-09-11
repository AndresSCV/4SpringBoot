package com.funlam.web.cursos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String nombre;
	private int precio;
	private int duracion_horas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDuracion_horas() {
		return duracion_horas;
	}

	public void setDuracion_horas(int duracion_horas) {
		this.duracion_horas = duracion_horas;
	}

	public Curso(int id, String nombre, int precio, int duracion_horas) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.duracion_horas = duracion_horas;
	}

	public Curso() {
	}

}
