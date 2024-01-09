package curso.arrays;

public class Arrays4_AMGC {

	public static void main(String[] args) {
		
		/* 4. Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}.
		 * Guardar los valores de este array en otro array distinto pero con los valores invertidos,
		 * es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		 */
		
		int [] numeros = {1, 2, 3, 4, 5};
		int [] numeros2 = new int[5];
		int x = numeros.length - 1;
		
		
		for (int i=0; i<numeros.length; i++) {
			numeros2[i] = numeros[x];
			x--;
			System.out.println("Array 1[" + i + "]: " + numeros[i] + " | Array 2[" + i + "]: " + numeros2[i]);
		}
	}

}
