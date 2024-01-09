package curso.arrays;

public class Arrays4_EGC {

	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}

		int[] array1 = { 1, 2, 3, 4, 5 };
		int lon = array1.length;
		int[] array2 = new int[lon];
		int i = lon - 1;
		int b = 0;
		while (i >= 0) {
			array2[b] = array1[i];
			System.out.println(array2[b]);
			i--;
			b++;
		}

	}
}
