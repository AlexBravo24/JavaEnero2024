package com;

public class EspadaDeFuego extends Espada {
	
	private String habilidad;
	private String da�oadicional;
	private String resistenciaadicional;
	
	public EspadaDeFuego() {
		
	}

	public EspadaDeFuego(String nombre, double da�o, double puntosderesistencia, String habilidad, String da�oadicional,
			String resistenciaadicional) {
		super(nombre, da�o, puntosderesistencia);
		this.habilidad = habilidad;
		this.da�oadicional = da�oadicional;
		this.resistenciaadicional = resistenciaadicional;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getDa�oadicional() {
		return da�oadicional;
	}

	public void setDa�oadicional(String da�oadicional) {
		this.da�oadicional = da�oadicional;
	}

	public String getResistenciaadicional() {
		return resistenciaadicional;
	}

	public void setResistenciaadicional(String resistenciaadicional) {
		this.resistenciaadicional = resistenciaadicional;
	}

	@Override
	public String toString() {
		return "EspadaDeFuego [habilidad=" + habilidad + ", da�oadicional=" + da�oadicional + ", resistenciaadicional="
				+ resistenciaadicional + ", toString()=" + super.toString() + "]";
	}
	
	

}
