package curso;

public class Arrays {

	public static void main(String[] args) {
		// ARRAYS - (ARREGLOS) son estructuras que nos permiten almacenar un conjunto
		//de datos de un tipo en comun
		//desventaja de los arrays es que no pueden crecer en tiempo de ejecucion
		
		//Declarar un array de numeros enteros
		
		int[] numeros; //declarado sin un tamaño ni datos asignados
		
		//declarar el array con un tamaño iniciado
		
		int [] numeros2=new int [3]; //[1], [2], [3]
		//Asignamos los valores a guardar en cada posición de array
		//las posiciones del array inician desde el indice "0"
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//ejemplo de un array de String
		String[] nombres = new String[3];
		
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana";
		
		//ejemplo de impresion en consola de un determinado nombre del array
		
		System.out.println(nombres[1]);
		
		//Ejemplo de declarar un array ya con valores asignados inicialmente
		//declarar un array con caracteres
		
		char[] letras= {'A','l','e','x'};
				
				
		//imprimir todos los valores de un array.
		//ejemplo: que pasa si quiero imprimir el conjunto de datos llamados
				
		
		
	}

}
