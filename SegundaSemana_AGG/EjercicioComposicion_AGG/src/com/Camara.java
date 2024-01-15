package com;

public class Camara {

	private double resolucion;
	private String flash;

	public Camara() {}

	public Camara(double resolucion, String flash) {
		super();
		this.resolucion = resolucion;
		this.flash = flash;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	@Override
	public String toString() {
		return "Camara [resolucion=" + resolucion + ", flash=" + flash + "]";
	}
	
	
}
