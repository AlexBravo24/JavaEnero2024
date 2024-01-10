package curso.ciclos;

import java.util.Scanner;

public class Ciclos2_JLT {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar 
		//de un numero introducido desde teclado, 
		//hasta la iteración deseada por el usuario

		Scanner entrada = new Scanner(System.in);

		int x;
		int y;
		
		System.out.println("ESTE PROGRAMA REALIZA LA TABLA DE MULTIPLICAR DE UN VALOR HASTA LA ITERACION DESEADA");
		System.out.println("Ingresa el valor para realizar tu tabla");
		x= entrada.nextInt();
		System.out.println("Ingresa hasta que valor deseas realizar tu tabla");
		y= entrada.nextInt();
		System.out.println("Tabla del " + x + " hasta el " + y );
	    for(int i = 1; i<=y; i++){
	         System.out.println(x + " * " + i + " = " + x*i);
	}
	}

}
