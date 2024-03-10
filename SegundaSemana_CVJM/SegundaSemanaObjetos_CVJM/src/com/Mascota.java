package com;

public class Mascota {
	
	private String nombre;
	private String raza;
	private int peso;
	private int edad;
	private String belleza;
	private String energia;
	private String ternura;

	public Mascota() {
		
	}

	public Mascota(String nombre, String raza, int peso, int edad, String belleza, String energia, String ternura) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.belleza = belleza;
		this.energia = energia;
		this.ternura = ternura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getBelleza() {
		return belleza;
	}

	public void setBelleza(String belleza) {
		this.belleza = belleza;
	}

	public String getEnergia() {
		return energia;
	}

	public void setEnergia(String energia) {
		this.energia = energia;
	}

	public String getTernura() {
		return ternura;
	}

	public void setTernura(String ternura) {
		this.ternura = ternura;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", edad=" + edad + ", belleza="
				+ belleza + ", energia=" + energia + ", ternura=" + ternura + "]";
	}
	
	
	
	
}