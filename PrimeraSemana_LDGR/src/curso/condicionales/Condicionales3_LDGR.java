package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_LDGR {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y 
		// muestre el resultado de su divisi�n. Si el 
		// segundo n�mero es 0, debe mostrar un mensaje de error.

        Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce un n�mero (dividendo):");
		numero = entrada.nextInt();
		
		System.out.println("Introduce otro n�mero (divisor)");
		int numero2 = entrada.nextInt();
		
		int resultado = numero/numero2;
		int residuo = numero%numero2;
		
		if(numero2!=0) {
		System.out.println("El resultado de la divisi�n es: " + (resultado));
		System.out.println("El residuo de la divisi�n es: " + (residuo));
		} else {
		System.out.println("No es posible dividir entre cero");
		}
		
//		if(numero2!=0 && numero>numero2) {
//			System.out.println("El resultado de la divisi�n es: " + (resultado));
//			System.out.println("El residuo de la divisi�n es: " + (residuo));
//			} else {
//			System.out.println("El dividendo debe ser mayor que el divisor");
//			}
		
		
	}

}
