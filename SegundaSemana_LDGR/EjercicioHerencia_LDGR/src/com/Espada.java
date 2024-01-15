package com;

public class Espada {
	
	private String nombre;
	private double daño;
	private double puntosderesistencia;
	
	public Espada() {
		
	}

	public Espada(String nombre, double daño, double puntosderesistencia) {
		super();
		this.nombre = nombre;
		this.daño = daño;
		this.puntosderesistencia = puntosderesistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}

	public double getPuntosderesistencia() {
		return puntosderesistencia;
	}

	public void setPuntosderesistencia(double puntosderesistencia) {
		this.puntosderesistencia = puntosderesistencia;
	}

	@Override
	public String toString() {
		return "Espada [nombre=" + nombre + ", daño=" + daño + ", puntosderesistencia=" + puntosderesistencia + "]";
	}

	
	
}
