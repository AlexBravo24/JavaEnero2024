package curso.condicionales;

import java.util.Scanner;

public class Condicionales03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el primer numero");
		int numero1 = entrada.nextInt();
		
		System.out.println("ingrese el segundo numero");
		int numero2 = entrada.nextInt();
		
		if (numero2 == 0) {
			System.out.println("Error no es posible dividir entre 0");
		}else {
			System.out.println("el resultado es "+ numero1/numero2);
			
		}
		
		
		
	}

}
