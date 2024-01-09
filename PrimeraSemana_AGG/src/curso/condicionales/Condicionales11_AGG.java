package curso.condicionales;

import java.util.Scanner;

public class Condicionales11_AGG {

	public static void main(String[] args) {
		// Una compañía de transporte internacional tiene servicio en algunos países de América
		//del Norte, América Central, América del Sur, Europa y Asia.
		//El costo por servicio de transporte se basa en el peso del paquete y
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		//ZONA       UBICACIÓN       COSTO/KILOGRAMO
		// 1     América del Norte     24,00 euros
		// 2      América Central      20, 00 euros
		// 3      América del Sur      21,00 euros
		// 4           Europa			10,00 euros
		// 5            Asia           18,00 euros
		//Parte de su política implica que los paquetes con un peso superior a 5kg
		//no son transportados, por cuestiones de logística y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete
		//o, en su caso, el rechazo de la entrega.

		Scanner entrada=new Scanner(System.in);
		
		double peso;
		int zona;
		
		System.out.println("Introduce el peso del paquete");
		peso=entrada.nextDouble();
		
		System.out.println("Indica la zona dirigida");
		zona=entrada.nextInt();
		
			
		
		
	}

}
