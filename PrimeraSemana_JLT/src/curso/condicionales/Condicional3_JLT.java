package curso.condicionales;

import java.util.Scanner;

public class Condicional3_JLT {

	public static void main(String[] args) {
		//Este programa pide al usuario dos n�meros, muestra el resultado
		//de su divisi�n, en caso de que el segundo sea 0, muestra un mensaje
		//de error.

		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Este programa muestra la division entre dos n�meros:");
		System.out.print("Introduce el primer n�mero: ");
		n1 =entrada.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		n2 =entrada.nextInt();
		    
		if (n2 != 0) {
		
		System.out.println("El resultado de su division es " + ((double)n1/(double)n2));
		    }else {
		    
		    System.out.println("El segundo n�mero introducido es igual a 0 "
			            + "introduzca un numero v�lido.");
		    }
		
		
	}

}
