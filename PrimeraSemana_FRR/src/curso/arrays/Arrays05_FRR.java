package curso.arrays;

import java.util.Scanner;

public class Arrays05_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String productos [] = new String [5];
		
		productos[0] = "huevos";
		productos[1] = "leche";
		productos[2] = "pan";
		productos[3] = "miel";
		productos[4] = "tortillas";
		
		double precios [] = new double [5];
		
		precios[0] = 2.3;
		precios[1] = 19;
		precios[2] = 32.5;
	    precios[3] = 48.6;	
	    precios[4] = 18; 		
	    
		System.out.println("indique el numero de producto (1-5)");
		
		int teclado = entrada.nextInt();
		
		if(teclado <6 && teclado > 0) {
			
			System.out.println("El producto " + productos[teclado - 1] + " tiene un valor de " + precios[teclado - 1] );
			
		} else {
			
			System.out.println("El numero de producto es incorrecto o no existe");
			
		}		

	}

}
