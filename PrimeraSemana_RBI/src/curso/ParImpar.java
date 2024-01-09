package curso;
import java.util.Scanner;

public class ParImpar {
	
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número
	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        // Determinar si el número es par o impar y mostrar el resultado
	        if (numero % 2 == 0) {
	            System.out.println(numero + " es un número par.");
	        } else {
	            System.out.println(numero + " es un número impar.");
	        }

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }
	


}
