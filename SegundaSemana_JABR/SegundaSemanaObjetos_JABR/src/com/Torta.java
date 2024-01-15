package com;

public class Torta {
	
	private String nombre;
	private String tipoPan;
	private String ingPrincipal;
	private double precio;
	private double peso;
	
	public Torta() {
		
	}

	public Torta(String nombre, String tipoPan, String ingPrincipal, double precio, double peso) {
		super();
		this.nombre = nombre;
		this.tipoPan = tipoPan;
		this.ingPrincipal = ingPrincipal;
		this.precio = precio;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoPan() {
		return tipoPan;
	}

	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}

	public String getIngPrincipal() {
		return ingPrincipal;
	}

	public void setIngPrincipal(String ingPrincipal) {
		this.ingPrincipal = ingPrincipal;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", tipoPan=" + tipoPan + ", ingPrincipal=" + ingPrincipal + ", precio="
				+ precio + ", peso=" + peso + "]";
	}
	
	

}
