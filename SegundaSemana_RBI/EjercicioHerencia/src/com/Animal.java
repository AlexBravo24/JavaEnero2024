package com;

public class Animal {
	
	private String nombre;
	private String raza;
	private double edad;
	
	public Animal() {
		
	}

	public Animal(String nombre, String raza, double edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}
	
	

}
