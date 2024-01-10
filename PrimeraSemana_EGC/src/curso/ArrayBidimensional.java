package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de 2 dimesiones
		// pasamos de una estructura lineal
		// a tener un concepto de tabla
		// que nos permitira almacenar datos
		// de forma tabular
		// Teniendo ahora posiciones por indicar tanto para
		// filas como para columnas este array es
		// tambien conocido como matriz

		// ejemplo, declarar un array de 2 dimesiones
		// de numeros enteros

		int[][] matriz = new int[3][3];// [filas][columnas]
		
		//matriz.lenght() devuelve cuantas filas hay

		// ejemplo asignar valores a cada posición del array

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;// [1][2][3]

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;// [4][5][6]

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;// [7][8][9]

		// ejemplo declarar un array con valores desde
		// un inicio

		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// para utilizar un valor o darle salida
		// necesitamos indicar la posición en
		// que esta se encuentra

		System.out.println(matriz2[0][2]);// imprime 3
		
		//ejemplo recorrer datos de una matriz
		//y mostrar en consola con el uso de 
		//2 ciclos anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		//PUEDO TENER UN ARRAY QUE CONTENGA NUMEROS
		//CARACTERES, CADENAS DE TEXTO, DECIMALES ETC?
		//LA RESPUESTA ES SI, UTILIZANDO LA CLASE Object
		//EN JAVA EXISTE EL TIPO DE DATOS DE LA CLASE
		//Object
		Object [] array = new Object [5];
		
		array[0] = 500;
		array[1] = "Fernando";
		array[2] = 'A';
		array[3] = 30000.50;
		array[4] = true;
		
		System.out.println(array[3]);
		
	}

}
