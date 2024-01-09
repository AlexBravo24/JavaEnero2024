package curso.condicionales;

import java.util.Scanner;

public class Ciclos2_AGG {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner entrada = new Scanner(System.in);
		
		int factor1;
		int factor2;
		int producto;
		int x;
		
		
		System.out.println("Introduce el primer numero");
		factor1=entrada.nextInt();
		
		System.out.println("Introduce el segundo número a multiplicar");
		factor2=entrada.nextInt();
		
		producto = (factor1 * factor2);
		
		x=(factor1+factor1);
		
		do {System.out.println(x);
		x= x+factor1;
		}
		while (x<=producto);
		

	}

}
