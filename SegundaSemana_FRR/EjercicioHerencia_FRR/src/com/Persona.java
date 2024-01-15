package com;

public class Persona {
	
	private String genero;
	private String nombre;
	private int edad;
	
	public Persona () {
		
	}

	public Persona(String genero, String nombre, int edad) {
		super();
		this.genero = genero;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
