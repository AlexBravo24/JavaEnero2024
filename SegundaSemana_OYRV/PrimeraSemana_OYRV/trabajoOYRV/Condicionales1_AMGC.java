package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_AMGC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer n�mero:");
		a = entrada.nextInt();
		
		System.out.println("Igresa el segundo n�mero");
		b = entrada.nextInt();
		
		if (a<b) {
			System.out.println(b + " es el mayor.");
		} else if (a>b){
			System.out.println(a + " es el mayor");
		} else {
			System.out.println("Ambos n�meros son iguales");
		}

	}

}
