package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de dos dimensiones
		//pasamos de una estructura lineal a tener un concepto
		//de "tabla", que nos permitirá almacenar datos de forma
		//tabular 
		//teniendo ahora 
		
		
		//ejemplo de declarar un array de dos dimensiones
		//de numeros enteros
		
		//------------------------------falta texto
		
		//Declarar un array de dos dimensiones con calores
		//asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//para utilizar un valor o darle salida, necesitamos
		//indicar la posicion en la que se encuentra
		System.out.println(matriz2[0][2]);
		
		//Recorrer los datos de nuestra matriz y mostrarlos
		//en consola con el uso de dos ciclos anidados
		
		for (int i=0; i<matriz2.length; i++){
			for (int j=0; j<matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
		System.out.println();	
		}
		
		//¿puedo tener un array que contenga nùmeros, caracteres, cadenas de texto, decimales,etc?
		//si, si se puede
		//Existe el tipo de dato de la clase objeto
		
		Object [] array = new Object [5];
		array[0]=500;
		array[1]="Fernando";
		array[2]='A';
		array[3]=30000.50;
		array[4]=true;
		
		System.out.println(array[1]);
		
		
	}

}
