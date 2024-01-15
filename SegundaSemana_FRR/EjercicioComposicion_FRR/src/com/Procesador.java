package com;

public class Procesador {

	private String marca;
	private double frecuencia;
	
	public Procesador() {
		
	}

	public Procesador(String marca, double frecuencia) {
		super();
		this.marca = marca;
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", frecuencia=" + frecuencia + "]";
	}
	
	
	
}
