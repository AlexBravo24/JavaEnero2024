package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private int digitos;
	private double precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, int digitos, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.digitos = digitos;
		this.precio = precio;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", digitos=" + digitos + ", precio=" + precio + "]";
	}

	//MÉTODOS
	public abstract int operacion();
	public abstract int numero1();
	public abstract int numero2();
	public abstract void sumar(double x, double y);
	public abstract void restar(double x, double y);
	public abstract void multiplicar(double x, double y);
	public abstract void dividir(double x, double y);


}
