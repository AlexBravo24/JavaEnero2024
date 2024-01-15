package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
	
	private String cargador;
	
	public Cientifica() {
		
	}

	public Cientifica(String marca, String color, String modelo, int precio, String cargador) {
		super(marca, color, modelo, precio);
		this.cargador = cargador;
	}

	public String getCargador() {
		return cargador;
	}

	public void setCargador(String cargador) {
		this.cargador = cargador;
	}

	@Override
	public String toString() {
		return "Cientifica [cargador=" + cargador + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar() {
			
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor a sumar:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor a sumar:");
		int num2 = entrada.nextInt();
		int sumar = num1+num2;
		System.out.println("La suma de los valores es: "+ sumar);
	}

	@Override
	public void restar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor a restar:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor a restar:");
		double num2 = entrada.nextInt();
		double restar = num1-num2;
		System.out.println("La suma de los valores es: "+ restar);
	}

	@Override
	public void multiplicar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor a multiplicar:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor a multiplicr:");
		int num2 = entrada.nextInt();
		int mult = num1*num2;
		System.out.println("La suma de los valores es: "+ mult);
		
	}

	@Override
	public void dividir() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor a dividir:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor a dividir:");
		int num2 = entrada.nextInt();
		int dividir = num1/num2;
		if(num2==0) {
			System.out.println("No se puede dividir entre cero");
			
		}
		System.out.println("La suma de los valores es: "+ dividir);
		
		
	}

	@Override
	public void tomarTemperatura() {
		
		System.out.println("Temperatura hambiental..");
		
	}
	}
