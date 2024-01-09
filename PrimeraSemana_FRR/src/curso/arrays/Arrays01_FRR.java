package curso.arrays;

import java.util.Scanner;

public class Arrays01_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numeros [] = new int [10];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("ingrese el numero " + (i + 1));
			
			numeros[i] = entrada.nextInt();
			
			System.out.println("El numero " + numeros[i] + " ahora se encuentra en la posicion " + (i + 1));

		}
		
		System.out.println("Gracias, se ha completado la entrada de datos");
		
		
	}

}
