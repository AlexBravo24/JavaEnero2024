package curso;

import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un n�mero entre uno y doce
        System.out.print("Ingrese un n�mero entre 1 y 12 para representar un mes: ");

        // Verificar si se ingres� un n�mero entero
        if (scanner.hasNextInt()) {
            // Leer el n�mero del mes
            int numeroMes = scanner.nextInt();

            // Llamar a la funci�n para mostrar el n�mero de d�as del mes
            mostrarDiasDelMes(numeroMes);
        } else {
            // Mensaje de error si no se ingres� un n�mero entero
            System.out.println("Error: Ingrese un n�mero entero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Funci�n para mostrar el n�mero de d�as del mes
    public static void mostrarDiasDelMes(int numeroMes) {
        // Usar un switch para determinar el n�mero de d�as del mes
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 d�as.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 d�as.");
                break;
            case 2:
                System.out.println("El mes tiene 28 o 29 d�as, dependiendo de si es un a�o bisiesto.");
                break;
            default:
                // Mensaje de error si el n�mero est� fuera del rango
                System.out.println("Error: Ingrese un n�mero del 1 al 12.");
                break;
        }
    }
}
