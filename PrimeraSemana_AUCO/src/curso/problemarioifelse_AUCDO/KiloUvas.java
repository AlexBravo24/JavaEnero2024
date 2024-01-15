package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class KiloUvas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		int base,uva,kilos;
		
		
		System.out.println("Agregue precio base para un kilo de uvas");
		base = sc.nextInt();
		
		System.out.println("Selecciona un tipo de uva (1,2,3 o 4)");
		uva = sc.nextInt();
		
		switch (uva) {
		
			case 1:
				System.out.println("El precio por kilo es de: "+(base+0.20));
				break;
			case 2:
				System.out.println("El precio por kilo es de: "+(base+0.30));
				break;
			case 3:
				System.out.println("El precio por kilo es de: "+(base-0.30));
				break;
			case 4:
				System.out.println("El precio por kilo es de: "+(base-0.50));
				break;
				
				default:
				break;
		}

	}

}
