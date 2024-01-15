package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double capacidad;
	
	//Creamos constructores
	public Almacenamiento() {
		
	}
	//Generamos contructores using Fields(usando todos los argumentos)
	public Almacenamiento(String marca, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}
	
	//Generamos constructores Getters and Setters (seleccionamos todos)
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	//Construcotres Generate to String
	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}

	
	
	
}
