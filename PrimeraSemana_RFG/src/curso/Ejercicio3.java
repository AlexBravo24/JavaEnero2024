package curso;
import java.util.Scanner;

public class Ejercicio3 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el dividendo: ");
	        double dividendo = scanner.nextDouble();

	        System.out.println("Ingrese el divisor: ");
	        double divisor = scanner.nextDouble();

	        if (divisor != 0) {
	            double resultado = dividendo / divisor;
	            System.out.println("El resultado de la división es: " + resultado);
	        } else {
	            System.out.println("Error: No se puede dividir entre cero.");
	        }
	    }

}
