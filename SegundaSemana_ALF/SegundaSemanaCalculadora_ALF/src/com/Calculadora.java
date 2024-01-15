package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String modelo;
	private int precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String modelo, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	//metodos abstractos de calculadora
	public abstract void sumar();
	public abstract void restar();
	public abstract void multiplicar();
	public abstract void dividir();
	
	

}
