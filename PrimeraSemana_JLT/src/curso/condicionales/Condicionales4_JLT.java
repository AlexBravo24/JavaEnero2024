package curso.condicionales;

import java.util.Scanner;

public class Condicionales4_JLT {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula
		
		Scanner entrada = new Scanner(System.in);

		String cadena;
		
		System.out.println("ESTE PROGRAMA SOLICITA UNA CADENA AL USUARIO Y COMPRUEBA SI ES UNA LETRA MAYUSCULA");
		System.out.println("Ingresa una cadena");
		cadena= entrada.nextLine();
		
		if (cadena.length() != 1){
		System.out.println("La cadena no es una letra mayúscula");
		   
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       
		System.out.println("La cadena es una letra mayúscula.");
		    
	    }else {
		        
	    System.out.println("La cadena no es una letra mayúscula.");
		
	    }
	}

}
