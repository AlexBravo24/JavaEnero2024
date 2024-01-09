package com.condicionales;

import java.util.Scanner;

public class Condicionales6_EGC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el precio inicial:");
		// scan.nextDouble();
		double price = scan.nextDouble();
		System.out.println("Ingrese el tipo: A o B");
		String type = scan.next();
		char tipo = type.charAt(0);
		System.out.println("Ingrese el tamaño 1 o 2");
		int size = scan.nextInt();
		System.out.println("valores: " + price + " - " + tipo + " - " + size);

		if (tipo == 'A' && size == 1) {
			
			System.out.println("El precio de compra es: " + (price + .20));

		} else if (tipo == 'A' && size == 2) {
			
			System.out.println("El precio de compra es: " + (price + .30));

		} else if (tipo == 'B' && size == 1) {
			
			System.out.println("El precio de compra es: " + (price - .30));

		} else if (tipo == 'B' && size == 2) {
			System.out.println("El precio de compra es: " + (price - .50));

		}else {
			
			System.out.println("Error al calcular el precio");
		}
	}
}