package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_LDGR {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado 
		// e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer número");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo número");
		b = entrada.nextInt();
		
//		switch (a) {
//		case (a<b):
//			System.out.println((a) + " es menor que " + (b));
//			break;
//		case (a>b):
//			System.out.println((a) + " es mayor que " + (b));
//		case (a==b):
//			System.out.println((a) + " es igual que " + (b));
//		default:
//			System.out.println("Error al ingresar número");
//			break;
//		}
		
		if (a<b){
			System.out.println((a) + " es menor que " + (b));
		}else if (a>b){
			System.out.println((a) + " es mayor que " + (b));
		}else if (a==b){
			System.out.println((a) + " es igual que " + (b));
		}else {
			System.out.println("Error al ingresar número");
		}

	}

}
