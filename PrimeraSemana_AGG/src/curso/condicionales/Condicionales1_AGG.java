package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_AGG {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado 
		// e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("introduce un numero");
		numero1=entrada.nextInt();
		
		System.out.println("introduce un segundo número");
		numero2=entrada.nextInt();
		
		if (numero1==numero2) 
		{System.out.println("AMBOS NUMEROS SON IGUALES");}
		else if (numero1>numero2)
		{System.out.println("EL NUMERO MAYOR ES " + numero1);}
		else if (numero1<numero2)
		{System.out.println("EL NUMERO MAYOR ES " + numero2);}
		
		
		
		
	}

}
