package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	// extends - heredar
	// implements - para hacer uso de la interfaz 
	
	private double añodefabricacion;
	
	public Cientifica() {
		
	}

	
	public Cientifica(String marca, String modelo, String color, double añodefabricacion) {
		super(marca, modelo, color);
		this.añodefabricacion = añodefabricacion;
	}
	

	public double getAñodefabricacion() {
		return añodefabricacion;
	}
	

	@Override
	public String toString() {
		return "Cientifica [añodefabricacion=" + añodefabricacion + ", toString()=" + super.toString() + "]";
	}


	public void setAñodefabricacion(double añodefabricacion) {
		this.añodefabricacion = añodefabricacion;
	}


	@Override
	public void sumar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nSUMA");
		System.out.println("Ingrese un número:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro número:");
		double y = entrada.nextInt();
		
		System.out.println("La suma de los números es: " + (x+y));
	
	}

	@Override
	public void restar() {
        
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nRESTA");
		System.out.println("Ingrese un número:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro número:");
		double y = entrada.nextInt();
		
		System.out.println("La resta de los números es: " + (x-y));
		
	}

	@Override
	public void multiplicar() {
		
        Scanner entrada = new Scanner(System.in);
		
        System.out.println("\nMULTIPLICACIÓN");
        System.out.println("Ingrese un número:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro número:");
		double y = entrada.nextInt();
		
		System.out.println("El producto de los números es: " + (x*y));
		
	}

	@Override
	public void dividir() {
        
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDIVISIÓN");
		System.out.println("Ingrese un número:");
		double x = entrada.nextInt();
		
		System.out.println("Ingrese otro número:");
		double y = entrada.nextInt();
		
		System.out.println("La división de los números es: " + (x/y));
		
	}


	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	
	
	

}
