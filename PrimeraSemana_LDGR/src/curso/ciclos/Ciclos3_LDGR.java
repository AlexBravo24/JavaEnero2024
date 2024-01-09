package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_LDGR {

	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo
		
		System.out.println("Ingrese una palabra:");
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena = entrada.nextLine();
		
		String cadenaInvertida="";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaInvertida+=cadena.charAt(i);
		}
		
		if(cadena.equals(cadenaInvertida)) {
			System.out.println("La palabra es un palíndromo");
		} else {
			System.out.println("La palabra no es un palíndromo");
		}
		
	
	}

}
