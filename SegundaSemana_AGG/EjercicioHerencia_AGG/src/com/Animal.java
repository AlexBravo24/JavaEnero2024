package com;

public class Animal {
	
	private String nombre;
	private int peso;
	private String color;
	
	public Animal () {}

	public Animal(String nombre, int peso, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", color=" + color + "]";
	}
	
	

}
