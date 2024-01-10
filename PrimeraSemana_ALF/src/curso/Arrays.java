package curso;

public class Arrays {

	public static void main(String[] args) {
		
		//los arrays o arreglos son una estructura que nos permite
		//almacenan un  conjunto de datos de un tipo de datos en comun
		//la desventaja de los arreglos esque no pueden crecer
		// en tiempo de ejecucion
		
		//Declarar un array de numeros enteros
		//Arrays con elementos numericos
		int [] numeros ;
		
		int [] numeros2 = new int[3];
		
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		String [] nombres = new String[3];
		nombres[0] = "Alfredo";
		nombres[1] = "Lopez";
		nombres[2] = "Fernandez";
		
		System.out.println(nombres);
		
		//Declarar arrays con de caracteres
		
		char [] letras = {'A','L','F','R','E','D','O',};
		
		System.out.println(letras);		
		
		//Para imprimir cada uno de nuestros elementos del arreglo
		
		for (int i=0; i<numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
