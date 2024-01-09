package curso.condicionales;

import java.util.Scanner;

public class Ciclos3_AGG {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo
			
		String cadena="Anita lava la tina";
		String a;
		String evaluar;
		a=cadena.replace(" ", "");
		
		evaluar=a.toLowerCase();
		
		char [] palindromo;
		
		palindromo=evaluar.toCharArray();
		
		int izquierda=0;
		int derecha=palindromo.length-1;
		
		while (izquierda<derecha)
			{if (palindromo[izquierda]==palindromo[derecha])
				{derecha=derecha-1;
				izquierda=izquierda+1;}
			else {System.out.println("La palabra, No es un palindromo");
			break;}
		if (izquierda==derecha)
		{System.out.println("La Palabra es un Palindromo");}
			
				}
		
	}

}
