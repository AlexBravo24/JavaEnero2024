package curso;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número del día de la semana
        System.out.print("Ingrese el número del día de la semana (1-7): ");
        
        // Verificar si se ingresó un número entero
        if (scanner.hasNextInt()) {
            // Leer el número del día de la semana
            int numeroDia = scanner.nextInt();

            // Llamar a la función para mostrar el día correspondiente
            mostrarDiaSemana(numeroDia);
        } else {
            // Mensaje de error si no se ingresó un número entero
            System.out.println("Error: Ingrese un número entero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para mostrar el día de la semana correspondiente al número
    public static void mostrarDiaSemana(int numeroDia) {
        // Usar un switch para determinar el día de la semana
        switch (numeroDia) {
            case 1:
                System.out.println("Día de la semana: Lunes");
                break;
            case 2:
                System.out.println("Día de la semana: Martes");
                break;
            case 3:
                System.out.println("Día de la semana: Miércoles");
                break;
            case 4:
                System.out.println("Día de la semana: Jueves");
                break;
            case 5:
                System.out.println("Día de la semana: Viernes");
                break;
            case 6:
                System.out.println("Día de la semana: Sábado");
                break;
            case 7:
                System.out.println("Día de la semana: Domingo");
                break;
            default:
                // Mensaje de error si el número está fuera del rango
                System.out.println("Error: Ingrese un número del 1 al 7.");
                break;
        }
    }
}
