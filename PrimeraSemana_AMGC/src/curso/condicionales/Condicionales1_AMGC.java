package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_AMGC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer número:");
		a = entrada.nextInt();
		
		System.out.println("Igresa el segundo número");
		b = entrada.nextInt();
		
		if (a<b) {
			System.out.println(b + " es el mayor.");
		} else if (a>b){
			System.out.println(a + " es el mayor");
		} else {
			System.out.println("Ambos números son iguales");
		}

	}

}
