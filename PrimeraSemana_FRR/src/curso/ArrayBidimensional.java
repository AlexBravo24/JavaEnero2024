package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAY DE DOS DIMENSIONES
		//pasamos de una estructura lineal a tener un concepto de tabla 
		//que nos permitira almacenar datos de forma tabular
	    // teniendo ahora posiciones para indicar filas y columnas
		//este array es conocido tambien como matriz
		
		
		//Ejemplo declarar un array de dos dimensiones
		//de numeros enteros
		
		int [] [] matriz = new int [3][3]; //filas y columnas en ese orden

		//asignar valores a cada popsicion del array
		
		matriz [0][0] = 1; //indico la posicion de fila y columna para almacenar su valor
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		
		// [1][2][3]
		
		matriz [1][0] = 4;
		matriz [1][1] =	5;			
		matriz [1][2] =	6;
		
		matriz [2][0] = 7;
		matriz [2][1] =	8;			
		matriz [2][2] =	9;
		
		//Declarar un array de dos dimensiones con valores asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}}; //es lo mismo que lo de arriba
		
		//para utilizar un valor o darle salida, necesitamos indicar la posicion 
		//en la que se encuentra
		
		System.out.println(matriz2[0][2]);
		
		//Recorrer los datos de la matriz y mostrarlos en consola con el uso de ciclos anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2 [i][j] + " ");
				
			}
			System.out.println();
		}
		
		//matriz.length devuelve el valor de las filas unicamente
		System.out.println(matriz2.length);
		
		//puedo tener un array que contenga numeros, caracteres
		//cadenas de texto, decimales, etc?
		
		//Existe el tipo de dato clase Objet
		
		Object [] array = new Object [5];
		
		array[0] = 500;
		array[1] = "Fernando";
		array[2] = 'A';
		array[3] = 30000.50;
		array[4] = true;
		
		System.out.println(array[4]); //imprime lo que se le dicta sin importar el tipo de dato
		//al usar la clase objet
 		
	}

}
