package curso;

import java.util.Scanner;

public class DistribucionDonacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el monto de la donaci�n
        System.out.print("Ingrese el monto de la donaci�n: ");

        // Verificar si se ingres� un n�mero real
        if (scanner.hasNextDouble()) {
            // Leer el monto de la donaci�n
            double montoDonacion = scanner.nextDouble();

            // Calcular la distribuci�n de la donaci�n seg�n las condiciones dadas
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
            System.out.printf("Distribuci�n anual de la donaci�n:\n");
            System.out.printf("Centro de Salud: $%.2f\n", centroSalud);
            System.out.printf("Comedor de Ni�os: $%.2f\n", comedorNinos);
            System.out.printf("Inversi�n en Bolsa: $%.2f\n", inversionBolsa);
        } else {
            // Mensaje de error si no se ingres� un n�mero real para el monto de la donaci�n
            System.out.println("Error: Ingrese un n�mero real para el monto de la donaci�n.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
