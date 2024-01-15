package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double capacidad;
	
	public Almacenamiento() {
		// Constructor vac�o
	}

	// Constructor con todos los par�metros (fields)
	public Almacenamiento(String marca, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}

	// Getters y Setters
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

	// M�todo toString()
	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}
	
	

}
