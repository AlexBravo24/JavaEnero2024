package curso;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 12 para representar un mes: ");
        int numeroMes = scanner.nextInt();
        int dias = 0;

        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                System.out.println("ERROR: Número incorrecto. Debe ser entre 1 y 12.");
                return;
        }

        System.out.println("El mes " + numeroMes + " tiene " + dias + " días.");
    }
}
