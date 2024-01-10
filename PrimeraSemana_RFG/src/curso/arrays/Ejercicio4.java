package curso.arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        System.out.println("Array original:");
        for (int num : arrayOriginal) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray invertido:");
        for (int num : arrayInvertido) {
            System.out.print(num + " ");
        }
    }
}
