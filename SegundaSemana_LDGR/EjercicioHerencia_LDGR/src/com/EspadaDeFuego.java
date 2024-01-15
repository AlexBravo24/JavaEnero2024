package com;

public class EspadaDeFuego extends Espada {
	
	private String habilidad;
	private String daņoadicional;
	private String resistenciaadicional;
	
	public EspadaDeFuego() {
		
	}

	public EspadaDeFuego(String nombre, double daņo, double puntosderesistencia, String habilidad, String daņoadicional,
			String resistenciaadicional) {
		super(nombre, daņo, puntosderesistencia);
		this.habilidad = habilidad;
		this.daņoadicional = daņoadicional;
		this.resistenciaadicional = resistenciaadicional;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getDaņoadicional() {
		return daņoadicional;
	}

	public void setDaņoadicional(String daņoadicional) {
		this.daņoadicional = daņoadicional;
	}

	public String getResistenciaadicional() {
		return resistenciaadicional;
	}

	public void setResistenciaadicional(String resistenciaadicional) {
		this.resistenciaadicional = resistenciaadicional;
	}

	@Override
	public String toString() {
		return "EspadaDeFuego [habilidad=" + habilidad + ", daņoadicional=" + daņoadicional + ", resistenciaadicional="
				+ resistenciaadicional + ", toString()=" + super.toString() + "]";
	}
	
	

}
