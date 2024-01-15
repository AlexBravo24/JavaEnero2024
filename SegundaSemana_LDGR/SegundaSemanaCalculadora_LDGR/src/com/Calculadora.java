package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
	
	// MÉTODOS ABSTRACTOS - Para que la clase que los herede, los implemente
	public abstract void sumar();
	public abstract void restar();
	public abstract void multiplicar();
	public abstract void dividir();
	
	

}
