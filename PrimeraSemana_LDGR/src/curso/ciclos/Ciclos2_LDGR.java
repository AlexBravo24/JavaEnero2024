package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_LDGR {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un n�mero 
		// introducido desde teclado, hasta la iteraci�n deseada por el usuario. 
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("Elija el rango de los n�meros a multiplicar");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero:");
		int n1 = entrada.nextInt();
		
		System.out.println("Introduce el n�mero por el cual deseas multiplicarlo:");
		int n2 = entrada.nextInt();
		
		for (int n3 = 1; n3 <= n2; n3++) {
			System.out.println(n1 + " x " + n3 + " = " + (n1*n3));
		}
		

	}

}
