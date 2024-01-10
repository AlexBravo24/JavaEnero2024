package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_CVJM {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos números y muestre 
		//el resultado de su división. Si el segundo número es 0, 
		//debe mostrar un mensaje de error. 
		
		System.out.println("Proporciona el primer valor: ");
		int v1= new Scanner (System.in).nextInt();
		
		System.out.println("Proporciona el segundo valor: ");
		int v2= new Scanner (System.in).nextInt();
		
		//Division
		int r = v1/v2;
		System.out.println("El resultado de "+v1+" entre "+v2+" es: "+r);
		
		

	}

}
