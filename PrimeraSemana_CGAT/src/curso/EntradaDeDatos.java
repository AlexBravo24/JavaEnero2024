package curso;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entrada de datos 
		//por teclado
		
		//Utilizamos la clase Scanner
		
//		Scanner entrada = new Scanner(System.in);
//		
//		//Una vez podamos ingresar por teclado, necesitamos las
//		//variables adecuadas
//		
//		int numero;
//		System.out.println ("Introduce un número");
//		numero=entrada.nextInt();
//		
//		System.out.println("Introduce otro número");
//		int numero2 = entrada.nextInt();
//		
//		System.out.println("La suma de ambos es: " + (numero + numero2));
//		
//		String nombre;
//		System.out.println ("Introduce tu nombre");
//		entrada.nextLine(); //El método .nextLine consume los espacios vacios
//		// esto sirve cuando ya utilizamos el scanner y queda
//		//volando un espacio
//		nombre=entrada.nextLine();
//		
//		System.out.println("Tu nombre es: " + nombre);
		
		//Seleccionar lo que no necesitamos ejecutar del código
		// y CTRL +7 para comentar las líneas
		
		//Operador de módulo - Sirve para indicar el valor de residuo
		// de una división
		
		int n = 10;
		
		int divisor = 2;
		
		//El operador % me devuelve el valor de residuo de la división
		int resultado = n%divisor;
		
		System.out.println (resultado);
		
		
	}

}
