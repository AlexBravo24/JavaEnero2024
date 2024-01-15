package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	Scanner sc = new Scanner(System.in);
	
	public Cientifica() {
		
	}
	
	
	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
	}

	

	@Override
	public String toString() {
		return "Cientifica: " + super.toString() + "]";
	}


	@Override
	public void suma() {
		double a,b,resultado;
		System.out.println("Agregue valor A");
		a=sc.nextInt();
		System.out.println("Agregue valor B");
		b=sc.nextInt();
		resultado=a+b;
		System.out.println(resultado);
	}

	@Override
	public void resta() {
		double a,b,resultado;
		System.out.println("Agregue valor A");
		a=sc.nextInt();
		System.out.println("Agregue valor B");
		b=sc.nextInt();
		resultado=a-b;
		System.out.println(resultado);
		
	}

	@Override
	public void multiplica() {
		double a,b,resultado;
		System.out.println("Agregue valor A");
		a=sc.nextInt();
		System.out.println("Agregue valor B");
		b=sc.nextInt();
		resultado=a*b;
		System.out.println(resultado);
		
	}

	@Override
	public void divide() {
		double a,b,resultado;
		System.out.println("Agregue valor A");
		a=sc.nextInt();
		System.out.println("Agregue valor B");
		b=sc.nextInt();
		resultado=a/b;
		System.out.println(resultado);
		
	}

	//METODO DE INTERFACE
	@Override
	public void tomartemperatura() {
		System.out.println("Temperatura normal");
		
	}

	
	
	
}
