package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private double precio;
	private String color;
	private String marca;
	
	public Cientifica () {
		
		
	}

	public Cientifica(String marca, String color, String modelo, String tamaño, String tipo, double precio,
			String color2, String marca2) {
		super(marca, color, modelo, tamaño, tipo);
		this.precio = precio;
		color = color2;
		marca = marca2;
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
		return "Cientifica [precio=" + precio + ", color=" + color + ", marca=" + marca + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("El resultado de la suma " + a + " + " + b + " es = " + (a+b) );	
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de la resta " + a + " - " + b + " es = " + (a-b) );
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de la multiplicacion " + a + " * " + b + " es = " + (a*b) );
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("El resultado de la division " + a + " / " + b + " es = " + (a/b) );
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}

}
	

