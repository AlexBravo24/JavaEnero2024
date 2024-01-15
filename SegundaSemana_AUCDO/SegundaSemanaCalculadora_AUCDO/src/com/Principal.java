package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	String marca,color,modelo;
		System.out.println("Agregue marca");
		marca = sc.next();
		System.out.println("Agregue color");
		color = sc.next();
		System.out.println("Agregue modelo");
		modelo = sc.next();
	Cientifica calculadora = new Cientifica(marca,modelo,color);
//	Cientifica calculadora = new Cientifica("Casio", "Gris", "CALCU12345");
	
	
	int a;
	System.out.println("Precione 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir");
	a = sc.nextInt();
	
	switch(a) {
	case 1:
		calculadora.suma();	
		System.out.println(calculadora);
		break;
	case 2:
		calculadora.resta();	
		System.out.println(calculadora);
		break;
	case 3:
		calculadora.multiplica();	
		System.out.println(calculadora);
		break;
	case 4:
		calculadora.divide();	
		System.out.println(calculadora);
		break;
		default:
			System.out.println("Opcion no disponible");
		break;
	}
	
	calculadora.tomartemperatura();
	
	}
}
