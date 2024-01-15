package com;

public class Carro {
	
	private String modelo;
	private int a�o;
	private double precio;
	private String color;
	private String marca;
	
	public Carro() {
		
	}

	public Carro(String modelo, int a�o, double precio, String color, String marca) {
		super();
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
		this.color = color;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", a�o=" + a�o + ", precio=" + precio + ", color=" + color + ", marca="
				+ marca + "]";
	}
	
	
	

}
