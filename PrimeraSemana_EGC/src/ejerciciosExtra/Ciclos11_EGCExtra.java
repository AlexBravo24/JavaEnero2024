package ejerciciosExtra;

import java.util.Scanner;

public class Ciclos11_EGCExtra {

	public static void main(String[] args) {
//		11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
//		Ejemplo: 8 x 8

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el alto");
		int largo = scan.nextInt();
		System.out.println("Ingresa lo ancho");
		int ancho = scan.nextInt();

		for (int i = 0; i < largo; i++) {
			for (int b = 0; b < ancho; b++) {
				System.out.print("* ");
			}System.out.println();
		}

	}

}
