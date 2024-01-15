package com;

public class BolsaDeRegalo {
	
	private String material;
	private String genero;
	private String color;
	private String forma;
	private double precio;
	
	public BolsaDeRegalo () {	
	}

	public BolsaDeRegalo(String material, String genero, String color, String forma, double precio) {
		super();
		this.material = material;
		this.genero = genero;
		this.color = color;
		this.forma = forma;
		this.precio = precio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "BolsaDeRegalo [material=" + material + ", genero=" + genero + ", color=" + color + ", forma=" + forma
				+ ", precio=" + precio + "]";
	}
	
	

}
