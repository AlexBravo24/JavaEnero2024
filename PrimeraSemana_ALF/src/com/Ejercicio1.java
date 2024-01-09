package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Programa que indica que numero ingresado por el usuario es mayor o si son iguales");
		
		Scanner entrada = new Scanner(System.in);
		int n1;
		System.out.println("Introduce el primer numero entero:");
		n1=entrada.nextInt();
		System.out.println("Introduce el segundo numero entero:");
		int n2 = entrada.nextInt();
		
		if(n1>n2 ) {
			System.out.println("El numero " + n1+ " Es mayor que "+ n2);
		}
		if(n1<n2) {
			System.out.println("El numero " + n2+ " Es mayor que "+ n1);
		}
		if(n1==n2) {
			System.out.println("El numero " + n1+ " Es igual a "+ n2);
		}
		
		

	}

}
