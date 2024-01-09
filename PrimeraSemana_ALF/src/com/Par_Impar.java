package com;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		System.out.println("Numero par o Impar");
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Ingresa un numero entero:");
		numero = entrada.nextInt();
		 if(numero % 2 == 0) {
			 System.out.println("El numero "+ numero + " es par");
		 }else {
			 System.out.println("El numero "+ numero + " es impar");
		 }

	}
	

}
