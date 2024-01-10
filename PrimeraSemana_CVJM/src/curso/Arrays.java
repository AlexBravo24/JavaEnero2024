package curso;

public class Arrays {

	public static void main(String[] args) {
		/* Los ARRAYS o ARREGLOS
		 * Son una estructura que nos permite almacenar un conjunto
		 * de datos de un tipo común
		 * 
		 * DESVENTAJA: No puedes crecer en tiempo de ejercución
		 */
		
		//Declarar un array de numeros enteros
		int []numeros; //Declarado sin un tamaño ni datos asignados
		
		//Declarar array con tamaño inicial
		int[]numeros2 = new int [3]; // [1], [2], [3] nos permite 3 
		//numeros dentro 
		
		//Asignamos los valores a guardar en cada posicion del array
		//Las posiciones del array indican desde el indice 0
		
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//Ejemplo de un array de String
		String [] nombres =new String[3];
		
		nombres[0]="Alex";
		nombres[1]="Valeria";
		nombres[2]="Ana";
		
		//Ejemplo de impresion de un determinado nombre del array
		System.out.println(nombres[1]);
		
		//Ejemplo de declarar un array ya con valores asignados
		//inicalmente
		//Declarar un array de cacateres con letra ya guardadas en el 
		
		char [] letras = {'A', 'l', 'e', 'x'};
		 
		//Imprimir todos los valores de un array 
		//Ejemplo que pasa si quiero imprimir el conjunto de datos 
		//llamado nombres
		//Con los tipo char si deja mandando imprimir todos, en los 
		//demas no, pero lo correcto es mandar a imprimir solo 1
	
		System.out.println(letras);
		
		//Podemos emplear ciclo for
		for (int i=0; i<numeros2.length; i++) {
			System.out.println(numeros2[i]);
				
		}
		
		
				
		
		
		
		

	}

}
