package com;

public class Puerta {
	
	private String material;
	private String color;
	private double altura;
	private double ancho;
	private double precio;
	
	public Puerta () {
		
	}

	public Puerta(String material, String color, double altura, double ancho, double precio) {
		super();
		this.material = material;
		this.color = color;
		this.altura = altura;
		this.ancho = ancho;
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Puerta [material=" + material + ", color=" + color + ", altura=" + altura + ", ancho=" + ancho
				+ ", precio=" + precio + "]";
	}
	
	

}
