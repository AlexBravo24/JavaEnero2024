package com.condicionales;

import java.util.Scanner;

public class Condicionales7_EGC {

	public static void main(String[] args) {
//		7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos");
		int numAlum = scan.nextInt();
		if (numAlum >= 100) {
			System.out.println("El precio es: $" + numAlum * 65 + " euros");
		} else if (numAlum >= 50 && numAlum <= 99) {
			System.out.println("El precio es: $" + numAlum * 70 + " euros");
		} else if (numAlum >= 30 && numAlum <= 49) {
			System.out.println("El precio es: $" + numAlum * 95 + " euros");
		} else {
			System.out.println("El precio es: $4000 euros");
		}

	}

}
