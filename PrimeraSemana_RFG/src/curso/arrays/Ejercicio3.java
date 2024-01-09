package curso.arrays;

import java.util.Scanner;

public class Ejercicio3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese una frase: ");
	        String frase = scanner.nextLine();

	        char[] caracteres = frase.toCharArray();

	        System.out.println("La frase convertida a un array de caracteres es:");
	        for (char c : caracteres) {
	            System.out.print(c + " ");
	        }
	    }
}
