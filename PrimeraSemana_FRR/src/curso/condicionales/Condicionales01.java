package curso.condicionales;

import java.util.Scanner;

public class Condicionales01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
	
		Scanner entrada = new Scanner(System.in);
				System.out.println("introduce el primer numero");
		int numero = entrada.nextInt();
		
		System.out.println("introduce el segundo numero");
		int numero2 = entrada.nextInt();
		
		if (numero < numero2) {
			System.out.println(numero+ " es menor que "+ numero2);
		}else if (numero > numero2) {
			System.out.println(numero + " es mayor que "+ numero2);
			
		}else {
			System.out.println("los numeros son iguales");
		}
	


	
	}

}
