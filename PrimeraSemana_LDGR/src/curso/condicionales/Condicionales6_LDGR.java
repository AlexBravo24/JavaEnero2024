package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_LDGR {

	public static void main(String[] args) {
		
//		La asociaci�n de vinicultores tiene como pol�tica fijar un 
//		precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
//		y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, 
//		�sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto 
//		recibir� un productor por la uva que entrega en un embarque 
//		considerando lo siguiente:
//		
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial 
//		cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//		
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, 
//		y 50 c�ntimos cuando es de tama�o 2.
//		
//		Precio inicial se recibe desde teclado
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio inicial del kg de uva:");
		int precio = entrada.nextInt();
		
		String tipo;
		System.out.println("Introduce si es tipo A o B:");
		entrada.nextLine();
		
		tipo = entrada.nextLine();
		
		System.out.println("Introduce si es tama�o 1 o 2:");
		int tamano = entrada.nextInt();
		
		if(tipo==A||tipo==a && tamano==1) {
			System.out.println("El precio del kg de uva es: $" + (precio+0.20));
		}

	}

}
