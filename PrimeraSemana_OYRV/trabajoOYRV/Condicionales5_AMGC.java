package curso.condicionales;

import java.util.Scanner;

public class Condicionales5_AMGC {

	public static void main(String[] args) {
		
		/* 5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes par�metros:
		 * edad, nota y sexo.
		 * * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * * Otros casos -> NO ACEPTADA
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		int nota;
		String sexo;
		char sexo2;
		
		System.out.println("Ingrese los siguientes datos para conocer el estado de su solicitud:");
		System.out.println("Ingrese su edad:");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese su nota (solo enteros):");
		nota = entrada.nextInt();
		
		System.out.println("Ingrese su sexo (M o F):");
		sexo = entrada.nextLine(); //hacer un salto para usar el "espacio"
		sexo = entrada.nextLine();
		sexo = sexo.toUpperCase();
		sexo2 = sexo.charAt(0); //en caso de que el usuario ingrese masculino o femenino, en lugar de M o F
		
		
		if (nota>=5 && edad>=18 && sexo2=='M') {
			System.out.println("Estado de su solicitud: POSIBLE");
		} else if (nota>=5 && edad>=18 && sexo2=='F') {
			System.out.println("Estado de su solicitud: ACEPTADA");
		} else {
			System.out.println("Estado de su solicitud: NO ACEPTADA");
		}

	}

}
