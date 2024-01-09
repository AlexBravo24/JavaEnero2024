package curso;

import java.util.Scanner;

public class CostoEnvio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el peso del paquete
        System.out.print("Ingrese el peso del paquete en kilogramos: ");

        // Verificar si se ingres� un n�mero real
        if (scanner.hasNextDouble()) {
            // Leer el peso del paquete
            double pesoPaquete = scanner.nextDouble();

            // Verificar si el peso del paquete es superior a 5 kg
            if (pesoPaquete > 5) {
                System.out.println("El paquete no puede ser transportado por exceder el peso m�ximo permitido.");
            } else {
                // Solicitar al usuario que ingrese la zona de destino
                System.out.print("Ingrese la zona de destino (1-5):\n"
                                 + "1. Am�rica del Norte\n"
                                 + "2. Am�rica Central\n"
                                 + "3. Am�rica del Sur\n"
                                 + "4. Europa\n"
                                 + "5. Asia\n"
                                 + "Ingrese el n�mero correspondiente a la zona: ");

                // Verificar si se ingres� un n�mero entero
                if (scanner.hasNextInt()) {
                    // Leer la zona de destino
                    int zonaDestino = scanner.nextInt();

                    // Llamar a la funci�n para calcular el costo de env�o
                    calcularCostoEnvio(pesoPaquete, zonaDestino);
                } else {
                    // Mensaje de error si no se ingres� un n�mero entero
                    System.out.println("Error: Ingrese un n�mero entero para la zona de destino.");
                }
            }
        } else {
            // Mensaje de error si no se ingres� un n�mero real
            System.out.println("Error: Ingrese un n�mero real para el peso del paquete.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Funci�n para calcular el costo de env�o y mostrar el resultado
    public static void calcularCostoEnvio(double pesoPaquete, int zonaDestino) {
        double costoKilogramo;

        // Determinar el costo por kilogramo seg�n la zona de destino
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
                // Mensaje de error si la zona de destino no es v�lida
                System.out.println("Error: Ingrese un n�mero del 1 al 5 para la zona de destino.");
                return;
        }

        // Calcular el costo total del env�o
        double costoTotal = pesoPaquete * costoKilogramo;

        // Mostrar el costo total del env�o
        System.out.printf("El costo total del env�o es de %.2f euros.\n", costoTotal);
    }
}
