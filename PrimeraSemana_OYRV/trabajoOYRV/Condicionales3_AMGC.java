package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_AMGC {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		// Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Usted está por realizar la división de dos números.");
		System.out.println("Ingrese el primer número:");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo número:");
		b = entrada.nextInt();
		
		
		if (b>0) {
			int resultado = a/b;
			System.out.println("Al dividirlos, el resultado entero es: " + resultado);
		} else {
			System.out.println("ERROR: No es posible realizar la división. El segundo número debe ser mayor a 0");
		}	
		
	}

}
