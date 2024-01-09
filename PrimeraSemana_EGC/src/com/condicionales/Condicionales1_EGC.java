package com.condicionales;

import java.util.Scanner;

public class Condicionales1_EGC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el primer valor: ");

		int primerValor = scan.nextInt();

		System.out.println("Ingrese el se segundo valor: ");

		int segundoValor = scan.nextInt();

		if (primerValor > segundoValor) {

			System.out.println("El primer valor " + primerValor + " es mayor que el segundo valor " + segundoValor);

		} else if (primerValor < segundoValor) {

			System.out.println("El segundo valor " + segundoValor + " es mayor que el primer valor " + primerValor);
		} else {

			System.out.println("Los valores son iguales");
		}
	}

}
