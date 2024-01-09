package ejerciciosCiclos;

import java.util.Scanner;

public class Ejercicio2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el número para generar la tabla de multiplicar: ");
	        int numero = scanner.nextInt();

	        System.out.println("Ingrese la iteración deseada para la tabla de multiplicar: ");
	        int iteracion = scanner.nextInt();

	        for (int i = 1; i <= iteracion; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }
}
