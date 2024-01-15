package com;

public class Reloj {
	
	private String tipo;
	private String marca;
	private String modelo;
	private String color;
	
	private Pantalla pantalla;
	private Mediciones monitoreo;
	
	public Reloj() {
		
	}

	public Reloj(String tipo, String marca, String modelo, String color, Pantalla pantalla, Mediciones monitoreo) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.pantalla = pantalla;
		this.monitoreo = monitoreo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Mediciones getMonitoreo() {
		return monitoreo;
	}

	public void setMonitoreo(Mediciones monitoreo) {
		this.monitoreo = monitoreo;
	}

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", pantalla="
				+ pantalla + ", monitoreo=" + monitoreo + "]";
	}

	
	

}
