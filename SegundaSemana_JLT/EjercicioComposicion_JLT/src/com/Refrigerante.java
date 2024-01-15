package com;

public class Refrigerante {
	
	//Refrigerante operacion = new Refrigerante ("Tipo", "Presion", "Costo");
	
	private String tipo;
	private String presion;
	private double costo;
	
	public Refrigerante () {
		
		
	}

	public Refrigerante(String tipo, String presion, double costo) {
		super();
		this.tipo = tipo;
		this.presion = presion;
		this.costo = costo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Refrigerante [tipo=" + tipo + ", presion=" + presion + ", costo=" + costo + "]";
	}
	
	

}
