package curso;

import java.util.Scanner;

public class CaraOpuestaDado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el resultado del dado
        System.out.print("Ingrese el resultado del dado (1-6): ");
        int resultadoDado = scanner.nextInt();

        // Calcular y mostrar la cara opuesta al resultado del dado
        mostrarCaraOpuesta(resultadoDado);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para mostrar la cara opuesta al resultado del dado
    public static void mostrarCaraOpuesta(int resultadoDado) {
        if (resultadoDado >= 1 && resultadoDado <= 6) {
            // Usar un switch para determinar la cara opuesta
            switch (resultadoDado) {
                case 1:
                    System.out.println("Cara opuesta: 6");
                    break;
                case 2:
                    System.out.println("Cara opuesta: 5");
                    break;
                case 3:
                    System.out.println("Cara opuesta: 4");
                    break;
                case 4:
                    System.out.println("Cara opuesta: 3");
                    break;
                case 5:
                    System.out.println("Cara opuesta: 2");
                    break;
                case 6:
                    System.out.println("Cara opuesta: 1");
                    break;
            }
        } else {
            // Mensaje de error si el número del dado es incorrecto
            System.out.println("ERROR: número incorrecto");
        }
    }
}
