package curso.arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        double media = (double) suma / 100;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }
}
