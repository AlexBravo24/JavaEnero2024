package ejerciciosCiclos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase para verificar si es un palíndromo: ");
        String palabra = scanner.nextLine();
        
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra o frase ingresada es un palíndromo.");
        } else {
            System.out.println("La palabra o frase ingresada NO es un palíndromo.");
        }
    }
}
