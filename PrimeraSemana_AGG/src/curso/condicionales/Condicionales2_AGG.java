package curso.condicionales;

import java.util.Scanner;

public class Condicionales2_AGG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y
		// nos indique si es par o impar
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("INGRESA UN NUMERO ");
		numero=entrada.nextInt();

		int divisor = 2;
		int residuo = (numero%divisor);
		
		if(residuo==0)
		{System.out.println("ES NUMERO PAR ");}
		else {System.out.println("ES UN NUMERO IMPAR");}
			
	}

}
