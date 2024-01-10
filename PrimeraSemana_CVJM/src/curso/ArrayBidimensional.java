package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones
		/* Pasamos de una estructura lineal a tener un concepto
		 * de "Tabla", que nos permitirá almacenar datos de 
		 * forma tabular 
		 * Teniendo ahora posiciones por inficar tanto para 
		 * columnas como para filas 
		 * Este array es conocido tambien como matriz
		 * de numeros enteros
		 */

		int [][]matriz= new int [6][4] ; //[filas][columnas]
			
		///Asignar valores a cada posicion del array 
			
		matriz [0][0]= 1; //Indico la posicion de final y columna 
		matriz [0][1]= 2;
		matriz [0][2]= 3; //[1][2][3]
		
		matriz [1][0]= 4; 
		matriz [1][1]= 5;
		matriz [1][2]= 6; //[4][5][6]
		
		matriz [2][0]= 7; 
		matriz [2][1]= 8;
		matriz [2][2]= 9; //[7][8][9]
		
		//Declarar un array de dos dimensiones con valores 
		//asignados desde un inicio
		
		int [][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Para utilizar un valor o darle salida, necesitamos 
		//la posicion en la que se encuentra
		
		System.out.println(matriz2[0][2]);
			
	
		//Recorrer los datos de nuestra matriz y mostrarlos en 
		//consola el uso de dos ciclos anidados
		
		for (int i=0; i<matriz2.length;i++) {
			for (int j=0; j<matriz2.length;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();//Hacer un salto de linea
		}
		
		//matriz.leng() - devuelve el valor de las filas
	
		System.out.println(matriz.length);	
		
		//¿Puedo tener un array que contenga numeros, caracteres
		//cadena de texto, decimales, etc?
		
		//Existe el tipo de datos de la clase Objetc
		Object [] array = new Object [5];
		
		array [0]=500;
		array [1]="Fernando";
		array [2]='A';
		array [3]=30000.5;
		array [4]=true;
		
		System.out.println(array[1]);
		
		
	}

}
