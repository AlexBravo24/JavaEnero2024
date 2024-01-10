package curso;

public class Arrays {

	public static void main(String[] args) {
		// Los ARRAYS o arreglos son una estructura que nos permite
		// almacenar un conjunto de datos de un tipo en común
		
		// La desventaja de los ARRAYS es que estos no pueden crecer
		// en tiempo de ejecución
		
		// Declarar un array de números enteros
		
		int[] numeros; // Declarado sin un tamaño ni datos asignado
		
		int[] numeros2 = new int[3]; // [1], [2], [3]
		
		// Asignamos los valores a guardar en cada posición del array
		// Las posiciones del array inician desde el índice "0"
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		// Ejemplo de un array de String
		String[] nombres = new String[3];
		
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana"; // Si yo agregara nombres[3]="Lex"; abajo de esto
		// y ejecutara el programa, me daría un error, ya que solo 
		//declaré 3 espacios para el array, y ese sería un cuarto dato
		
		// Ejemplo de impresión en consola de un determinado
		// nombre del array
		System.out.println(nombres[1]);
		
		// Ejemplo de declarar un array ya con valores asignados inicialmente
		// Declarar un array de caracteres con letras ya guardadas en él
		
		char[] letras = {'A','l','e','x'};
		
		// Imprimir todos los valores de un array
		// Ejemplo. ¿Qué pasa si quiero imprimir el conjunto de
		// datos llamado numeros2?
		
		System.out.println(numeros2); // Lo correcto es mandar a imprimir
		System.out.println(nombres);  // uno por uno, no todos al mismo
		System.out.println(letras);   // tiempo. Incluso en "letras" que
		                              // sí nos sale, lo correcto es igual
		                              // imprimir uno por uno
		
		// Para poder imprimir cada uno de los valores de nuestro arreglo
		// de números enteros, recuerden que ya conocemos los ciclos
		// Podemos emplear un ciclo for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
	
		
		
	}

}
