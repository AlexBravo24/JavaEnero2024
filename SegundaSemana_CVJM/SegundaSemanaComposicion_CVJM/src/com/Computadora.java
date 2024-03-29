package com;

public class Computadora {
	
	private String tipo;
	private String marca;
	private String modelo;
	
	//Existen atributos que tambien pueden ser objetos
	//Primero se crean, para que puedan ser un tipo de dato
	//en este otro
	private Almacenamiento disco;
	private Memoria ram;
	
	//Generamos constructor vacio 
	public Computadora() {
		
	}
	//Generamos constructores con todos los argumentos (using Fields)
	public Computadora(String tipo, String marca, String modelo, Almacenamiento disco, Memoria ram) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.disco = disco;
		this.ram = ram;
	}
	//Generamos constructores Getters and Setters (seleccionamos todos)
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

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Memoria getRam() {
		return ram;
	}

	public void setRam(Memoria ram) {
		this.ram = ram;
	}
	//Construcotres Generate to String
	@Override
	public String toString() {
		return "Computadora [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", disco=" + disco + ", ram="
				+ ram + "]";
	}
	

}
