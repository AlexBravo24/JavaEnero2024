package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_AMGC {

	public static void main(String[] args) {
		
		/* 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
		 * Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño.
		 * Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque
		 * considerando lo siguiente:
		 * 
		 * 	* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1
		 * y 30 céntimos si es de tamaño 2.
		 * 	* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		 * 
		 * Precio inicial se recibe desde teclado
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		String tipo;
		int tamaño;
		double precioInicial;
		double precioFinal;
		
		System.out.println("Por favor ingrese las características del kg de uva a vender.");
		System.out.println("Ingrese tipo (A o B):");
		tipo = entrada.next();
		tipo = tipo.toUpperCase();
		
		System.out.println("Ingrese tamaño (1 o 2):");
		tamaño = entrada.nextInt();
		
		System.out.println("Ingrese precio inicial del kilo de uva:");
		precioInicial = entrada.nextDouble();
		
		
		
		// TIPO DE UVA A
		if(tipo.contentEquals("A")) {
			if (tamaño==1) {
				precioFinal = precioInicial + 0.020;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else if (tamaño==2) {
				precioFinal = precioInicial + 0.030;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else {
				System.out.println("ERROR: Favor de ingresar un tamaño de uva válido, 1 o 2.");
			}
		
		// TIPO DE UVA B
		} else if (tipo.contentEquals("B")) {
			if (tamaño==1) {
				precioFinal = precioInicial - 0.030;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else if (tamaño==2) {
				precioFinal = precioInicial - 0.050;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else {
				System.out.println("ERROR: Favor de ingresar un tamaño de uva válido, 1 o 2.");
			}
		
		// TIPO DE UVA INCORRECTO
		} else {
			System.out.println("ERROR: Favor de ingresar un tipo de uva válido, A o B.");
		}
		
	}

}
