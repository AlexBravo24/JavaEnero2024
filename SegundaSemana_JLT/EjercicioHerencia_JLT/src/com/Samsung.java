package com;

public class Samsung extends Telefono {
	
	private String compañia;
	private double pixeles;
	private double capacidad;
	private String tamaño;
	
	public Samsung () {
		
	}

	public Samsung(String marca, String gamma, String color, String compañia, double pixeles, double capacidad,
			String tamaño) {
		super(marca, gamma, color);
		this.compañia = compañia;
		this.pixeles = pixeles;
		this.capacidad = capacidad;
		this.tamaño = tamaño;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public double getPixeles() {
		return pixeles;
	}

	public void setPixeles(double pixeles) {
		this.pixeles = pixeles;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Samsung [compañia=" + compañia + ", pixeles=" + pixeles + ", capacidad=" + capacidad + ", tamaño="
				+ tamaño + ", toString()=" + super.toString() + "]";
	}

	
}
