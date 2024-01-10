package curso.arrays;

import java.util.Scanner;

public class Arrays3_AMGC {

	public static void main(String[] args) {
		
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char c;
		
		System.out.println("Ingresa una frase:");
		frase = entrada.nextLine();
		
		char [] separada = new char[frase.length()];
		
		System.out.println("Los elementos del array son: ");
		for (int i=0; i<frase.length(); i++) {
			c = frase.charAt(i);
			separada[i] = c;
			System.out.println(separada[i]);
		}

	}

}
