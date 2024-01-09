package curso;

import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre uno y doce
        System.out.print("Ingrese un número entre 1 y 12 para representar un mes: ");

        // Verificar si se ingresó un número entero
        if (scanner.hasNextInt()) {
            // Leer el número del mes
            int numeroMes = scanner.nextInt();

            // Llamar a la función para mostrar el número de días del mes
            mostrarDiasDelMes(numeroMes);
        } else {
            // Mensaje de error si no se ingresó un número entero
            System.out.println("Error: Ingrese un número entero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para mostrar el número de días del mes
    public static void mostrarDiasDelMes(int numeroMes) {
        // Usar un switch para determinar el número de días del mes
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 o 29 días, dependiendo de si es un año bisiesto.");
                break;
            default:
                // Mensaje de error si el número está fuera del rango
                System.out.println("Error: Ingrese un número del 1 al 12.");
                break;
        }
    }
}
