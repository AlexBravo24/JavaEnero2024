package curso.arrays;

import java.util.Scanner;

public class Arrays3_LDGR {

	public static void main(String[] args) {
		
		// Pide al usuario por teclado una frase y 
		// pasa sus caracteres a un array de caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		System.out.println("Introduce una frase corta:");
		entrada.nextLine(); 
		
		frase = entrada.nextLine();
		
		String[] array = new String[100];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(frase[i]);
		}

	}

}
