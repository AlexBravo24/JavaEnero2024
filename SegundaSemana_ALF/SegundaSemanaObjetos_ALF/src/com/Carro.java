package com;

public class Carro {
	
	private String nombre;
	private int modelo;
	private String color;
	private String motor;
	private double Valor ;
	public Carro() {
		
	}
	public Carro(String nombre, int modelo, String color, String motor, double valor) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		Valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	@Override
	public String toString() {
		return "Carro [nombre=" + nombre + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", Valor="
				+ Valor + "]";
	}
	
	
	
}
