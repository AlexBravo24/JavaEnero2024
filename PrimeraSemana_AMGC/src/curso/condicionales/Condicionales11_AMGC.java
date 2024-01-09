package curso.condicionales;

import java.util.Scanner;

public class Condicionales11_AMGC {

	public static void main(String[] args) {
		/* 11. Una compañía de transporte internacional tiene servicio en algunos países de
		 * América del Norte, América Central, América del Sur, Europa y Asia. El costo por
		 * servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida.
		 * Lo anterior se muestra en la siguiente tabla:
		 * 
		 *   ZONA UBICACIÓN               COSTO/KILOGRAMO
		 * 1 América del Norte             24,00 euros
		 * 2 América Central               20, 00 euros
		 * 3 América del Sur               21,00 euros
		 * 4 Europa                        10,00 euros
		 * 5 Asia                          18,00 euros
		 * 
		 * Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados,
		 * por cuestiones de logística y seguridad.
		 * 
		 * Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,
		 * en su caso, el rechazo de la entrega.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int peso;
		int zona;
		int costo;
		
		System.out.println("Bienvenid@");

		System.out.println("Ingrese el peso de su paquete (kg):");
		peso = entrada.nextInt();
		
		System.out.println("Ingrese la zona a donde realiza su envío (1-5):");
		System.out.println("1. América del Norte");
		System.out.println("2. América Central");
		System.out.println("3. América del Sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		
		zona = entrada.nextInt();
		
		
		if (peso<=5) {
			switch (zona) {
			case 1:
				costo = peso * 24;
				System.out.println("El costo de su envío será de €" + costo);
				break;
			case 2:
				costo = peso * 20;
				System.out.println("El costo de su envío será de €" + costo);
				break;
			case 3:
				costo = peso * 21;
				System.out.println("El costo de su envío será de €" + costo);
				break;
			case 4:
				costo = peso * 10;
				System.out.println("El costo de su envío será de €" + costo);
				break;
			case 5:
				costo = peso * 18;
				System.out.println("El costo de su envío será de €" + costo);
				break;

			default:
				System.out.println("Por favor ingrese una zona disponible");
				break;
				} 
	
		} else {
			System.out.println("Por cuestiones de logística y seguridad no aceptamos paquetes con un peso superior a 5kg.");
			System.out.println("Agradecemos su comprensión.");
		}

	}

}
