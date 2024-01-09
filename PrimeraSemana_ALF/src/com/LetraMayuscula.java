package com;

import java.util.Scanner;

public class LetraMayuscula {

	public static void main(String[] args) {
		
		System.out.println("LETRA MAYUSCULA");
		Scanner entrada = new Scanner(System.in);
		String letra;
		System.out.println("Ingresa una palabra:");
		letra = entrada.next();
		 if(letra==letra.toUpperCase()) {
			 System.out.println( "La palabra "+ letra + " esta "
			 		+ " EN LETRAS MAYUSCULAS.");
		 }else {
			 System.out.println( "La palabra "+ letra + " esta "
				 		+ " en letras minusculas.");
		 }

	}

}
