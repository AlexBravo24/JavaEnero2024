package curso.condicionales;

import java.util.Scanner;

public class Condicionales7_LDGR {

	public static void main(String[] args) {
		// El director de una escuela est� organizando un viaje de estudios 
		// y requiere determinar cu�nto debe cobrar a cada alumno y 
		// cu�nto debe pagar a la compa��a de viajes por el servicio. 
		// La forma de cobrar es la siguiente:
		// * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		// * De 50 a 99 alumnos, el costo es de 70 euros.
		// * De 30 a 49 alumnos, el costo es de 95 euros.
		// * Menos de 30 alumnos, el costo de la renta del autob�s es 
		// de 4000 euros, sin importar el n�mero de alumnos.
		// Realiza un algoritmo que permita determinar el pago a la 
		// compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
		
		Scanner entrada = new Scanner(System.in);
		
		int alumnos;

		
		System.out.println("Introduzca el n�mero de alumnos:");
		alumnos = entrada.nextInt();
		
		
		if(alumnos>=100) {
			System.out.println("El costo por cada alumno es de 65 euros");
		}
		
		if(alumnos>=50&&alumnos<=99) {
			System.out.println("El costo por cada alumno es de 70 euros");
		}
		
		if(alumnos>=30 && alumnos<=49) {
			System.out.println("El costo por cada alumno es de 95 euros");
		}
		
		if(alumnos<30) {
			System.out.println("El costo de la renta del autob�s es de 4000 euros");
		}


	}

}
