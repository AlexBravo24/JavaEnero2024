package curso;

import java.util.Scanner;

public class Ejercicio14 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese las horas trabajadas esta semana: ");
	        int horasTrabajadas = scanner.nextInt();

	        double salario = 0;

	        if (horasTrabajadas <= 40) {
	            salario = horasTrabajadas * 16; // $16 por hora trabajada
	        } else {
	            int horasExtras = horasTrabajadas - 40;
	            salario = (40 * 16) + (horasExtras * 20); // $16 por las primeras 40 horas y $20 por hora extra
	        }

	        System.out.println("El salario semanal del obrero es: $" + salario);
	    }
}
