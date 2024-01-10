package curso.arrays;

import java.util.Scanner;

public class FraseAArray {

	public static void main(String[] args) {
		System.out.println("Frase a arreglo");
//		Scanner ent= new Scanner(System.in);
//		System.out.println("Introduce una frase:");
//		String frase = ent.nextLine();
//		
		String cadena= "Hola mundo a generacion 159";
		
		String[] lista= cadena.split(" ");
		
		for(int i=0; i<lista.length; i++) {
			System.out.println("Caracteres: "+ lista[i]);
			
		}
		
	}

}
