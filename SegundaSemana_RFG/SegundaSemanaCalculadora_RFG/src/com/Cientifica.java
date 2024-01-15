package com;

public class Cientifica extends Calculadora implements ITermometro{
	
	private String modelo;
	private int serie;
	
	public Cientifica() {
		
	}
	
	public Cientifica(String modelo, int serie) {
		super();
		this.modelo = modelo;
		this.serie = serie;
	}

	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	
	
	@Override
	public String toString() {
		return "Cientifica [modelo=" + modelo + ", serie=" + serie + "]";
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es: "+(a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("La resta es: "+(a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de la multiplicación es: "+(a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("El resultado de la división es: "+(a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura");
		
	}
}
