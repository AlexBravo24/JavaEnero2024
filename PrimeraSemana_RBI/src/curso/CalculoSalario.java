package curso;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las horas trabajadas
        System.out.print("Ingrese las horas trabajadas en la semana: ");

        // Verificar si se ingresó un número entero
        if (scanner.hasNextInt()) {
            // Leer las horas trabajadas
            int horasTrabajadas = scanner.nextInt();

            // Definir la tarifa por hora regular y por hora extra
            double tarifaRegular = 16.0;
            double tarifaExtra = 20.0;

            // Calcular el salario semanal según las condiciones dadas
            double salarioSemanal;

            if (horasTrabajadas <= 40) {
                salarioSemanal = horasTrabajadas * tarifaRegular;
            } else {
                salarioSemanal = 40 * tarifaRegular + (horasTrabajadas - 40) * tarifaExtra;
            }

            // Mostrar el resultado
            System.out.printf("El salario semanal del obrero es: $%.2f\n", salarioSemanal);
        } else {
            // Mensaje de error si no se ingresó un número entero para las horas trabajadas
            System.out.println("Error: Ingrese un número entero para las horas trabajadas.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
