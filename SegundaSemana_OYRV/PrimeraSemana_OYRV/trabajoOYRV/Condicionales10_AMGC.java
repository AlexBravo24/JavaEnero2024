package curso.condicionales;

import java.util.Scanner;

public class Condicionales10_AMGC {

	public static void main(String[] args) {
		/* 10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima
		 * el n�mero de d�as que tiene el mes correspondiente.
		 */
		
        Scanner entrada = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingrese un n�mero entero entre 1 y 12:");
		mes = entrada.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("31 d�as");
			break;
		case 2:
			System.out.println("28 d�as");
			break;
		case 3:
			System.out.println("31 d�as");
			break;
		case 4:
			System.out.println("30 d�as");
			break;
		case 5:
			System.out.println("31 d�as");
			break;
		case 6:
			System.out.println("30 d�as");
			break;
		case 7:
			System.out.println("31 d�as");
			break;
		case 8:
			System.out.println("31 d�as");
			break;
		case 9:
			System.out.println("30 d�as");
			break;
		case 10:
			System.out.println("31 d�as");
			break;
		case 11:
			System.out.println("30 d�as");
			break;
		case 12:
			System.out.println("31 d�as");
			break;

		default:
			System.out.println("ERROR: Ingrese un n�mero dentro del rango.");
			break;
		}

	}

}
