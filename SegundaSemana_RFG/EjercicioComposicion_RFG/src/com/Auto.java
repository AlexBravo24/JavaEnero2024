package com;

public class Auto {

	private String marca;
	private String tipo;
	private String color;
	private int año;
	private Llantas llantas;
	private Asientos asientos;
	
	public Auto() {
		
	}

	public Auto(String marca, String tipo, String color, int año, Llantas llantas, Asientos asientos) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
		this.año = año;
		this.llantas = llantas;
		this.asientos = asientos;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Llantas getLlantas() {
		return llantas;
	}

	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}

	public Asientos getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", año=" + año + ", llantas=" + llantas
				+ ", asientos=" + asientos + "]";
	}
	
	
}
