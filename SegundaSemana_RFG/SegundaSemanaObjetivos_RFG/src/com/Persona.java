package com;

public class Persona {

	//Esta es una clase que nos va a servir como plantilla para crear nuevos objetos Persona
	//Utilizaremos ABSTRACCÓN para modelar los atributos de mi objeto aquí
	
	//Atributos:
	//Modificadores de acceso(Encapsular): public,prrivate,protected y default
	private String nombre;
	private int edad; 
	private String nacionalidad;
	private double altura;
	private double peso;
	
	public Persona() {
		this.nombre = "";
	}

	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}

	
	
	public Persona(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
}
