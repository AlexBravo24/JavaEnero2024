package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_CGAT {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		
		System.out.println("Ingresa una palabra");
		
		Scanner entrada = new Scanner(System.in);
		//String palabra;
		String palabra = entrada.nextLine();
		String palabraInvertida = "";
		
		for (int i = palabra.length() - 1; i>= 0; i--) {
			palabraInvertida += palabra.charAt(i);
		}
		if (palabra.equals(palabraInvertida)) {
			System.out.println("La cadena es un palíndromo");
		}else {
			System.out.println("La cadena no es un palíndromo");
		}
		

		
		
		

	}

}
