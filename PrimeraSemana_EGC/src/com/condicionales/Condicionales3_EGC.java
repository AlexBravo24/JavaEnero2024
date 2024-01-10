package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EGC {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
//		segundo número es 0, debe mostrar un mensaje de error.

		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el primer número...");
		double primerNum = scan.nextDouble();
		System.out.println("ingrese el segundo número...");
		double segundoNum = scan.nextDouble();
		if (segundoNum <= 0) {
			System.out.println("Error, no es posible dividir entre 0.");
		} else {
			System.out.println("resultado: " + primerNum / segundoNum);
		}

	}

}
