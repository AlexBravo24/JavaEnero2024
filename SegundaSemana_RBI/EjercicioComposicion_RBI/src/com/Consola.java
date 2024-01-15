package com;

public class Consola {

	private String marca;
	private String año;
	
	private Modelo modelo;
	private Almacenamiento almacenamiento;
	private Procesador procesador;
	
	public Consola(){
		
	}

	public Consola(String marca, String año, Modelo modelo, Almacenamiento almacenamiento, Procesador procesador) {
		super();
		this.marca = marca;
		this.año = año;
		this.modelo = modelo;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Consola [marca=" + marca + ", año=" + año + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento
				+ ", procesador=" + procesador + "]";
	}
	
	
	
}
