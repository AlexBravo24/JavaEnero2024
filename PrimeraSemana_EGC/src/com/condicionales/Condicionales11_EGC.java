package com.condicionales;

import java.util.Scanner;

public class Condicionales11_EGC {

	public static void main(String[] args) {

//		11. Una compa��a de transporte internacional tiene servicio en 
//		algunos pa�ses de Am�rica del Norte, Am�rica 
//		Central, Am�rica del Sur, Europa y Asia. 
//		El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. 
//		Lo anterior se muestra en la siguiente tabla:

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el n�mero de la zona: \n" + " 1 Am�rica del Norte \n 2 Am�rica Central \n "
				+ "3 Am�rica del Sur \n 4 Europa \n 5 Asia");
		int zona = scan.nextInt();
		System.out.println("Ingrese el peso del paquete:");
		double peso = scan.nextDouble();
		double costo = 0;
		switch (zona) {
		case 1:
			costo = 24.00;
			break;
		case 2:
			costo = 20.00;
			break;
		case 3:
			costo = 21.00;
			break;
		case 4:
			costo = 10.00;
			break;
		case 5:
			costo = 18.00;
			break;
		default:
			System.out.println("ERROR: La zona ingresada no existe.");
			break;

		}

		if (peso > 5) {
			System.out.println("Los paquetes con un peso mayor a 5kg no pueden ser"
					+ "enviados por cuestiones de log�stica y seguridad.");

		} else {

			System.out.println("El costo total es: $" + peso * costo);
		}
	}

}
