package curso.condicionales;

import java.util.Scanner;

public class Condicionales4_AMGC {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		Scanner entrada = new Scanner(System.in);
		
		String letra;
		System.out.println("Ingrese una letra:");
		letra = entrada.next();
		
		if (letra==letra.toUpperCase()) {
			System.out.println("La letra es may�scula.");
		} else {
			System.out.println("La letra es min�scula.");
		}
		
	}

}
