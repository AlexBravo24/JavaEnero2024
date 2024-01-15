package com;

import java.util.Scanner;

public abstract class Calculadora {
	
	
	private String marca;
	private double precio;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, double precio, String color) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", precio=" + precio + ", color=" + color + "]";
	}
	
	public abstract void sumar ();		
	public abstract void restar ();
	public abstract void multiplicar ();
	public abstract void dividir ();
}
