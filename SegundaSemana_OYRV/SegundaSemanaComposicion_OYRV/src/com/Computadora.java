package com;

public class Computadora {
	
	private String tipo;
	private String marca;
	private String modelo;
	
	//existen atributos que tambien pueden ser objetos, se crean primero para que puedan ser un tipo de dato en este otro 
	
	private almacenamiento disco;
	private memoria ram;
	
	public Computadora() {
		
	}
	
	public Computadora(String tipo, String marca, String modelo, almacenamiento disco, memoria ram) {
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
		return "Computadora [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", disco=" + disco + ", ram="
				+ ram + "]";
	}
	
	

}

	