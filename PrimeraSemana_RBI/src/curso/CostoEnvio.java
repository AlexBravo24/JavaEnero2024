package curso;

import java.util.Scanner;

public class CostoEnvio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el peso del paquete
        System.out.print("Ingrese el peso del paquete en kilogramos: ");

        // Verificar si se ingresó un número real
        if (scanner.hasNextDouble()) {
            // Leer el peso del paquete
            double pesoPaquete = scanner.nextDouble();

            // Verificar si el peso del paquete es superior a 5 kg
            if (pesoPaquete > 5) {
                System.out.println("El paquete no puede ser transportado por exceder el peso máximo permitido.");
            } else {
                // Solicitar al usuario que ingrese la zona de destino
                System.out.print("Ingrese la zona de destino (1-5):\n"
                                 + "1. América del Norte\n"
                                 + "2. América Central\n"
                                 + "3. América del Sur\n"
                                 + "4. Europa\n"
                                 + "5. Asia\n"
                                 + "Ingrese el número correspondiente a la zona: ");

                // Verificar si se ingresó un número entero
                if (scanner.hasNextInt()) {
                    // Leer la zona de destino
                    int zonaDestino = scanner.nextInt();

                    // Llamar a la función para calcular el costo de envío
                    calcularCostoEnvio(pesoPaquete, zonaDestino);
                } else {
                    // Mensaje de error si no se ingresó un número entero
                    System.out.println("Error: Ingrese un número entero para la zona de destino.");
                }
            }
        } else {
            // Mensaje de error si no se ingresó un número real
            System.out.println("Error: Ingrese un número real para el peso del paquete.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para calcular el costo de envío y mostrar el resultado
    public static void calcularCostoEnvio(double pesoPaquete, int zonaDestino) {
        double costoKilogramo;

        // Determinar el costo por kilogramo según la zona de destino
        switch (zonaDestino) {
            case 1:
                costoKilogramo = 24;
                break;
            case 2:
                costoKilogramo = 20;
                break;
            case 3:
                costoKilogramo = 21;
                break;
            case 4:
                costoKilogramo = 10;
                break;
            case 5:
                costoKilogramo = 18;
                break;
            default:
                // Mensaje de error si la zona de destino no es válida
                System.out.println("Error: Ingrese un número del 1 al 5 para la zona de destino.");
                return;
        }

        // Calcular el costo total del envío
        double costoTotal = pesoPaquete * costoKilogramo;

        // Mostrar el costo total del envío
        System.out.printf("El costo total del envío es de %.2f euros.\n", costoTotal);
    }
}
