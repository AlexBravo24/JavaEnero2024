package curso;

public class Arrays {

	public static void main(String[] args) {
		// Los array o arreglos son una estructura que nos permite
		// almacenar un conjuunto de datos de un tipo en comun
		// la desventaja es que los arrays no pueden crecer
		// en tiempo de ejecución

		// declarar un array de numeros enteros

		int[] numeros; // declarado sin un tamaño ni datos asignados

		// Declarar array con tamaño inicial
		int[] numeros2 = new int[3]; // [], [], []

		// Asignamos los valores a guardar en cada posicion
		// Las posiciones del array inician desde el indice "0"
		numeros2[0] = 1;
		numeros2[1] = 2;
		numeros2[2] = 3;

		// ejemplo con String
		String[] nombres = new String[3];
		nombres[0] = "Edwin";
		nombres[1] = "Juan";
		nombres[2] = "Jake";

		// ejemplo de impresion en consola
		System.out.println(nombres[0] + " es el número " + numeros2[0]);

		// ejemplo de declarar un array ya con valores asignados
		// Declarar un array de characteres
		// con letras ya guardadas en el

		char[] letras = { 'A', '0', 'X', '7' };
		
		//Imprimir todos los valores de un array
		//Ejemplo que pasa si quiero imprimir el conjunto de datos
		System.out.println(numeros2);//no funciona
		System.out.println(nombres);//no funciona
		System.out.println(letras);// si funciona
		
		//Para poder imprimir cada uno de los valores del arrehlo
		//de numeros enteros podemos usar FOR
		
		for (int i=0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]);
		}

	}
}
