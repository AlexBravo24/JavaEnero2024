package curso.arrays;

import java.util.Scanner;

public class Arrays1_EGC {

	public static void main(String[] args) {
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingresa el numero de la posición: " + i);
			numeros[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("En la posición " + i + " está el número " + numeros[i]);
		}

	}

}
