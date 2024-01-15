package com;

public class Memoria {
	
	private String marca;
	private String tipo;
	private String capasidad;
	
	public Memoria() {
		
	}

	public Memoria(String marca, String tipo, String capasidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capasidad = capasidad;
	}

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

	public String getCapasidad() {
		return capasidad;
	}

	public void setCapasidad(String capasidad) {
		this.capasidad = capasidad;
	}

	@Override
	public String toString() {
		return "Memoria [marca=" + marca + ", tipo=" + tipo + ", capasidad=" + capasidad + "]";
	}
	
}
