package curso;

import java.util.Scanner;

public class DistribucionDonacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el monto de la donación
        System.out.print("Ingrese el monto de la donación: ");

        // Verificar si se ingresó un número real
        if (scanner.hasNextDouble()) {
            // Leer el monto de la donación
            double montoDonacion = scanner.nextDouble();

            // Calcular la distribución de la donación según las condiciones dadas
            double centroSalud, comedorNinos, inversionBolsa;

            if (montoDonacion >= 10000) {
                centroSalud = 0.3 * montoDonacion;
                comedorNinos = 0.5 * montoDonacion;
                inversionBolsa = montoDonacion - centroSalud - comedorNinos;
            } else {
                centroSalud = 0.25 * montoDonacion;
                comedorNinos = 0.6 * montoDonacion;
                inversionBolsa = montoDonacion - centroSalud - comedorNinos;
            }

            // Mostrar el resultado
            System.out.printf("Distribución anual de la donación:\n");
            System.out.printf("Centro de Salud: $%.2f\n", centroSalud);
            System.out.printf("Comedor de Niños: $%.2f\n", comedorNinos);
            System.out.printf("Inversión en Bolsa: $%.2f\n", inversionBolsa);
        } else {
            // Mensaje de error si no se ingresó un número real para el monto de la donación
            System.out.println("Error: Ingrese un número real para el monto de la donación.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
