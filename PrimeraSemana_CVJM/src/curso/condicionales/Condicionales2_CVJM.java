package curso.condicionales;

import java.util.Scanner;

public class Condicionales2_CVJM {

	public static void main(String[] args) {
		
		// Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar
		
		
		System.out.println("Proporciona un numero: ");
		int numero= new Scanner(System.in).nextInt();
		
		  if (numero % 2==0) {
			System.out.println("El numero "+ numero +" es par");
		}else {
			System.out.println("El numero "+ numero +" es impar");
		}
		
		
		

	}

}
