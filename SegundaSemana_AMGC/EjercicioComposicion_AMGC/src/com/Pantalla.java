package com;

public class Pantalla {
	
	private double pulgadas;
	private String tipo;
	private String forma;
	
	public Pantalla() {
		
	}

	public Pantalla(double pulgadas, String tipo, String forma) {
		super();
		this.pulgadas = pulgadas;
		this.tipo = tipo;
		this.forma = forma;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Pantalla [pulgadas=" + pulgadas + ", tipo=" + tipo + ", forma=" + forma + "]";
	}
	
	

}
