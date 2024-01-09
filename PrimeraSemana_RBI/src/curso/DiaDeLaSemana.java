package curso;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el n�mero del d�a de la semana
        System.out.print("Ingrese el n�mero del d�a de la semana (1-7): ");
        
        // Verificar si se ingres� un n�mero entero
        if (scanner.hasNextInt()) {
            // Leer el n�mero del d�a de la semana
            int numeroDia = scanner.nextInt();

            // Llamar a la funci�n para mostrar el d�a correspondiente
            mostrarDiaSemana(numeroDia);
        } else {
            // Mensaje de error si no se ingres� un n�mero entero
            System.out.println("Error: Ingrese un n�mero entero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Funci�n para mostrar el d�a de la semana correspondiente al n�mero
    public static void mostrarDiaSemana(int numeroDia) {
        // Usar un switch para determinar el d�a de la semana
        switch (numeroDia) {
            case 1:
                System.out.println("D�a de la semana: Lunes");
                break;
            case 2:
                System.out.println("D�a de la semana: Martes");
                break;
            case 3:
                System.out.println("D�a de la semana: Mi�rcoles");
                break;
            case 4:
                System.out.println("D�a de la semana: Jueves");
                break;
            case 5:
                System.out.println("D�a de la semana: Viernes");
                break;
            case 6:
                System.out.println("D�a de la semana: S�bado");
                break;
            case 7:
                System.out.println("D�a de la semana: Domingo");
                break;
            default:
                // Mensaje de error si el n�mero est� fuera del rango
                System.out.println("Error: Ingrese un n�mero del 1 al 7.");
                break;
        }
    }
}
