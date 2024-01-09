package curso.arrays;

public class Arrays4_LDGR {

	public static void main(String[] args) {
		// Dado un array de n�meros de 5 posiciones con los 
		// siguientes valores: {1,2,3,4,5}. Guardar los valores 
		// de este array en otro array distinto pero con los 
		// valores invertidos, es decir, que el segundo array 
		// deber� tener los valores {5,4,3,2,1}.

		int[] numeros = new int[5];
		
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		
		System.out.println("Los n�meros del primer ARRAY son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Los n�meros del segundo ARRAY son:");
		for (int i = 4; i < numeros.length; i--) {
			System.out.println(numeros[i]);
		}
		
		
	}

}
