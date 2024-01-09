package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// ARRAY de dos dimensiones
		// Pasamos de una estructura lineal a tener un concepto de
		// "tabla", que nos permitirá almacenar datos de forma tabular,
		// teniendo ahora posiciones por indicar tanto para
		// columnas como para filas.
		// Este array es conocido también como matriz
		
		// Ejemplo: declarar un array de dos dimensiones
		// de números enteros
		
		int [][] matriz = new int[3][3]; // [filas][columnas]
		
		// Asignar valores a cada posición del array
		
		matriz[0][0]=1; // Indico la posición de fila y columna
		matriz[0][1]=2;
		matriz[0][2]=3; // [1][2][3]
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6; // [4][5][6]
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9; // [7][8][9]
		
		// Declarar un array de dos dimensiones con valores
		// asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		// Para utilizar un valor o darle salida, necesitamos
		// indicar la posición en la que se encuentra
		
		System.out.println(matriz2[0][2]); // Para imprimir el número 3
		
		// Recorrer los datos de nuestra matriz y mostrarlos
		// en consola con el uso de dos ciclos anidados
		
		for (int i = 0; i < matriz2.length; i++) // filas
			{
			for (int j = 0; j < matriz2.length; j++) // columnas 
			{
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // Para que no muestre todo en una
			// sola fila, sino que muestre la matriz de 3 x 3
		}
		
		// matriz.length() - Nos da la longitud de las filas
		System.out.println(matriz.length); 
		
		// PREGUNTA DE ENTREVISTA. ¿Puedo tener un ARRAY que contenga 
		// números, caracteres, cadenas de texto, decimales, etc?
		// R = Sí, utilizando la clase Object
		
		// Existe el tipo de dato de la clase Object
		Object[] array = new Object[5];
		
		array[0]=500;
		array[1]="Fernando";
		array[2]='A';
		array[3]=30000.50;
		array[4]=true;
		
		System.out.println(array[2]); // Puedo imprimir cada dato,
		// uno por uno, indicando la posición en la que se
		// encuentra
		
		

	}

}
