package curso;

public class Arrays {
	
	public static void main(String[] args) {
		
		// Los arrays o arreglos son una estructura que nos permite almacenar
		// un conjunto de datos de un tipo en comun 
		// la desventaja de los arrays es que estos no pueden crecer en tiempo de ejecucion 
		
		//Declarar un array de numeros enteros 
		
		int [] numeros; //Declarando sin un tamano ni datos asignados
		
		//Declarar el array de numeros enteros
		int [] numeros2 = new int [3]; //[1], [2], [3]
		
		//Asignamos los valores a guardar en casa posicion del array 
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//Ejemplo de un array de String
		String [] nombres = new String [3];
		
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana";
		
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
	//podemos emplear un ciclo for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
	}

}
