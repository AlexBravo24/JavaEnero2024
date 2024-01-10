package curso.condicionales;

import java.util.Scanner;

public class Condicionales08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cara del dado");
		
		int dado = entrada.nextInt();
		
		switch (dado) {
		case 1:
			System.out.println("la cara opuesta es seis");
			break;
		case 2:
			System.out.println("la cara opuesta es cinco");
			break;
		case 3:
			System.out.println("la cara opuesta es cuatro");
			break;
		case 4:
			System.out.println("la cara opuesta es tres");
			break;
		case 5:
			System.out.println("la cara opuesta es dos");
			break;
		case 6:
			System.out.println("la cara opuesta es uno");
			break;
			default: 
				System.out.println("error");
				break;
		}

	}

}
