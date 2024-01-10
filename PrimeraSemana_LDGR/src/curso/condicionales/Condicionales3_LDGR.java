package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_LDGR {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y 
		// muestre el resultado de su división. Si el 
		// segundo número es 0, debe mostrar un mensaje de error.

        Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce un número (dividendo):");
		numero = entrada.nextInt();
		
		System.out.println("Introduce otro número (divisor)");
		int numero2 = entrada.nextInt();
		
		int resultado = numero/numero2;
		int residuo = numero%numero2;
		
		if(numero2!=0) {
		System.out.println("El resultado de la división es: " + (resultado));
		System.out.println("El residuo de la división es: " + (residuo));
		} else {
		System.out.println("No es posible dividir entre cero");
		}
		
//		if(numero2!=0 && numero>numero2) {
//			System.out.println("El resultado de la división es: " + (resultado));
//			System.out.println("El residuo de la división es: " + (residuo));
//			} else {
//			System.out.println("El dividendo debe ser mayor que el divisor");
//			}
		
		
	}

}
