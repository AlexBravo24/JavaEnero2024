package com;

public class Celular {

	private String marca;
	private String color;
	private int precio;
	
	private Camara cam;
	private Procesador ram;
	
	public Celular() {}

	public Celular(String marca, String color, int precio, Camara cam, Procesador ram) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.cam = cam;
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Procesador getRam() {
		return ram;
	}

	public void setRam(Procesador ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", precio=" + precio + ", cam=" + cam + ", ram=" + ram
				+ "]";
	}

	
	
}
