package curso.condicionales;

import java.util.Scanner;

public class Condicionales05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA * Otros casos -> NO ACEPTADA

Scanner entrada = new Scanner(System.in);


		System.out.println("ingrese la nota obtenida");
		int nota = entrada.nextInt();
		
		System.out.println("ingrese la edad");
		int edad = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("ingrese el sexo (M o F)");
		String sexo;
		sexo = entrada.nextLine();
				
			if (nota < 5) {
			System.out.println("NO ACEPTADA");
			}else if (edad < 18) {
			System.out.println("NO ACEPTADA");
			}else if (sexo.toUpperCase().equals("M")) {
				System.out.println("POSIBLE");
			}else if (sexo.toUpperCase().equals("F")) {
				System.out.println("ACEPTADA");
			}else {
				System.out.println("NO ACEPTADA");
			}
				
		
		
	}

}
