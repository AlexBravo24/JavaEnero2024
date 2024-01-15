package com;

public class Celular {
	
	private String pantalla;
	private String marca;
	private String ram;
	
	private Camara camara;
	private Procesador procesador;
	
	public Celular() {
		
	}

	public Celular(String pantalla, String marca, String ram, Camara camara, Procesador procesador) {
		super();
		this.pantalla = pantalla;
		this.marca = marca;
		this.ram = ram;
		this.camara = camara;
		this.procesador = procesador;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Celular [pantalla=" + pantalla + ", marca=" + marca + ", ram=" + ram + ", camara=" + camara
				+ ", procesador=" + procesador + "]";
	}
	
	

}
