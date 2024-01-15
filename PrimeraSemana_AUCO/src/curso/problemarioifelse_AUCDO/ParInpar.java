package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class ParInpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, divisor;
		divisor = 2;
		System.out.println("Agregue un numero");
		numero = sc.nextInt();
		
		if (numero%divisor==0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Non");
		}

	}

}
