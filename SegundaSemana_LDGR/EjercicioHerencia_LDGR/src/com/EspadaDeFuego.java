package com;

public class EspadaDeFuego extends Espada {
	
	private String habilidad;
	private String dañoadicional;
	private String resistenciaadicional;
	
	public EspadaDeFuego() {
		
	}

	public EspadaDeFuego(String nombre, double daño, double puntosderesistencia, String habilidad, String dañoadicional,
			String resistenciaadicional) {
		super(nombre, daño, puntosderesistencia);
		this.habilidad = habilidad;
		this.dañoadicional = dañoadicional;
		this.resistenciaadicional = resistenciaadicional;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getDañoadicional() {
		return dañoadicional;
	}

	public void setDañoadicional(String dañoadicional) {
		this.dañoadicional = dañoadicional;
	}

	public String getResistenciaadicional() {
		return resistenciaadicional;
	}

	public void setResistenciaadicional(String resistenciaadicional) {
		this.resistenciaadicional = resistenciaadicional;
	}

	@Override
	public String toString() {
		return "EspadaDeFuego [habilidad=" + habilidad + ", dañoadicional=" + dañoadicional + ", resistenciaadicional="
				+ resistenciaadicional + ", toString()=" + super.toString() + "]";
	}
	
	

}
