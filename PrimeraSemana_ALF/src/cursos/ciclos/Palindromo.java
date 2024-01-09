package cursos.ciclos;

import java.util.Scanner;

public class Palindromo {

	public static void X(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = entrada.nextLine();
		String invertido= "";
		char auxiliar;
		 
		for(int i= palabra.length() -1 ; i>=0; i--) {
			
			auxiliar = palabra.charAt(i);
			 invertido = invertido + auxiliar;
			
		}
		
		System.out.println("Palabra invertido "+ invertido);
		
		if(palabra.equals(invertido)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
