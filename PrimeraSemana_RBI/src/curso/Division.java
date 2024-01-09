package curso;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer n�mero
        System.out.print("Ingrese el primer n�mero: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo n�mero
        System.out.print("Ingrese el segundo n�mero: ");
        double numero2 = scanner.nextDouble();

        // Verificar si el segundo n�mero es 0
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por 0.");
        } else {
            // Calcular y mostrar el resultado de la divisi�n
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la divisi�n es: " + resultado);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
