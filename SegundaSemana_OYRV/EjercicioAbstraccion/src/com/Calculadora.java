package com;

public abstract class Calculadora {
	
	private int a;
	private int b;
	private int c;
	
	public Calculadora () {
		
	}
	
	
	public Calculadora(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}
	


	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", c=" + c + "]";
	}


	public abstract void sumar();
	public abstract void restar();
	public abstract void dividir();
	public abstract void multiplicar();

}
