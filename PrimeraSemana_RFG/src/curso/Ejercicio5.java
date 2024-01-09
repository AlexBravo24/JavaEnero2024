package curso;
import java.util.Scanner;

public class Ejercicio5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la edad: ");
	        int edad = scanner.nextInt();

	        System.out.println("Ingrese la nota: ");
	        int nota = scanner.nextInt();

	        System.out.println("Ingrese el sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);

	        if (nota >= 5 && edad >= 18) {
	            if (sexo == 'M') {
	                System.out.println("POSIBLE");
	            } else if (sexo == 'F') {
	                System.out.println("ACEPTADA");
	            } else {
	                System.out.println("NO ACEPTADA");
	            }
	        } else {
	            System.out.println("NO ACEPTADA");
	        }
	    }
}
