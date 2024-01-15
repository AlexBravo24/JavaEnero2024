package curso;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//entrada de datos
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero");
		numero=entrada.nextInt();
		
		int numero2;
		System.out.println("introduzca otro numero");
		numero2=entrada.nextInt();
		
		System.out.println("La suma de estos numeros es "+ (numero+numero2));
		
		String nombre;
		System.out.println("Introduzca su nombre");
		entrada.nextLine();
		nombre=entrada.nextLine();
		System.out.println("Su nombre es "+ nombre);
		
	}

}
