package com;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	private double puntossalud;
	private double puntoscombate;
	private double peso;
	private double altura;
	
	public Pokemon() {
		
	}

	public Pokemon(String nombre, String tipo, double puntossalud, double puntoscombate, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntossalud = puntossalud;
		this.puntoscombate = puntoscombate;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPuntossalud() {
		return puntossalud;
	}

	public void setPuntossalud(double puntossalud) {
		this.puntossalud = puntossalud;
	}

	public double getPuntoscombate() {
		return puntoscombate;
	}

	public void setPuntoscombate(double puntoscombate) {
		this.puntoscombate = puntoscombate;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", puntossalud=" + puntossalud + ", puntoscombate="
				+ puntoscombate + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	

}
