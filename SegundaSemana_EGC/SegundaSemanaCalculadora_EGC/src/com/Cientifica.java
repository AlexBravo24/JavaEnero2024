package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	private boolean celdaSolar;

	public Cientifica() {

	}

	public Cientifica(String marca, String color, String origen, boolean celdaSolar) {
		super(marca, color, origen);
		this.celdaSolar = celdaSolar;
	}

	@Override
	public void sumar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo valor:");
		int b = scan.nextInt();
		System.out.println("El resultado de la suma de " + a + " + " + b + " es = " + (a + b));

	}

	@Override
	public void restar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo valor:");
		int b = scan.nextInt();
		System.out.println("El resultado de la resta de " + a + " - " + b + " es = " + (a - b));

	}

	@Override
	public void multiplicar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo valor:");
		int b = scan.nextInt();
		System.out.println("El resultado de la multiplicacion de " + a + " * " + b + " es = " + (a * b));

	}

	@Override
	public void dividir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo valor:");
		int b = scan.nextInt();
		System.out.println("El resultado de la division de " + a + " / " + b + " es = " + (a / b));

	}

	public boolean isCeldaSolar() {
		return celdaSolar;
	}

	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}

	@Override
	public String toString() {
		return "Cientifica [celdaSolar=" + celdaSolar + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void tomarTemperatura() {
		// Estoy implementando el metodo tomarTemperatura de la interfaz ITermometro
		System.out.println("Estoy tomando la temperatura...");

	}

}
