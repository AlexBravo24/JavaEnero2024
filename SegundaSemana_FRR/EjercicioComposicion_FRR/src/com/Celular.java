package com;

public class Celular {
	
	private String marca;
	private String color;
	private double precio;
	
	private Procesador procesador;
	private Camara camara;
	
	public Celular () {
		
	}

	public Celular(String marca, String color, double precio, Procesador procesador, Camara camara) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.procesador = procesador;
		this.camara = camara;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", precio=" + precio + ", procesador=" + procesador
				+ ", camara=" + camara + "]";
	}
	
	

}
