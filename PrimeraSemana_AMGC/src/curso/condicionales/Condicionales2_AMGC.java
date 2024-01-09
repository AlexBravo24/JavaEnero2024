package curso.condicionales;

import java.util.Scanner;

public class Condicionales2_AMGC {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		
		System.out.println("Ingrese un número:");
		a = entrada.nextInt();
		
		int divisor = 2;
		int residuo = a%2;
		
		if (residuo==0) {
			System.out.println("El número ingresado es par");
		} else {
			System.out.println("El número ingresado es impar");
		}
	}

}
