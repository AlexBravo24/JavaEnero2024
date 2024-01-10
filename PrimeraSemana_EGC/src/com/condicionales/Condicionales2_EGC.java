package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EGC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese un número: ");

		int numero = scan.nextInt();

		if (numero % 2 == 0) {

			System.out.println("El número ingresado es par.");
		} else {

			System.out.println("El número ingresado es impar.");
		}
	}

}
