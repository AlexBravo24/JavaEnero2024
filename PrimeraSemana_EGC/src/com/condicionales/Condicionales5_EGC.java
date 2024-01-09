package com.condicionales;

import java.util.Scanner;

public class Condicionales5_EGC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese su nota:");
		int grade = scan.nextInt();

		System.out.println("Ingrese su edad");
		int age = scan.nextInt();

		System.out.println("Ingrese su sexo F o M");
		String sex = scan.next();
		char fom = sex.charAt(0);

		if (grade >= 5 && age >= 18 && fom == 'M') {
			
			System.out.println("POSIBLE");
			
		} else if (grade >= 5 && age >= 18 && fom == 'F') {

			System.out.println("ACEPTADA");
			
		} else {
			
			System.out.println("NO ACEPTADA");
		}
	}

}
