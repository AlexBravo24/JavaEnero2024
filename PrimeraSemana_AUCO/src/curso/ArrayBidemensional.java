package curso;

public class ArrayBidemensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int[][]matriz = new int [3][3];//[filas] [columnas]
			
			//Indica fila y columna
			matriz [0][0]=1;
			matriz [0][1]=2;//[1][2][3]
			matriz [0][2]=3;
			
			matriz [1][0]=4;
			matriz [1][1]=5;//[4][5][6]
			matriz [1][2]=6;
			
			matriz [2][0]=7;
			matriz [2][1]=8;//[7][8][9]
			matriz [2][2]=9;
			
			//Iniciar matriz desde un inicio
			int [][] matriz2 = {{1,2,3,}, {4,5,6},{7,8,9}};
			
			//Para imprimir hay que indicar donde se encuentra 
			System.out.println(matriz2[0][2]);
			
			//SOLO IMPRIME FILAS
			System.out.println(matriz.length);
			
			//inprime todos los datos
			// dos ciclos foranidados 
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2.length; j++) {
					System.out.print(matriz2[i][j]+" ");
					
				}
				System.out.println();
			}
			
			
			//puedo tener un array que tenga diferentes tipos de datos 
			
			Object []array = new Object[5];
			array[0]=500;
			array[1]="Fernando";
			array[2]='A';
			array[3]=3000.5;
			array[4]=true;
			//La clase objeto hace que se almacenen como tipo de dato unico
			//unicamnete se tienen que mandar a imprimir, uno por uno
			System.out.println(array[3]);
			
	}

}
