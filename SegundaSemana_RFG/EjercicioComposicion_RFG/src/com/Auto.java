package com;

public class Auto {

	private String marca;
	private String tipo;
	private String color;
	private int a�o;
	private Llantas llantas;
	private Asientos asientos;
	
	public Auto() {
		
	}

	public Auto(String marca, String tipo, String color, int a�o, Llantas llantas, Asientos asientos) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Auto [marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", a�o=" + a�o + ", llantas=" + llantas
				+ ", asientos=" + asientos + "]";
	}
	
	
}
