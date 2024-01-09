package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_AMGC {

	public static void main(String[] args) {
		
		/* 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o.
		 * Se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque
		 * considerando lo siguiente:
		 * 
		 * 	* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1
		 * y 30 c�ntimos si es de tama�o 2.
		 * 	* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		 * 
		 * Precio inicial se recibe desde teclado
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		String tipo;
		int tama�o;
		double precioInicial;
		double precioFinal;
		
		System.out.println("Por favor ingrese las caracter�sticas del kg de uva a vender.");
		System.out.println("Ingrese tipo (A o B):");
		tipo = entrada.next();
		tipo = tipo.toUpperCase();
		
		System.out.println("Ingrese tama�o (1 o 2):");
		tama�o = entrada.nextInt();
		
		System.out.println("Ingrese precio inicial del kilo de uva:");
		precioInicial = entrada.nextDouble();
		
		
		
		// TIPO DE UVA A
		if(tipo.contentEquals("A")) {
			if (tama�o==1) {
				precioFinal = precioInicial + 0.020;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else if (tama�o==2) {
				precioFinal = precioInicial + 0.030;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else {
				System.out.println("ERROR: Favor de ingresar un tama�o de uva v�lido, 1 o 2.");
			}
		
		// TIPO DE UVA B
		} else if (tipo.contentEquals("B")) {
			if (tama�o==1) {
				precioFinal = precioInicial - 0.030;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else if (tama�o==2) {
				precioFinal = precioInicial - 0.050;
				System.out.println("El precio final del kg de uva es: " + precioFinal);
			} else {
				System.out.println("ERROR: Favor de ingresar un tama�o de uva v�lido, 1 o 2.");
			}
		
		// TIPO DE UVA INCORRECTO
		} else {
			System.out.println("ERROR: Favor de ingresar un tipo de uva v�lido, A o B.");
		}
		
	}

}
