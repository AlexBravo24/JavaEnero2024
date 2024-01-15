package com;

public class Asientos {
	
	private String marca;
	private String tipo;

	public Asientos() {
		
	}

	public Asientos(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Asientos [marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	
}
