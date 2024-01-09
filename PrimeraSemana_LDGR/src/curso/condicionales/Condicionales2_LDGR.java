package curso.condicionales;

import java.util.Scanner;

public class Condicionales2_LDGR {

	public static void main(String[] args) {
		// Realiza un programa que pida un 
		// número por teclado y nos indique si es par o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce un número:");
		numero = entrada.nextInt();
		
        int divisor = 2;
		
		int resultado = numero%divisor;
		
		if(resultado != 0) {
			System.out.println((numero) + " es un número impar");
		} else {
			System.out.println((numero) + " es un número par");
		}
		

	}

}
