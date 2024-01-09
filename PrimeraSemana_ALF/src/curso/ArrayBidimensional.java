package curso;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//Array de dos dimenciones
		/*Pasamos de una estructura lineal a tener un concepto
		 * de tabla que nos permita almacenar datos de forma
		 * tabular
		 * Teniendo ahora posiciones por indicar tanto para columnas
		 * como para filas
		 * Este array tambien es conocida como matriz*/
		
		int [] [] matriz= new int[3][3];
								//[filas][columnas]
		//Asignar valores a cada posicion del array
		
		matriz [0][0]=1;//indico la posicion de fila y columna
		matriz [0][1]=2;
		matriz [0][2]=3;//1,2,3
		
		matriz [1][0]=4;
		matriz [1][0]=5;
		matriz [1][0]=6;
		
		matriz [2][0]=2;
		matriz [2][1]=2;
		matriz [2][2]=2;
		
		//Declarrar array  de dos dimesiones con valores
		//Asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		//Para utilizar un valoro darle  salida necsitamos
		//indicar la posicion en la que se encuentra
		//System.out.println(matriz2[0][2]);
		
		/*Recorrer los datos de nuestra matriz  y mostrarlos
		 * en consola con el uso de dos ciclos anidados*/
		for(int i=0; i<matriz2.length; i++) {
			for(int j=0; j<matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
		//	MATRIZ.LENGTH() DEVUELVE EL VALOR DE LAS FILAS
			System.out.println();
			
			/*Pueod tener  un array  que contenga numeros, caracteres
			 * cadena de texto, decimales etc
			 * 
			 * 
			 * EXISTE EL TIPO DE DATO DE CLASE OBJET*/	
		}
		Object [] array = new Object[5];
		
		array[0]= 500;
		array[1]= "Alfredo";
		array[2]= 'A';
		array[3]= 3000.50;
		array[4]= true;
		
		System.out.println(array[1]);
		
	}

}
