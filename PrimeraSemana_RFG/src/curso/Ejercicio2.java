package curso;
import java.util.Scanner;

public class Ejercicio2 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un n�mero par.");
        } else {
            System.out.println(numero + " es un n�mero impar.");
        }
    }
}
