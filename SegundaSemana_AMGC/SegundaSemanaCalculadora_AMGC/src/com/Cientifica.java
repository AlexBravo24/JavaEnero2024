package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private String calculo;
	private String accesorios;
	
	public Cientifica() {
		
	}
	
	public Cientifica(String marca, String color, int digitos, double precio, String calculo, String accesorios) {
		super(marca, color, digitos, precio);
		this.calculo = calculo;
		this.accesorios = accesorios;
	}
	


	public String getCalculo() {
		return calculo;
	}

	public void setCalculo(String calculo) {
		this.calculo = calculo;
	}

	public String getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}
	
	

	@Override
	public String toString() {
		return "Cientifica [calculo=" + calculo + ", accesorios=" + accesorios + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	//Métodos
	
	@Override
	public int operacion() {
		Scanner entrada = new Scanner(System.in);
		int operacion1;
		
		System.out.println("Bienvenido, ingrese la operación que desea realizar:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		
		operacion1 = entrada.nextInt();
		
		return operacion1;
	}
	
	@Override
	public int numero1() {
		Scanner entrada = new Scanner(System.in);
		int x;
	
		System.out.println("Ingrese primer número:");
		x = entrada.nextInt();
		
		return x;
	}
	
	@Override
	public int numero2() {
		Scanner entrada = new Scanner(System.in);
		int y;

		System.out.println("Ingrese segundo número:");
		y = entrada.nextInt();
		
		return y;
	}

	@Override
	public void sumar(double x, double y) {		
		System.out.println(x + " + "+ y+ " = " + (x+y));
	}


	@Override
	public void restar(double x, double y) {
		
		System.out.println("");
		System.out.println(x + " - "+ y+ " = " + (x-y));
	}


	@Override
	public void multiplicar(double x, double y) {
		System.out.println(x + " x "+ y+ " = " + (x*y));
		
	}


	@Override
	public void dividir(double x, double y) {
		System.out.println(x + " / "+ y+ " = " + (x/y));
		
	}

	@Override
	public void tomarTemperatura() {
		
		System.out.println("Temperatura normal");
	}

	


	
	
	

}
