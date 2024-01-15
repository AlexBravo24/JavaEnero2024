package com;

public class Espada {
	
	private String nombre;
	private double da�o;
	private double puntosderesistencia;
	
	public Espada() {
		
	}

	public Espada(String nombre, double da�o, double puntosderesistencia) {
		super();
		this.nombre = nombre;
		this.da�o = da�o;
		this.puntosderesistencia = puntosderesistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDa�o() {
		return da�o;
	}

	public void setDa�o(double da�o) {
		this.da�o = da�o;
	}

	public double getPuntosderesistencia() {
		return puntosderesistencia;
	}

	public void setPuntosderesistencia(double puntosderesistencia) {
		this.puntosderesistencia = puntosderesistencia;
	}

	@Override
	public String toString() {
		return "Espada [nombre=" + nombre + ", da�o=" + da�o + ", puntosderesistencia=" + puntosderesistencia + "]";
	}

	
	
}
