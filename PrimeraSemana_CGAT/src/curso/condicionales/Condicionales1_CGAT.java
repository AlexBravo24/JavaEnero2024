package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_CGAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		
		
		Scanner entrada = new Scanner(System.in);
				
		int numero;
		System.out.println ("Introduce un número");
		numero=entrada.nextInt();
		
		System.out.println("Introduce otro número");
		int numero2 = entrada.nextInt();
		
		if (numero > numero2) {
			System.out.println("El número " + numero + " es mayor");
			
		}else if (numero < numero2) {
			System.out.println("El número " + numero2 + " es mayor");
		}else {
			System.out.println("Ambos números son iguales");
		}
		

	}

}
