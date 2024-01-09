package curso;

public class Arrays {

	public static void main(String[] args) {
		
		//Los arrays o arreglos son una estructura que nos permite
		//almacenar un cojunto de datos de un tipo en común
		//La desventaja de los arrays es que estos no pueden crecer
		//en tiempo de ejecución
		
		//Declarar un array de numeros enteros
		int [] numeros; //Declarado sin un tamaño ni datos asignados
		
		//Declarar el array con un tamaño iniciado
		int [] numeros2 = new int[3]; //[1], [2], [3]
		
		//Asignamos los valores a guardar en cada posicion del array
		//Las posiciones del array inician desde el índice "0"
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//Ejemplo de un array de String
		String [] nombres = new String[4];
		
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana";
		nombres[3]="Lex";
		
		//Ejemplo de impresion en consola de un determinado nombre del array
		System.out.println(nombres[1]);
		
		//Ejemplo de declarar un array ya con valores asignados inicialmente
		//Declarar un array de caracteres con letras ya guardadas en el
		
		char [] letras = {'A','l','e','x'};
		
		//Imprimir todos los valores de un array.
		//Ejemplo que pasa si quiero imprimir el conjunto de datos llamado numeros2
		System.out.println(numeros2);
		System.out.println(nombres);
		System.out.println(letras);
		
		//Para poder imprimir cada uno de los valores de nuestro arreglo
		//de numeros enteros, recuerden que ya conocemos los ciclos
		//Podemos emplear un ciclor for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		

	}

}
