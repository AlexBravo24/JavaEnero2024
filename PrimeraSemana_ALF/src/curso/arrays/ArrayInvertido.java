package curso.arrays;

import java.util.Scanner;

public class ArrayInvertido {

	public static void main(String[] args) {
		
		    int arr[] = new int[5];
		    Scanner entrada = new Scanner(System.in);
			for (int i=0; i<arr.length;i++) {
				
				System.out.println("Introdusca un numero:");
				arr[i]=entrada.nextInt();
			}
			System.out.println("Los numeros invertidos son: ");
			int j=4;
			while(j>=0) {
				System.out.println("|"+arr[j]+"|\n");
				j--;
			}

	}

}
