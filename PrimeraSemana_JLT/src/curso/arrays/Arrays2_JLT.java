package curso.arrays;

import java.util.Scanner;

public class Arrays2_JLT {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.

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





