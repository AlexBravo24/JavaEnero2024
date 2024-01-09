package curso.condicionales;

import java.util.Scanner;

public class Condicionales4_AGG {

	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado
		// y compruebe si es una letra mayúscula.

		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		System.out.println("Escribe una palabra");
		palabra=entrada.nextLine();
		
		String mayuscula;
		String minuscula;
		
		minuscula=palabra.toLowerCase();
		mayuscula=palabra.toUpperCase();	
		
		if(palabra==minuscula)
		{System.out.println("Esta en minusculas");}
		if(palabra==mayuscula)
		{System.out.println("Esta en mayusculas");}
		if(palabra!=mayuscula&&palabra!=minuscula)
		{System.out.println("La palabra o frase tiene ambas");
		
		}
		
	}

}
