package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_CGAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales
		
		
		Scanner entrada = new Scanner(System.in);
				
		int numero;
		System.out.println ("Introduce un n�mero");
		numero=entrada.nextInt();
		
		System.out.println("Introduce otro n�mero");
		int numero2 = entrada.nextInt();
		
		if (numero > numero2) {
			System.out.println("El n�mero " + numero + " es mayor");
			
		}else if (numero < numero2) {
			System.out.println("El n�mero " + numero2 + " es mayor");
		}else {
			System.out.println("Ambos n�meros son iguales");
		}
		

	}

}
