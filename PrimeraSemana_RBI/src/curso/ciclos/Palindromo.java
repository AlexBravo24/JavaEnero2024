package curso.ciclos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena
        System.out.print("Ingrese una cadena para verificar si es un pal�ndromo: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es un pal�ndromo
        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un pal�ndromo.");
        } else {
            System.out.println("La cadena no es un pal�ndromo.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Funci�n para verificar si una cadena es un pal�ndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios en blanco y convertir a min�sculas para hacer la comparaci�n m�s robusta
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su versi�n invertida
        return cadena.equals(new StringBuilder(cadena).reverse().toString());
    }
}
