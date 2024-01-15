package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String origen;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String origen) {
		super();
		this.marca = marca;
		this.color = color;
		this.origen = origen;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", origen=" + origen + "]";
	}
	
	public abstract void sumar();
	
	public abstract void restar();
	
	public abstract void multiplicar();
	
	public abstract void dividir();

}
