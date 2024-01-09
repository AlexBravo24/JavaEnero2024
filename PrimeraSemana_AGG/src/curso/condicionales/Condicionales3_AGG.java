package curso.condicionales;

import java.util.Scanner;

public class Condicionales3_AGG {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		//Si el segundo número es 0, debe mostrar un mensaje de error

		Scanner entrada = new Scanner(System.in);
		
		double numero;
		double numero2;
		
		System.out.println("INTRODUCE EL PRIMER NUMERO");
		numero=entrada.nextInt();
		
		System.out.println("INTRODUCE EL SEGUNDO NUMERO");
		numero2=entrada.nextInt();
		
		double division = (numero/numero2);
		
		if (numero2==0)
		{System.out.println("Syntax ERROR");}
		else {System.out.println("EL RESULTADO DE LA DIVISIÓN ES " + division);}
				
		
	}

}
