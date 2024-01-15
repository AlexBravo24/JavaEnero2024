package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	// extends - heredar
	// implements - para hacer uso de la interfaz 
	
	private double a�odefabricacion;
	
	public Cientifica() {
		
	}

	
	public Cientifica(String marca, String modelo, String color, double a�odefabricacion) {
		super(marca, modelo, color);
		this.a�odefabricacion = a�odefabricacion;
	}
	

	public double getA�odefabricacion() {
		return a�odefabricacion;
	}
	

	@Override
	public String toString() {
		return "Cientifica [a�odefabricacion=" + a�odefabricacion + ", toString()=" + super.toString() + "]";
	}


	public void setA�odefabricacion(double a�odefabricacion) {
		this.a�odefabricacion = a�odefabricacion;
	}


	@Override
	public void sumar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nSUMA");
		System.out.println("Ingrese un n�mero:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro n�mero:");
		double y = entrada.nextInt();
		
		System.out.println("La suma de los n�meros es: " + (x+y));
	
	}

	@Override
	public void restar() {
        
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nRESTA");
		System.out.println("Ingrese un n�mero:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro n�mero:");
		double y = entrada.nextInt();
		
		System.out.println("La resta de los n�meros es: " + (x-y));
		
	}

	@Override
	public void multiplicar() {
		
        Scanner entrada = new Scanner(System.in);
		
        System.out.println("\nMULTIPLICACI�N");
        System.out.println("Ingrese un n�mero:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro n�mero:");
		double y = entrada.nextInt();
		
		System.out.println("El producto de los n�meros es: " + (x*y));
		
	}

	@Override
	public void dividir() {
        
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDIVISI�N");
		System.out.println("Ingrese un n�mero:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro n�mero:");
		double y = entrada.nextInt();
		
		System.out.println("La divisi�n de los n�meros es: " + (x/y));
		
	}


	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	
	
	

}
