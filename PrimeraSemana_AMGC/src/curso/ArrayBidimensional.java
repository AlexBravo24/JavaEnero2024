package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//ARRAY DE DOS DIMENSIONES
		//Pasamos de una estructura lineal a tener un concepto de "tabla".
		//Nos permititrá almacenar datos de forma tabular.
		//Teniendo ahora posiciones por indicar tanto para columnas, como para filas.
		
		//Este array es conocido también como Matriz.
		
		//Ejemplo, declarar un array de 2D, de números enteros:
		
		int [] [] matriz = new int [6][3]; //[filas] [columnas]
		
		//Asignar valores a cada posición del array
		
		matriz [0][0] = 1; //Indico la posición de fila y columna para almacenar su valor
		matriz [0][1] = 2;
		matriz [0][2] = 3; //[1][2][3]
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6; //[4][5][6]
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9; //[7][8][9]
		
		//Declarar un array de dos dimensiones con valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//Para utilizar un valor o darle salida, necesitamos la posición en la que se encuentra.
		System.out.println(matriz2[0][2]);
		
		//Recorrer los datos de nuestra matriz y mostrarlos en consola usando dos ciclos anidados.
		for (int i=0; i<matriz2.length; i++) {
			for (int j=0; j<matriz2.length; j++){
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println("");
		}
		
		//matriz.length() - devuelve el valor de las filas
		System.out.println(matriz.length);
		
		//¿Puedo tener un array que contenga números, caracteres, cadenas de texto, decimales, etc?
		//Sí, utilizando la clase Object:
		
		
		//Existe el tipo de dato de la clase Object
		Object [] array = new Object[5];
		
		array[0] = 500;
		array[1] = "Fernando";
		array[2] = 'A';
		array[3] = 30000.5;
		array[4] = true;
		
		System.out.println(array[3]);


	}

}
