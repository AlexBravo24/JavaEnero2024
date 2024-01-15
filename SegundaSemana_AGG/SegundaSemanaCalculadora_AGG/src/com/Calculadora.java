package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String tama�o;
	
	public Calculadora() {}

	public Calculadora(String color, String marca, String tama�o) {
		super();
		this.color = color;
		this.marca = marca;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tama�o=" + tama�o + "]";
	}
	
	//METODOS ABSTRACTOS - para que la clase que los herede, los implemente
	
	public abstract void sumar(int a,int b);
	public abstract void restar(int a,int b);
	public abstract void multiplicar(int a,int b);
	public abstract void dividir(int a,int b);
	
}
