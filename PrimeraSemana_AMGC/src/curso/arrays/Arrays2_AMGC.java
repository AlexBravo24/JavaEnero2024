package curso.arrays;

public class Arrays2_AMGC {

	public static void main(String[] args) {
		
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
		// Obtén la suma de todos ellos y la media.
		
		int [] numeros = new int[100];
		int x=1;
		int i;
		int suma=0;
		int media;
		
		// Crear el array
		for (i=0; i<100; i++) {
			numeros[i] = x;
			x++;
		}
		
		// Sumar sus valores
		i=0;
		for (i=0; i<100; i++) {
			suma = suma + numeros[i];
		}
		
		// Media e impresión
		media = suma/numeros.length;
		System.out.println("La suma de los valores del array es: " + suma);
		System.out.println("La media de los valores del array es: " + media);

	}

}
