package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_CVJM {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero que deseas multiplicar:");
		int x= entrada.nextInt();
		
		int i=1;
		while (i<=95) {
			System.out.println(x+"x"+i+"="+(x*i));
			i++;
		}
				
		
				
		
		
	
		
	}

}
