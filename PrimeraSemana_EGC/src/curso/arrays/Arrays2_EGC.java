package curso.arrays;

public class Arrays2_EGC {

	public static void main(String[] args) {
//		2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//		1 al 100. Obt�n la suma de todos ellos y la media.
		int[] numeros = new int[100];
		int suma = 0;
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
		}
		for (int i = 0; i < 100; i++) {

			suma += numeros[i];
			System.out.println(suma);
		}
		System.out.println("las suma del contenido del array es " + suma + " mientras que la media es " + suma / 100);
	}

}
