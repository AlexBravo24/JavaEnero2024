package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EGC {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
//		segundo n�mero es 0, debe mostrar un mensaje de error.

		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el primer n�mero...");
		double primerNum = scan.nextDouble();
		System.out.println("ingrese el segundo n�mero...");
		double segundoNum = scan.nextDouble();
		if (segundoNum <= 0) {
			System.out.println("Error, no es posible dividir entre 0.");
		} else {
			System.out.println("resultado: " + primerNum / segundoNum);
		}

	}

}
