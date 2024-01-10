package curso.condicionales;

import java.util.Scanner;

public class condicional2_JLT {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar.

		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Ingresa un numero");
		n= entrada.nextInt();
		
		if ( n % 2 == 0) {
			
			System.out.println("EL NUMERO " + n + " ES PAR");
			
		
		}else {
			
			System.out.println("EL NUMERO " + n + " ES IMPAR");
		}
	}

}
