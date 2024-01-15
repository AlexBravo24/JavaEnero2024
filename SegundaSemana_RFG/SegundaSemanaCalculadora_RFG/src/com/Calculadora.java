package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private int año;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
	}
	
	public abstract void sumar(int a, int b);
	
	public abstract void restar(int a, int b);
	
	public abstract void multiplicar(int a, int b);
	
	public abstract void dividir(int a, int b);
	
}
