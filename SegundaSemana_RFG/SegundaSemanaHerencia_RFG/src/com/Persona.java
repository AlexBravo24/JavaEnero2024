package com;

public class Persona {

	private String nombre;
	private String genero;
	private String edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, String edad) {
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
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	public void comer() {
		System.out.println("Estoy comiendo...");
	}
	
	public String respirar() {
		return "Estoy respirando...";
	}
	
	public void comer(String comida) {
		System.out.println("Estoy comiendo "+comida);
	}
	
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo "+cantidad+" raciones de "+comida);
	}
}
