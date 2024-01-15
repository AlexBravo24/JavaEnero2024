package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Cientifica calculadora = new Cientifica();
		calculadora.tomarTemperatura();
		System.out.println();
		System.out.println("------Menú------");
		System.out.println("Seleccione una de las opciones de la computadora: ");
		System.out.println(" 1) Sumar");
		System.out.println(" 2) Restar");
		System.out.println(" 3) Multiplicar");
		System.out.println(" 4) Dividir");
		System.out.println();
        int funcion = scanner.nextInt();
        System.out.println(" Ingrese los números: ");
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	
        switch(funcion) {
	        case 1: 
	        	calculadora.sumar(a,b);
	        	
	        break;
	        case 2: 
	        	calculadora.restar(a,b);
	        	
	        break;
	        case 3: 
	        	calculadora.multiplicar(a,b);
	        	
	        break;
	        case 4: 
	        	calculadora.dividir(a,b);
	        	
	        break;
        }
	}

}
