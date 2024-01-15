package com;

public class Perro extends Animal {

	private String raza;
	private int edad;
	
	public Perro() {}

	public Perro(String nombre, int peso, String color, String raza, int edad) {
		super(nombre, peso, color);
		this.raza = raza;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", edad=" + edad + ", toString()=" + super.toString() + "]";
	}
	
	
}
