package com;

public class Camara {

	public String modelo;
	public double tipo;
	
	public Camara () {
		
	}

	public Camara(String modelo, double tipo) {
		super();
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Camara [modelo=" + modelo + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
