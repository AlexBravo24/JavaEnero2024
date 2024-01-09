package curso.arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Índice \t Valor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
    }
}
