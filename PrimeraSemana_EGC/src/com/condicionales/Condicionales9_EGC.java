package com.condicionales;

import java.util.Scanner;

public class Condicionales9_EGC {

	public static void main(String[] args) {
//		9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si 
//		introducimos otro n�mero nos da un error.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el d�a");
		int dia = scan.nextInt();
		String day = "";
		switch (dia) {
		case 1:
			day = "Lunes";
			break;
		case 2:
			day = "Martes";
			break;
		case 3:
			day = "Miercoles";
			break;
		case 4:
			day = "Jueves";
			break;
		case 5:
			day = "Viernes";
			break;
		case 6:
			day = "Sabado";
			break;
		case 7:
			day = "Domingo";
			break;
		default:
			System.out.println("ERROR: d�a incorrecto");
			break;
		}

		if (dia > 0 && dia < 8) {
			System.out.println("El d�a de la semana es " + day);
		}

	}

}
