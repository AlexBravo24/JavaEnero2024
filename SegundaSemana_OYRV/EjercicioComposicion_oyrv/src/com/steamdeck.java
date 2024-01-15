package com;

public class steamdeck {
	
	private String tipo;
	private String marca;
	private String modelo;
	private almacenamiento disco;
	private memoria ram;
	
	public steamdeck() {
		
	}

	public steamdeck(String tipo, String marca, String modelo, almacenamiento disco, memoria ram) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.disco = disco;
		this.ram = ram;
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

	public almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(almacenamiento disco) {
		this.disco = disco;
	}

	public memoria getRam() {
		return ram;
	}

	public void setRam(memoria ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "steamdeck [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", disco=" + disco + ", ram="
				+ ram + "]";
	}
	
	

}
