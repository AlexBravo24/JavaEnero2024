package com;

public class Hamburguesa {
	
	private String nombre;
	private String ingPrin;
	private String guarnicion;
	private int precio;
	
	public Hamburguesa() {
		
	}

	public Hamburguesa(String nombre, String ingPrin, String guarnicion, int precio) {
		super();
		this.nombre = nombre;
		this.ingPrin = ingPrin;
		this.guarnicion = guarnicion;
		this.precio = precio;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngPrin() {
		return ingPrin;
	}

	public void setIngPrin(String ingPrin) {
		this.ingPrin = ingPrin;
	}

	public String getGuarnicion() {
		return guarnicion;
	}

	public void setGuarnicion(String guarnicion) {
		this.guarnicion = guarnicion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Hamburguesa\n nombre: " + nombre + ", ingPrin: " + ingPrin + ", guarnicion: " + guarnicion + ", precio: "
				+ precio + "\n";
	}
	
	
}
