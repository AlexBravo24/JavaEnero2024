package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String tamaño;
	
	public Calculadora() {}

	public Calculadora(String color, String marca, String tamaño) {
		super();
		this.color = color;
		this.marca = marca;
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	//METODOS ABSTRACTOS - para que la clase que los herede, los implemente
	
	public abstract void sumar(int a,int b);
	public abstract void restar(int a,int b);
	public abstract void multiplicar(int a,int b);
	public abstract void dividir(int a,int b);
	
}
