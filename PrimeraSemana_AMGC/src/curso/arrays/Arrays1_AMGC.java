package curso.arrays;

import java.util.Scanner;

public class Arrays1_AMGC {

	public static void main(String[] args) {
		
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int numero;
		
		System.out.println("Ingresa 10 números separados por un enter:");
		for (int i=0; i<10; i++) {
			numeros[i] = entrada.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("Índice:" + i + " | Valor ingresado:" + numeros[i]);
		}

	}

}
