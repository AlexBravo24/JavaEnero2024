package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_AMGC {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
		// Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Usted est� por realizar la divisi�n de dos n�meros.");
		System.out.println("Ingrese el primer n�mero:");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo n�mero:");
		b = entrada.nextInt();
		
		
		if (b>0) {
			int resultado = a/b;
			System.out.println("Al dividirlos, el resultado entero es: " + resultado);
		} else {
			System.out.println("ERROR: No es posible realizar la divisi�n. El segundo n�mero debe ser mayor a 0");
		}	
		
	}

}
