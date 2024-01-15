package com;

public class Caracteristicas extends Animal {
	
	private String color;
	private double altura;
	private double peso;
	
	public Caracteristicas() {
		
	}

	public Caracteristicas(String nombre, String raza, double edad, String color, double altura, double peso) {
		super(nombre, raza, edad);
		this.color = color;
		this.altura = altura;
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		return "Caracteristicas [color=" + color + ", altura=" + altura + ", peso=" + peso + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
