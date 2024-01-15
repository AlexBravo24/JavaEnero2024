package com;

public class AlmacenamientoInterno {

	private String fabricante;
	private String tipo;
	private double velocidad;
	private double capacidad;

	public AlmacenamientoInterno() {

	}

	public AlmacenamientoInterno(String fabricante, String tipo, double velocidad, double capacidad) {
		super();
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "AlmacenamientoInterno [fabricante=" + fabricante + ", tipo=" + tipo + ", velocidad=" + velocidad
				+ ", capacidad=" + capacidad + "]";
	}

}
