package com.condicionales;

import java.util.Scanner;

public class Condicionales10_EGC {

	public static void main(String[] args) {
//		10.Realiza un programa que pida un n�mero entero entre uno y doce e 
//		imprima el n�mero de d�as que tiene el 
//		mes correspondiente

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el mes");
		String mes = scan.next();

		switch (mes) {
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			System.out.println(mes + " tiene 31 d�as");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println(mes + " tiene 30 d�as");
			break;
		case "febrero":
			System.out.println("febrero tiene 28 d�as o 29 d�as los a�os bisiestos");
			break;
		default:
			System.out.println("mes erroneo");
			break;
		}

	}

}
