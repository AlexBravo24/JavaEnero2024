package curso;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//los arrays son una eztructura que nos permite
		//almacenar un conjunto de datos de un tipo en comun 
		//la desventaja de los arrays es que no pueden crecer
		//en tiempo de ejecución
		
		//DECLARAR UN ARRAY DE NUMEROS ENTEROS
		
		int [] numeros; //declarado sin un tamaño especificado
		
		//declarar el array con un tamaño inicial
		
		int [] numeros2 = new int [3]; //[1], [24], [33] por ejemplo (el 3 solo declara el tamaño
		//asignamos los valores a asignar empezando desde 0 que equivale al primer espacio
		//
		numeros2 [0] = 1;
		numeros2 [1] = 2;
		numeros2 [2] = 3;
		
		//array de elementos string
		String [] nombres = new String [3];
		
		nombres[0] = "Alex";
		nombres[1] = "Nestor";
		nombres[2] = "Ana";
		
		// si solo quiero imprimir el numero 1 entonces sería asi
		
		System.out.println(nombres[1]);
		
		//ejemplo de declarar un array ya con valores asignados inicialmente
		//con letras guardadas en el 
		
		char [] letras = {'A','L','E','X'};
		 
		//imprimir todos los valores de un array
		
		System.out.println(numeros2); //muestra un codigo raro
		System.out.println(nombres);  //muestra un codigo raro
		System.out.println(letras);   //no causa ningun problema pero es necesario determinar que posicion
		
		//para poder imprimir cada un de los valores de nuestro arreglo
		//de numeros enteros podemos emplear ciclos 
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
			
		}
		
	}

}
