package curso;

import java.util.Scanner;

public class VerificarMayuscula {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es una letra mayúscula
        if (esMayuscula(cadena)) {
            System.out.println("La cadena ingresada es una letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada no es una letra mayúscula.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para verificar si una cadena es una letra mayúscula
    public static boolean esMayuscula(String cadena) {
        // Verificar si la cadena tiene longitud 1 y es una letra mayúscula
        return cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0));
    }
}
