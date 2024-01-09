package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_EGC {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la palabra...");
		String cadena = scan.next();
		int longitud = cadena.length();
		String alreves = "";
		for (int i = longitud - 1; i >= 0; i--) {
			alreves += cadena.charAt(i);
		}
		if (cadena.compareToIgnoreCase(alreves) == 0) {
			System.out.println(cadena + " es palindromo de " + alreves);

		} else {
			System.out.println(cadena + " no es palindromo de " + alreves);
		}

	}
}
