package curso.arrays;

import java.util.Scanner;

public class Arrays1_JLT {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

		int [] numeros = new int [10]; 
		int i;
		
		    System.out.println("Teclea 10 numeros: ");
            for (i = 0; i < 10; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("numeros[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }
            for (i = 0; i < numeros.length; i++) {
            System.out.println("Al indice: " +i+ " le corresponde al valor: " +numeros[i]);
         
            }
	}
	}
	


