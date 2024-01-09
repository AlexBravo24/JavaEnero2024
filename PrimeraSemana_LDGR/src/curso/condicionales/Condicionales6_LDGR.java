package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_LDGR {

	public static void main(String[] args) {
		
//		La asociación de vinicultores tiene como política fijar un 
//		precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
//		y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
//		ésta es de un sólo tipo y tamaño, se requiere determinar cuánto 
//		recibirá un productor por la uva que entrega en un embarque 
//		considerando lo siguiente:
//		
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial 
//		cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//		
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, 
//		y 50 céntimos cuando es de tamaño 2.
//		
//		Precio inicial se recibe desde teclado
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio inicial del kg de uva:");
		int precio = entrada.nextInt();
		
		String tipo;
		System.out.println("Introduce si es tipo A o B:");
		entrada.nextLine();
		
		tipo = entrada.nextLine();
		
		System.out.println("Introduce si es tamaño 1 o 2:");
		int tamano = entrada.nextInt();
		
		if(tipo==A||tipo==a && tamano==1) {
			System.out.println("El precio del kg de uva es: $" + (precio+0.20));
		}

	}

}
