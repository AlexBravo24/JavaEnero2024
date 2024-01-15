package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class MayorIgual {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		int a, b, resultado;
		
		System.out.println("Agregue numero a ");
		
		a = sc.nextInt();
		
		System.out.println("Agregue numero b");
		
		b = sc.nextInt();
		
		if (a>b) {
			System.out.println("El numero mayot es "+a);
		} else if (b>a) {
			System.out.println("El numero mayor es "+b);
		} else {
			System.out.println("Ambos numeros son iguales");
		}

	}

}
