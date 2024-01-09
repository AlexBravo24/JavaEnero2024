package com.condicionales;

import java.util.Scanner;

public class Condicionales11_EGC {

	public static void main(String[] args) {

//		11. Una compañía de transporte internacional tiene servicio en 
//		algunos países de América del Norte, América 
//		Central, América del Sur, Europa y Asia. 
//		El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. 
//		Lo anterior se muestra en la siguiente tabla:

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el número de la zona: \n" + " 1 América del Norte \n 2 América Central \n "
				+ "3 América del Sur \n 4 Europa \n 5 Asia");
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
					+ "enviados por cuestiones de logística y seguridad.");

		} else {

			System.out.println("El costo total es: $" + peso * costo);
		}
	}

}
