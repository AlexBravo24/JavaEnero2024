package curso;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Verificar si el segundo número es 0
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por 0.");
        } else {
            // Calcular y mostrar el resultado de la división
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
