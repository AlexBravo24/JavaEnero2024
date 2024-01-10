package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_AMGC {

	public static void main(String[] args) {
		
		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		 * desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int multi;  //multiplicador
		int lim;    //iteraciones o limite
		int resultado;
		
		//Captura de datos ingresados
		System.out.println("Ingrese la tabla de multiplicar que desea visualizar:");
		multi = entrada.nextInt();
		
		System.out.println("Ingrese la iteración deseada:");
		lim = entrada.nextInt();
		
		//Ciclo
		for (int veces=1; veces<=lim; veces++) {
			resultado = veces * multi;
			System.out.println(veces + " x " + multi + " = " + resultado);
		}

	}

}
