package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de 2 dimensiones
		//Pasamos de un aestructura lineal a tener un concepto 
		//de tabla, que nos permitira alamcenar datos de forma
		//tabluar
		//teniendo ahora posiciones por indicar tanto 
		//para columnas como para filas 
		//Este array es conocido tambien como matriz
		
		//ejemplo, declarar un array de 2 dimensiones
		//de numeros enteros
		
		int [] [] matriz = new int [3] [3] ; //1 filas, 2 columnas
        
		//Asiganar valores a cada posicion del array
		
		matriz [0] [0] = 1; //indico la posicion de fila y columna
		matriz [0] [1] = 2;
	    matriz [0] [2] = 3; // [1][2][3]
	    
	    matriz [1] [0] = 2;
	    matriz [1] [1] = 2;
	    matriz [1] [2] = 2;
	    
	    matriz [2] [0] = 2;
	    matriz [2] [1] = 2;
	    matriz [2] [2] = 2;
	    
	    //Declarar un array de 2 dimensiones con valores 
	    //asignados desde un inicio
	    
	    int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
	    
	    //Para utilizar un valor o darle salida, necesitamos 
	    //indicar la posicion en la que se encuentra
	    
	    System.out.println(matriz2[0][2]);
	    
	    //recorrer los datos de nuestra matriz y mostrarloes 
	    //en consola con el uso de dos ciclos anidados
	    
	    for (int i = 0; i < matriz2.length; i++) {
	    	for (int j = 0; j < matriz2.length; j++) {
	    		System.out.print(matriz2[i][j] + " ");
				
			}
  	        System.out.println();
			
		}
	    
//	    //matriz.length () - devuelve el valor de las filas
//	    System.out.println(matriz.length);
	    
	    //¿ puedo tener un array que contenga numeros,
	    //caracteres, cadenas de texto, decimal, etc
	    //Sí 
	    
	    //Existe el tipo de dato de la clase Object
	    Object [] array = new Object [5];
	    
	    array[0] =500;
	    array[1] = "Fernando";
	    array[2] = 'A';
	    array[3] = 300000.50;
	    array[4] = true;
	    
	    System.out.println(array[1]);
	    
 	}
	

}
