package curso.ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número para el cual se generará la tabla de multiplicar
        System.out.print("Ingrese un número para generar la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Solicitar al usuario la iteración deseada
        System.out.print("Ingrese la iteración deseada: ");
        int iteracionDeseada = scanner.nextInt();

        // Imprimir la tabla de multiplicar
        System.out.printf("Tabla de multiplicar del %d hasta la iteración %d:\n", numero, iteracionDeseada);

        for (int i = 1; i <= iteracionDeseada; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
