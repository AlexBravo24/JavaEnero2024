package curso;

import java.util.Scanner;

public class CalculoPrecioUva {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio inicial
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tipo de uva (A o B)
        System.out.print("Ingrese el tipo de uva (A/B): ");
        char tipoUva = scanner.next().charAt(0);

        // Solicitar al usuario que ingrese el tamaño de la uva (1 o 2)
        System.out.print("Ingrese el tamaño de la uva (1/2): ");
        int tamanoUva = scanner.nextInt();

        // Calcular el monto final para el productor
        double montoFinal = calcularMontoFinal(precioInicial, tipoUva, tamanoUva);

        // Mostrar el monto final
        System.out.println("El monto final para el productor es: " + montoFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para calcular el monto final para el productor
    public static double calcularMontoFinal(double precioInicial, char tipoUva, int tamanoUva) {
        // Verificar el tipo de uva y aplicar los ajustes según el tamaño
        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                // Se le cargan 20 céntimos al precio inicial
                return precioInicial + 0.20;
            } else if (tamanoUva == 2) {
                // Se le cargan 30 céntimos al precio inicial
                return precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                // Se rebajan 30 céntimos al precio inicial
                return precioInicial - 0.30;
            } else if (tamanoUva == 2) {
                // Se rebajan 50 céntimos al precio inicial
                return precioInicial - 0.50;
            }
        }

        // En caso de tipos o tamaños inválidos
        System.out.println("Tipo o tamaño de uva inválido.");
        return 0.0;
    }
}

