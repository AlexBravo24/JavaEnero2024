package com;

public class Llantas {

	private String marca;
	private String tipo;
		
	public Llantas() {
		
	}

	public Llantas(String marca, String tipo) {
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
		return "Llantas [marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	
}
