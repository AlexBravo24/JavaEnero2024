package com;

public class Memoria {
	
	private String marca,tipo;
	private double capacidad;
	
	public Memoria() {
		
	}

	public Memoria(String marca, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Memoria [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}

	
	
	
}
