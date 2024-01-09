package curso;
import java.util.Scanner;

public class numeros {
	
	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese el primer n�mero
	        System.out.print("Ingrese el primer n�mero: ");
	        int numero1 = scanner.nextInt();

	        // Solicitar al usuario que ingrese el segundo n�mero
	        System.out.print("Ingrese el segundo n�mero: ");
	        int numero2 = scanner.nextInt();

	        // Comparar los n�meros e imprimir el resultado
	        if (numero1 > numero2) {
	            System.out.println(numero1 + " es mayor que " + numero2);
	        } else if (numero1 < numero2) {
	            System.out.println(numero2 + " es mayor que " + numero1);
	        } else {
	            System.out.println("Ambos n�meros son iguales");
	        }

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }
	}
