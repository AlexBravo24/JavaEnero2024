package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_Largo_AMGC {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		
		System.out.println("Ingrese su palabra:");
		palabra = entrada.nextLine();
		palabra = palabra.toLowerCase();
		
		System.out.println(palabra);
		
		int l;   //largo de la palabra
		int div;
		char letra;
		char letra2;
		int check=0;
		int i=0;
		int f=1;
		
				
		l = palabra.length(); //obtener el largo de la palabra
		
		//Saber si el largo de la palabra es par o impar
		div=l%2;
		

		//Si es par
		if (div==0) {
			
			do {
				letra = palabra.charAt(i);
				letra2 = palabra.charAt(l-f);
				//System.out.println("Se verificó el par de letras" + (i+1));
				check++;
				i++;
				f++;
			} while (letra==letra2 && i<=((l/2)-1));
			
			//¿Son iguales?
			if (check==(l/2)) {
				System.out.println("Su palabra es palíndroma");
			} else {
				System.out.println("Su palabra no es palíndroma");
			}
			
		} else {  //Para impares
			
			//Compara caracteres
			//aerea
			do {
				letra = palabra.charAt(i);
				letra2 = palabra.charAt(l-f);
				//System.out.println("Se verificó el par de letras" + (i+1));
				check++;
				i++;
				f++;
			} while (letra==letra2 && i<((l-1)/2));
			
			//¿Son iguales?
			if (check==((l-1)/2)) {
				System.out.println("Su palabra es palíndroma");
			} else {
				System.out.println("Su palabra no es palíndroma");
			}
		}

	}

}
