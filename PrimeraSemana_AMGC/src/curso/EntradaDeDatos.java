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
		
		System.out.println("Introduce un n�mero:");
		numero = entrada.nextInt();
		
		System.out.println("Introduce otro n�mero:");
		int numero2;
		numero2 = entrada.nextInt();
		
		System.out.println("La suma de ambos es: " + (numero + numero2));
		
		
		
		//Puedo solicitar valores de tipo string, no solo num�ricos
		String nombre;
		System.out.println("Introduce tu nombre:");
		//nombre = entrada.next();      //solo detecta la primera palabra del texto
		//nombre = entrada.nextLine();  //no espera mi respuesta
		
		/*�POR QU�?
		 * Llega un momento en que el scanner detecta los espacios y los consume con el m�todo nextLine,
		 * entonces se brinca autom�ticamente.
		 * El m�todo nextLine nos permite consumir los espacios, los cuales tambi�n son caracteres
		 * En ocasiones, cuando ya utilizamos el Scanner, se queda "volando" un espacio en buffer
		 * y cuando entra en acci�n lo que hace es consumir ese espacio vac�o.
		 */
		
		//Lo podemos corregir:
		entrada.nextLine(); //consumimos el espacio y lo "brinca" a la siguiente l�nea
		nombre = entrada.nextLine();
		
		System.out.println("Gracias " + nombre);
		
		/*�C�mo puedo hacer que no se ejecute todo lo anterior a esta l�nea?
		 * 1. Selecciono lo que quiero comentar
		 * 2. CTRL + 7
		 * Los mismo para "descomentarlo"
		 * 
		 * Segundo m�todo:
		 * 1. Al principio de lo que quiero comentar, una l�nea antes, ingreso: / *
		 * 2. Al final de lo que quiero comentar, una l�nea despu�s, ingreso: * /
		 * NOTA: no funciona cuando hay otros?
		 */
		
		
		//OPERADOR DE M�DULO - sirve para indicar el valor de residuo de una divisi�n
		int n = 10;
		int divisor = 2;
		//int resultado = n/divisor;
		
		//El operador %, me devuelve el valor del residuio de la divisi�n
		int resultado = n%divisor; 
		
		System.out.println(resultado);

	}

}
