package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private int a�o;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, int a�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + "]";
	}
	
	public abstract void sumar(int a, int b);
	
	public abstract void restar(int a, int b);
	
	public abstract void multiplicar(int a, int b);
	
	public abstract void dividir(int a, int b);
	
}
