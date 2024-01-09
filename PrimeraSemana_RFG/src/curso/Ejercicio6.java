package curso;
import java.util.Scanner;

public class Ejercicio6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el precio inicial por kilo de uva: ");
	        double precioInicial = scanner.nextDouble();

	        System.out.println("Ingrese el tipo de uva (A/B): ");
	        char tipoUva = scanner.next().charAt(0);

	        System.out.println("Ingrese el tamaño de la uva (1/2): ");
	        int tamanoUva = scanner.nextInt();

	        double precioFinal = 0;

	        if (tipoUva == 'A') {
	            if (tamanoUva == 1) {
	                precioFinal = precioInicial + 0.20;
	            } else if (tamanoUva == 2) {
	                precioFinal = precioInicial + 0.30;
	            }
	        } else if (tipoUva == 'B') {
	            if (tamanoUva == 1) {
	                precioFinal = precioInicial - 0.30;
	            } else if (tamanoUva == 2) {
	                precioFinal = precioInicial - 0.50;
	            }
	        }

	        System.out.println("El productor recibirá " + precioFinal + " euros por kilo de uva.");
	    }
}
