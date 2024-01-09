package curso;

import java.util.Scanner;

public class Ejercicio11 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el peso del paquete en kilogramos: ");
	        double peso = scanner.nextDouble();

	        if (peso <= 5) {
	            System.out.println("Ingrese la zona a la que va dirigido el paquete:");
	            System.out.println("1 - América del Norte");
	            System.out.println("2 - América Central");
	            System.out.println("3 - América del Sur");
	            System.out.println("4 - Europa");
	            System.out.println("5 - Asia");
	            int zona = scanner.nextInt();

	            double costoPorKilogramo = 0;

	            switch (zona) {
	                case 1:
	                    costoPorKilogramo = 24.00;
	                    break;
	                case 2:
	                    costoPorKilogramo = 20.00;
	                    break;
	                case 3:
	                    costoPorKilogramo = 21.00;
	                    break;
	                case 4:
	                    costoPorKilogramo = 10.00;
	                    break;
	                case 5:
	                    costoPorKilogramo = 18.00;
	                    break;
	                default:
	                    System.out.println("Zona inválida.");
	                    return;
	            }

	            double costoTotal = peso * costoPorKilogramo;
	            System.out.println("El costo por la entrega del paquete es de " + costoTotal + " euros.");
	        } else {
	            System.out.println("El paquete no puede ser transportado por exceder el peso permitido.");
	        }
	    }
	 
}
