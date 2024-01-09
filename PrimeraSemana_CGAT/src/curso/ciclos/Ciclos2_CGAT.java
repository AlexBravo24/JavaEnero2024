package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_CGAT {

	public static void main(String[] args) {
		//  Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		
		
Scanner entrada = new Scanner(System.in);
		
		
		int x;
		System.out.println ("Introduce el número a multiplicar");
		x=entrada.nextInt();
		
		int y;
		System.out.println ("Introduce hasta que número quieres multiplicar");
		y=entrada.nextInt();
		
		int z=0;
		
		int resultado = x*y;
		
		while (z<y) {
			resultado = x*z; 
			
			z = z+1;
			
			System.out.println(x + " por " + z + " es igual a " + resultado);
		
		}
		
		
	}

}
