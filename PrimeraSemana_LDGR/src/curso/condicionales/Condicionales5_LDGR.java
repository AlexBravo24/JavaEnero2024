package curso.condicionales;

import java.util.Scanner;

public class Condicionales5_LDGR {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una 
		// solicitud en base a los siguientes parámetros: edad, nota y sexo.
		// * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		// * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		// * Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		int sexo; // 1 = M
		          // 2 = F
		
		System.out.println("Introduce tu nota:");
		nota = entrada.nextInt();
		
		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu sexo (Escribe 1 para Masculino, o 2 para Femenino):"); 
		sexo = entrada.nextInt();
		
		if(nota==5 && edad==18 && sexo==1) {
			System.out.println("POSIBLE");
		}else if (nota==5 && edad==18 && sexo==2) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}

	}

}
