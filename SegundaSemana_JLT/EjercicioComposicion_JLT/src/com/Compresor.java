package com;

public class Compresor {
	
	//Compresor caracteristicas = new Compresor ("potencia", "costo", "tipo");
	
	private double potencia;
	private double costo;
	private String tipo;
	
	public Compresor () {
		
		
	}

	public Compresor(double potencia, double costo, String tipo) {
		super();
		this.potencia = potencia;
		this.costo = costo;
		this.tipo = tipo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Compresor [potencia=" + potencia + ", costo=" + costo + ", tipo=" + tipo + "]";
	}
	
	

}
