package curso.condicionales;

import java.util.Scanner;

public class Condicionales8_LDGR {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado 
		// (dato entero) obtenido al lanzar un dado de seis caras 
		// y muestre por pantalla el número en letras (dato cadena) 
		// de la cara opuesta al resultado obtenido.
		// Nota 1: En las caras opuestas de un dado de seis caras 
		// están los números: 1-6, 2-5 y 3-4.
		// Nota 2: Si el número del dado introducido es menor que 
		// 1 o mayor que 6, se mostrará el mensaje: 
		// “ERROR: número incorrecto”.

     
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce un número del 1 al 6 (caras de un dado):");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("La cara opuesta del número introducido es 6");
			break;
		case 2:
			System.out.println("La cara opuesta del número introducido es 5");
			break;
		case 3:
			System.out.println("La cara opuesta del número introducido es 4");
			break;
		case 4:
			System.out.println("La cara opuesta del número introducido es 3");
			break;
		case 5:
			System.out.println("La cara opuesta del número introducido es 2");
			break;
		case 6:
			System.out.println("La cara opuesta del número introducido es 1");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}
		
	}

}
