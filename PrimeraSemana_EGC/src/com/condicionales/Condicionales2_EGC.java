package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EGC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese un n�mero: ");

		int numero = scan.nextInt();

		if (numero % 2 == 0) {

			System.out.println("El n�mero ingresado es par.");
		} else {

			System.out.println("El n�mero ingresado es impar.");
		}
	}

}
