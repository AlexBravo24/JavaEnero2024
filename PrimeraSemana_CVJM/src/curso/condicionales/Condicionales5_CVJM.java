package curso.condicionales;

import java.util.Scanner;

public class Condicionales5_CVJM {

	public static void main(String[] args) {
		/* 5. Realiza un programa que calcule la aceptación de una 
		 * solicitud en base a los siguientes parámetros: edad, nota y sexo. 
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA
		* 
		*/
		
		Scanner consola= new Scanner(System.in);
		
		System.out.println("Ingrese los datos solicitados");
		System.out.println("Nota: ");
		int n= Integer.parseInt(consola.nextLine());
		
		System.out.println("Edad: ");
		int e= Integer.parseInt(consola.nextLine());
		
		System.out.println("Sexo (F/M): ");
		char s=consola.next().charAt(0);
		
		if (n>5 && e>17 && ((s== 'M' || s== 'F')||(s== 'm' || s== 'f'))) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
		
		
	}

}
