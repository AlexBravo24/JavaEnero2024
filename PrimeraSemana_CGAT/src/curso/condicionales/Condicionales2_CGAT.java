package curso.condicionales;

import java.util.Scanner;
public class Condicionales2_CGAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		

		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println ("Introduce un número");
		numero=entrada.nextInt();
		
		int residuo = numero%2;
		
		if (residuo == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
		
	}

}
