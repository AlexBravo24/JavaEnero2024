package com;

public class Contenedores {
	
	private String procedencia;
	private double volumen;
	private String contenido;
	private String color;
	private String destino;
	
	

	public Contenedores(String procedencia) {
		super();
		this.procedencia = procedencia;
	}

	public Contenedores(String procedencia, double volumen, String contenido, String color, String destino) {
		super();
		this.procedencia = procedencia;
		this.volumen = volumen;
		this.contenido = contenido;
		this.color = color;
		this.destino = destino;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Contenedores [procedencia=" + procedencia + ", volumen=" + volumen + ", contenido=" + contenido
				+ ", color=" + color + ", destino=" + destino + "]";
	}
	
	
}

	