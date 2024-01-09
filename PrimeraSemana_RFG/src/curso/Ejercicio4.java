package curso;

import java.util.Scanner;

public class Ejercicio4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese una letra: ");
	        char caracter = scanner.next().charAt(0);

	        if (Character.isUpperCase(caracter)) {
	            System.out.println("La letra ingresada es mayúscula.");
	        } else {
	            System.out.println("La letra ingresada no es mayúscula.");
	        }
	    }
	
}
