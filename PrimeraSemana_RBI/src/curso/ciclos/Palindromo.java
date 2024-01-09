package curso.ciclos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena
        System.out.print("Ingrese una cadena para verificar si es un palíndromo: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios en blanco y convertir a minúsculas para hacer la comparación más robusta
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su versión invertida
        return cadena.equals(new StringBuilder(cadena).reverse().toString());
    }
}
