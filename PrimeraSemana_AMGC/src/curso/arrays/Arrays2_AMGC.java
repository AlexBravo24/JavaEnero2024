package curso.arrays;

public class Arrays2_AMGC {

	public static void main(String[] args) {
		
		// 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100.
		// Obt�n la suma de todos ellos y la media.
		
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
		
		// Media e impresi�n
		media = suma/numeros.length;
		System.out.println("La suma de los valores del array es: " + suma);
		System.out.println("La media de los valores del array es: " + media);

	}

}
