package curso;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//ENTRADA DE DATOS
		//Por teclado
		
		//Utilizamos la clase Scanner
		Scanner entrada = new Scanner(System.in); //Nos ayuda a introducir los valores por telcado
		
		//Una vez podemos ingresar datos por teclado,
		//necesitamos las variables adecuadas para poder guardarlos
		int numero;
		
		System.out.println("Introduce un número:");
		numero = entrada.nextInt();
		
		System.out.println("Introduce otro número:");
		int numero2;
		numero2 = entrada.nextInt();
		
		System.out.println("La suma de ambos es: " + (numero + numero2));
		
		
		
		//Puedo solicitar valores de tipo string, no solo numéricos
		String nombre;
		System.out.println("Introduce tu nombre:");
		//nombre = entrada.next();      //solo detecta la primera palabra del texto
		//nombre = entrada.nextLine();  //no espera mi respuesta
		
		/*¿POR QUÉ?
		 * Llega un momento en que el scanner detecta los espacios y los consume con el método nextLine,
		 * entonces se brinca automáticamente.
		 * El método nextLine nos permite consumir los espacios, los cuales también son caracteres
		 * En ocasiones, cuando ya utilizamos el Scanner, se queda "volando" un espacio en buffer
		 * y cuando entra en acción lo que hace es consumir ese espacio vacío.
		 */
		
		//Lo podemos corregir:
		entrada.nextLine(); //consumimos el espacio y lo "brinca" a la siguiente línea
		nombre = entrada.nextLine();
		
		System.out.println("Gracias " + nombre);
		
		/*¿Cómo puedo hacer que no se ejecute todo lo anterior a esta línea?
		 * 1. Selecciono lo que quiero comentar
		 * 2. CTRL + 7
		 * Los mismo para "descomentarlo"
		 * 
		 * Segundo método:
		 * 1. Al principio de lo que quiero comentar, una línea antes, ingreso: / *
		 * 2. Al final de lo que quiero comentar, una línea después, ingreso: * /
		 * NOTA: no funciona cuando hay otros?
		 */
		
		
		//OPERADOR DE MÓDULO - sirve para indicar el valor de residuo de una división
		int n = 10;
		int divisor = 2;
		//int resultado = n/divisor;
		
		//El operador %, me devuelve el valor del residuio de la división
		int resultado = n%divisor; 
		
		System.out.println(resultado);

	}

}
