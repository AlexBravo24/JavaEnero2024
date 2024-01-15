package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, resultado;
		
		System.out.println("Agregue numero a");
		a = sc.nextInt();
		System.out.println("Agregue numero b");
		b = sc.nextInt();
		
		if (b==0) {
			System.out.println("Error, ingrese otro valor");
		}else {
			resultado = a/b;
			System.out.println("Resultado: "+resultado);
		}

	}

}
