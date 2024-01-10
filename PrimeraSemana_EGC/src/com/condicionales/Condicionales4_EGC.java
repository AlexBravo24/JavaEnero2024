package com.condicionales;

import java.util.Scanner;

public class Condicionales4_EGC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el texto:");
		
		String texto = scan.nextLine();
		
		char primerLetra = texto.charAt(0);
		
		if(Character.isUpperCase(primerLetra)) {
			
			System.out.println("la primer letra es mayuscula");
			
		 } else {
			 
			 System.out.println("la primer letra NO mayuscula");
		 }

	}

}
