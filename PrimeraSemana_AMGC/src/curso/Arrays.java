package curso;

public class Arrays {

	public static void main(String[] args) {
		
		//Los Arrays o arreglos son una estructura que nos permite almacenar un conjunto de datos
		//de un tipo en común
		//La desventaja de los arrays es que no pueden crecer en tiempo de ejecución.
		
		//Declarar un array de numeros enteros
		int [] numeros; //Declarado sin un tamaño ni datos asignado
		
		
		//Declarar el array con un tamaño inicial
		int [] numeros2 = new int[3];  //es igual a un nuevo conjunto de elementos de 3 números.
		
		//Asignamos los valores a guardar en cada posición del array
		//Las posiciones del array inician desde el índice 0
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//Ejemplo de un array de String
		String[] nombres = new String[3];
		
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana";
		
		//Ejemplo de impresión en consola de un determinado nombre del array
		System.out.println(nombres[1]);
		
		//Ejemplo de declarar un array ya con valores asignados inicialmente
		//Declarar un array de caracteres con letras ya guardadas en ella
		
		char [] letras = {'A', 'l', 'e', 'x'};
		
		//Imprimir todos los valores de un arrat
		//Ejemplo, ¿que pasa si quier imprimir el conjunto de datos llamado numeros2?
		System.out.println(numeros2);
		System.out.println(nombres);
		System.out.println(letras);
		
		//La forma correcta para poder imprimir cada uno de los valores de nuestro arreglo de numeros
		//enteros, podemos hacer un ciclo for
		
		for (int i=0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		for (int i=0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		

	}

}
