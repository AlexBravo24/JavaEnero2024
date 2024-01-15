package com;

import java.util.Scanner;

public abstract class Calculadora {

	private String marca;
	private String color;
	private String modelo;
	private String tamaño;
	private String tipo;
	
	public Calculadora() {	
	}

	public Calculadora(String marca, String color, String modelo, String tamaño, String tipo) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.tipo = tipo;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", tamaño=" + tamaño
				+ ", tipo=" + tipo + "]";
	}
	
	public abstract void sumar(int a, int b);
	public abstract void restar(int a, int b);
	public abstract void multiplicar(int a, int b);
	public abstract void dividir(int a, int b);
	}
