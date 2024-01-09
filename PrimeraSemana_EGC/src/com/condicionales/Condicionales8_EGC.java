package com.condicionales;

import java.util.Scanner;

public class Condicionales8_EGC {

	public static void main(String[] args) {
//		8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido 
//		al lanzar un dado de seis caras y muestre por pantalla el número en letras 
//		(dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis 
//		caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor 
//		que 1 o mayor que 6, se mostrará el mensaje: 
//		“ERROR: número incorrecto”.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el lado del dado");
		int lado = scan.nextInt();
		String ladob = "";
		switch (lado) {
		case 1:
			ladob = "Seis";
			break;
		case 2:
			ladob = "Cinco";
			break;
		case 3:
			ladob = "Cuatro";
			break;
		case 4:
			ladob = "Tres";
			break;
		case 5:
			ladob = "Dos";
			break;
		case 6:
			ladob = "Uno";
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}

		if (lado > 0 && lado < 7) {
			System.out.println("El lado inverso es el número " + ladob);
		}

	}

}
