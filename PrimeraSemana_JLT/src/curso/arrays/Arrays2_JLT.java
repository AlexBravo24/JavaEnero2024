package curso.arrays;

import java.util.Scanner;

public class Arrays2_JLT {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.

		int [] posicion = new int [100]; 
		int suma=0;
		for (int i = 0; i <=100; i++) {
			System.out.println(suma + " + " + i);
			suma= suma+i;
		}
		System.out.println("La suma de este array es " +suma);
		double media=(suma%100);
		System.out.println("La media de este array es " +media);
        }
	}





