package curso.arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 n�meros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("�ndice \t Valor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
    }
}
