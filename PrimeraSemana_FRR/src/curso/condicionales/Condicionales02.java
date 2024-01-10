package curso.condicionales;

import java.util.Scanner;

public class Condicionales02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
				Scanner entrada = new Scanner(System.in);
			
				
				System.out.println("introduce un numero");
	
				int numero = entrada.nextInt();
				
				int residuo = (numero%2);
				
				if (residuo > 0 ) {
					System.out.println("el numero es impar");
				}else if (residuo == 0 ) {
					System.out.println("el numero es par");
				}
				
				
	
	}

}
