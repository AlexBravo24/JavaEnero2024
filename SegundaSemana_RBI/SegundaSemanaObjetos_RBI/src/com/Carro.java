package com;

public class Carro {
	
	private String modelo;
	private int año;
	private double precio;
	private String color;
	private String marca;
	
	public Carro() {
		
	}

	public Carro(String modelo, int año, double precio, String color, String marca) {
		super();
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Carro [modelo=" + modelo + ", año=" + año + ", precio=" + precio + ", color=" + color + ", marca="
				+ marca + "]";
	}
	
	
	

}
