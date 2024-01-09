package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Aceptacion de solicitud");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa la nota obtenida:");
		int nota = entrada.nextInt();
		System.out.println("Ingresa la edad:");
		int edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingresa el sexo ( F o M):");
		String sexo;
		sexo = entrada.nextLine();
		
		if(nota<5) {
			System.out.println("NO ACEPTADA");
		}else if(edad<18) {
			System.out.println("NO ACEPTADA");
			
		}else if(sexo.toUpperCase().equals("M")) {
			System.out.println("POSIBLE");
		}else if(sexo.toUpperCase().equals("F")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPATADA");
		}
		
		

	}

}
