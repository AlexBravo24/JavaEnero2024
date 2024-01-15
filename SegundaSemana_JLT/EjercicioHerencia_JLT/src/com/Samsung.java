package com;

public class Samsung extends Telefono {
	
	private String compa�ia;
	private double pixeles;
	private double capacidad;
	private String tama�o;
	
	public Samsung () {
		
	}

	public Samsung(String marca, String gamma, String color, String compa�ia, double pixeles, double capacidad,
			String tama�o) {
		super(marca, gamma, color);
		this.compa�ia = compa�ia;
		this.pixeles = pixeles;
		this.capacidad = capacidad;
		this.tama�o = tama�o;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Samsung [compa�ia=" + compa�ia + ", pixeles=" + pixeles + ", capacidad=" + capacidad + ", tama�o="
				+ tama�o + ", toString()=" + super.toString() + "]";
	}

	
}
