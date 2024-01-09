package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_CGAT {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		
		
Scanner entrada = new Scanner(System.in);
		
		int numero4;
		System.out.println ("Introduce el primer número");
		numero4=entrada.nextInt();
		
		int numero5;
		System.out.println ("Introduce el segundo número");
		numero5=entrada.nextInt();
		
		int resultado = numero4/numero5;
		
		System.out.println ("El resultado es: " + resultado);
		
	

	}
	

}
