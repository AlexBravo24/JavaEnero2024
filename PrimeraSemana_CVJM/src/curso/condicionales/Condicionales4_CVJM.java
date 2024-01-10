package curso.condicionales;

import java.util.Scanner;

public class Condicionales4_CVJM {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y 
		//compruebe si es una letra mayúscula. 

		System.out.println("Digite un caracter");
		char a= new Scanner(System.in).next().charAt(0);
		
		if (Character.isUpperCase(a)) {
			System.out.println(a+" es mayuscula");
		}else {
			System.out.println(a+ " es minuscula");
		}
		
		
		
		
		
		
	}

}
