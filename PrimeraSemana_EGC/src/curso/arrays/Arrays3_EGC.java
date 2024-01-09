package curso.arrays;

import java.util.Scanner;

public class Arrays3_EGC {

	public static void main(String[] args) {
//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres.

		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese la frase...");
		String frase = scan.nextLine();
		int largo = frase.length();
		System.out.println(largo);
		int i = 0;
		char fraseChar [] = new char[largo];
		while (i < largo) {
			fraseChar[i] = frase.charAt(i);
			System.out.println(fraseChar[i]);
			i++;
		}System.out.println(fraseChar);

	}

}
