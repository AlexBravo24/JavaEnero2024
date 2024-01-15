package com;

public class Consola {

	private String marca;
	private String a�o;
	
	private Modelo modelo;
	private Almacenamiento almacenamiento;
	private Procesador procesador;
	
	public Consola(){
		
	}

	public Consola(String marca, String a�o, Modelo modelo, Almacenamiento almacenamiento, Procesador procesador) {
		super();
		this.marca = marca;
		this.a�o = a�o;
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

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
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
		return "Consola [marca=" + marca + ", a�o=" + a�o + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento
				+ ", procesador=" + procesador + "]";
	}
	
	
	
}
