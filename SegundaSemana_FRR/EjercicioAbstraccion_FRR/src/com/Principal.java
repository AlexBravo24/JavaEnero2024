package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Cientifica casio = new Cientifica("casio", 35.50, "nergro", true, true, true);
		
		System.out.println("hola, bienvenido a la calculadora por texto ¿que deseas hacer?");
		System.out.println("elije una opcion \n1 sumar \n2 restar \n3 multiplicar \n4 dividir");
		
		int opcion = entrada.nextInt();
		
		if(opcion == 1) {
			casio.sumar();
		}else if(opcion == 2) {
			casio.restar();
		}else if(opcion == 3) {
			casio.multiplicar();
		}else if(opcion == 4) {
			casio.dividir();
		} else {
			System.out.println("la opcion no existe");
		}
		
		casio.tomarTemperatura();
		

	}

}
