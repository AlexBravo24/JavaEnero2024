package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private int numeros;
	
	public Cientifica () {
		
	}
	

	public Cientifica(int a, int b, int c, int numeros) {
		super(a, b, c);
		this.numeros = numeros;
	}


	public int getNumeros() {
		return numeros;
	}


	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	
	


	@Override
	public String toString() {
		return "Cientifica [numeros=" + numeros + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void sumar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int a = scan.nextInt();
		System.out.println("introduce el segundo valor");
		int b = scan.nextInt();
		System.out.println("el resultadp de la suma de:" + a + "+" + b + " es " + (a+b) );
		
		
		
	}

	@Override
	public void restar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int a = scan.nextInt();
		System.out.println("introduce el segundo valor");
		int b = scan.nextInt();
		System.out.println("el resultado de la resta de:" + a + "-" + b + " es " + (a-b) );
		
	}

	@Override
	public void dividir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int a = scan.nextInt();
		System.out.println("introduce el segundo valor");
		int b = scan.nextInt();
		System.out.println("el resultadp de la div de:" + a + "/" + b + " es " + (a/b) );
		
	}
	
	@Override
	public void multiplicar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int a = scan.nextInt();
		System.out.println("introduce el segundo valor");
		int b = scan.nextInt();
		System.out.println("el resultadp de la multiplicacion de:" + a + "*" + b + " es " + (a*b) );
		
	}


	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	

}
