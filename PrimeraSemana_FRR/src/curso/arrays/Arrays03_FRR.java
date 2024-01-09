package curso.arrays;

import java.util.Scanner;

public class Arrays03_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int c = 0;
		
		System.out.println("Ingrese una palabra");
		
		String cadena = entrada.nextLine();
		
		char caracteres [] = new char[cadena.length()];
		
		for (int i = 0; i < cadena.length(); i++) {
			
			c = c + 1;
			
			caracteres[i] = cadena.charAt(i);
			
			System.out.println("La letra " + cadena.charAt(i) + " se encuentra en la posición "+ (i + 1));
			
						
		} 
		
	System.out.println("la cantidad de caracteres es " + c);
		
		
		
		

	}

}
