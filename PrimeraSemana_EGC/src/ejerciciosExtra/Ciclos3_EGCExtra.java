package ejerciciosExtra;

import java.util.Scanner;

public class Ciclos3_EGCExtra {

	public static void main(String[] args) {
//		4.Programa que reciba una frase y una letra por teclado. 
//		Deber� retornar como resultado cu�ntas veces existe esa letra dentro de la frase. 
//		Si no existe, imprimir un mensaje �Car�cter no encontrado�.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la frase");
		String frase = scan.nextLine();
		System.out.println("Ingresa la letra que deseas buscar");
		char letra = scan.next().charAt(0);
		int lon = frase.length();
		int veces = 0;

		for (int i = 0; i < lon; i++) {

			//System.out.println(frase.charAt(i));
			if (frase.charAt(i) == letra) {
				veces++;
			}

		}System.out.println("En total se encontr� la letra '"+ letra +"' un total de " + veces +" veces.");

	}

}
