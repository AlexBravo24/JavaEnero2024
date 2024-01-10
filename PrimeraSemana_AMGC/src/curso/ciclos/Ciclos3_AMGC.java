package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_AMGC {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		System.out.println("Ingrese su palabra:");
		palabra = entrada.nextLine();
				
		int l;   //largo de la palabra
		char letra;
		int i;
		String invertida = "";
		
		
		l = palabra.length(); //obtener el largo de la palabra
		
		
		for (i=l-1; i>=0; i--) {
			letra = palabra.charAt(i);
			invertida = invertida + letra;
		}
		
		if (palabra.contentEquals(invertida)) {
			System.out.println("Se trata de una palabra palíndromo");
		} else {
			System.out.println("Se trata de una palabra no palíndromo");
		}

	}

}
