package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_EGC {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de multiplicar de un numero 
		introducido desde teclado, hasta la iteración deseada por el usuario. 
		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingreso el primer numero: ");
		int num1 = scan.nextInt();
		System.out.println("Ingreso el segundo numero: ");
		int num2 = scan.nextInt();
		for(int i = 1; i <= num2; i++) {
			//int x = 12;
			System.out.println( num1 +" por " + i + " es igual a " + (num1*i));
		}

	}

}
