package curso;

import java.util.Scanner;

public class EntradaDeDatos {
	
	public static void main(String[] args) {
		
		//ENTRADA DE DATOS POR TECLADO
		//UTILIZAMOS LA CLASE SCANNER
		
		Scanner entrada = new Scanner(System.in);
		
		//Cuando se puedan ingresar datos, se necesitan las variables
		//adecuadas para poder guardarlas
		
		int numero;
				
		System.out.println("Introduce un número");
		numero=entrada.nextInt();
		
		int numero2;
		
		System.out.println("Introduce otro numero");
		numero2=entrada.nextInt();
				
		System.out.println("la suma de ambos numeros es "+ (numero+numero2));
		
		String nombre;
		
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //se utiliza para consumir el espacio
		//y deje ingresar los datos 
		//en ocasiones cuando ya utilizamos el Scanner, queda volando
		//un espacio en buffer y lo que hace es consumir ese espacio vacio
		
		nombre = entrada.nextLine();
		//aqui ya se puede agregar el nombre 
		
		System.out.println("Tu nombre es "+ nombre);
		
		//OPERADOR DE MODULO SIRVE PARA INDICAR EL RESIDUO DE UNA DIVISION
		
		int n = 10;
		
		int divisor = 3;
		
		//El operador % me devuelve el residuo de la division
		int resultado = n%divisor;
		
		System.out.println(resultado);
		//como resultado de 10/3 me dará 1 de resultado
		
		
		
		
		
		
	}

}
