package curso;

public class arrays {

	public static void main(String[] args) {
		
		//Los arrays/arreglos son una estructura que nos permite almacenar un conjunto
		//de datos de un tipo en comun
		
		int []numeros; 
		//esta declarado sin tamaño
		
		int []numero2 = new int [3]; 
		//este puede contener 3 numero/3 espacios 
		
		
		//asigna valores a guardar
		//las pociociones del array inician en 0
		numero2[0]=1;
		numero2[1]=2;
		numero2[2]=3;
		
		
		
		//array de elementos string
		String[]nombres= new String[4];
		
		nombres[0]="alex";
		nombres[1]="nestor";
		nombres[2]="ana";
		nombres[3]="juan";
		
		//impresion en consola
		System.out.println(nombres[2]);
		
		
		//ejemplo de declarar array con vbalores asignados inicialmente
		//array de caracteres 
		char[]letras = {'A','l','e','x'};
		
		
		
		//imprime todos los valores
		System.out.println(numero2);
		
		//para imprimir todos los arreglos de un int se ocupa un for
		for (int i = 0; i < numero2.length; i++) {
			System.out.println(numero2[i]);
		}
		
		
	}

}
