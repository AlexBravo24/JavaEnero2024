package com;

public class Escuela {
	
	private String nombre;
	private String genero;
	private String edad;
	
	public Escuela () {
		
	}

	public Escuela(String nombre, String genero, String edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	

}
