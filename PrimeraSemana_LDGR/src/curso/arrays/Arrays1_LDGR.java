package curso.arrays;

import java.util.Scanner;

public class Arrays1_LDGR {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos 
		// por teclado. Muestra por consola el �ndice y el valor al que 
		// corresponde
		
		Scanner entrada = new Scanner(System.in); //Entrada de datos por teclado
		
		int[] numeros = new int[10];
		
		
		System.out.println("Escriba los elementos del arreglo: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i+1)+". Escriba un n�mero: ");
			numeros[i]= entrada.nextInt();
			
		}
		
		System.out.println("Los n�meros del arreglo son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posici�n del ARRAY " + i + ": " + numeros[i]);
		}
		
		
	}

}
