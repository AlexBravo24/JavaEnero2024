package curso.condicionales;

import java.util.Scanner;

public class Condicionales06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el tipo de uva (A o B)");
		String tipo = entrada.nextLine();
		
		System.out.println("Ingrese el tamaño de la uva (1 o 2");
		int tamano = entrada.nextInt();
		
		System.out.println("ingrese el precio inicial de la uva");
		int precio = entrada.nextInt();
		
		if (tipo.toUpperCase().equals("A") && tamano == 1) {
			System.out.println("Se le pagará" + precio + .2);
		}else if (tipo.toUpperCase().equals("A") && tamano == 2) {
			System.out.println("se le pagará" + precio + .3);
		}else if (tipo.toUpperCase().equals("B") && tamano == 1) {
			System.out.println("se le pagará" + precio - .3);
		}else if (tipo.toUpperCase().equals("A") && tamano == 2) {
			System.out.println("se le pagará" + precio - .5);	
		}
		
	}
	}

