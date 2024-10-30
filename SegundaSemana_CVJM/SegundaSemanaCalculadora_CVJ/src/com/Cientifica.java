package com;

import java.util.Scanner;
//Cienficica esta heredando los metodos de Calculadora
//Y tambien puede implementar los metodos de la INTERFASE con 'implements INTERFASE'
//Luego agregamos metodo no implementado a  'Cientifica' y aparecera su respectiva 
//anotacion Override
public class Cientifica extends Calculadora implements ITermometro{
	
	
	Scanner entrada=new Scanner (System.in);

	@Override
	public void sumar() {
		System.out.println("Ingrese el primer valor: ");
		int v1=entrada.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int v2=entrada.nextInt();
		System.out.println("La suma de "+v1+" + "+v2+" = "+(v1+v2));
		
	}

	@Override
	public void restar() {
		System.out.println("Ingrese el primer valor: ");
		int v1=entrada.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int v2=entrada.nextInt();
		System.out.println("La resta de "+v1+" - "+v2+" = "+(v1-v2));
		
	}

	@Override
	public void multiplicar() {
		System.out.println("Ingrese el primer valor: ");
		int v1=entrada.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int v2=entrada.nextInt();
		System.out.println("La multiplicación de "+v1+" x "+v2+" = "+(v1*v2));
		
	}

	@Override
	public void dividir() {
		System.out.println("Ingrese el primer valor: ");
		int v1=entrada.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int v2=entrada.nextInt();
		System.out.println("La dividición de "+v1+" ÷ "+v2+" = "+(v1/v2));
		
	}

	@Override
	public void tomasTemperatura() {
		System.out.println("Temperatura normal");
		
	}
}
	