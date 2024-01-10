package curso;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Entrada de datos
		// por teclado 
		// Utilizamos a la clase Scanner
		//*La clase Scanner para obtener la entrada del usuario 
		//*Si queremos utilizar todas las clases de java.util
		//*se coloca "*" en vez de Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//Una vez podemos ingresar datos por teclado, necesitamos
		//las variables adecuadas para poder guardarlos
		//*Con la variable "entrada" se solicitará el metodo 
		//*.nextLine para texto, .nextInt para enteros y
		//*.nextDouble para decimales para recuperar toda la
		//* informacion de la consola que se ha proporcionado
		
	
		System.out.println("Introduce un numero: ");
		int numero= entrada.nextInt();
	
		System.out.println("Introduce otro numero: " );
		int numero2= entrada.nextInt();
		
		System.out.println("La suma de los dos numeros es: " + (numero+numero2));
		
		
		System.out.println("Introduce tu nombre: ");
		
		entrada.nextLine(); // El metodo .nextLine, nos permite consumir los 
		//espacios que obviamente tambien son caracteres, En ocasiones
		//cuando ya utilizamos el scanner, se queda "volando"un espacio en buffer
		// y cuando entra en accion lo que hace es consumir ese espacio vacio
		
		//*Cuando se utiliza lso metodos .nextInt, Double etc no detectan el fin
		//* por lo tanto hay que hacer un salto de linea con la variable 
		
		
		String nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es: " + nombre);
		
		//(Seleccionar lo que no necesitemos del codigo y CTRL+7
		
		//Poner al principio /* y al final */)
		
		
		
		// OPERADOR DE MODULO - Sirve para indicar el valor de residuo 
		// de una division 
		
		int n = 10;
		int divisor= 2;
		
		// El operador / me devuelve el valor del residuo de la division
		int resultado = n/divisor;
		
		System.out.println(resultado);
		
		
		
				
				

				
	
		
		
		
	}

}
