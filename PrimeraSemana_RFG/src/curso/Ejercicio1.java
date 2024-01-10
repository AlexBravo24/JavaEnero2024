package curso;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Los números son iguales.");
        }
    }
	
}
