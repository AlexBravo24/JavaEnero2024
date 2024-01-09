package curso.condicionales;

import java.util.Scanner;

public class Condicionales5_AGG {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptaci�n de una solicitud en base a 
		//los siguientes par�metros:
		//:edad, nota y sexo. 
		/* M�nimo:Nota (5), edad (18), sexo M -> POSIBLE 
		 * M�nimo:Nota (5), edad (18), sexo F -> ACEPTADA 
		 * Otros casos -> NO ACEPTADA
		 */

		Scanner entrada = new Scanner(System.in);
		int edad;
		int nota;
		char sexo;
		
		System.out.println("INGRESA TU EDAD:");
		edad=entrada.nextInt();
		
		System.out.println("INGRESA TU NOTA:");
		nota=entrada.nextInt();
		
		System.out.println("INGRESA TU SEXO (M o F)");
		sexo=entrada.next().charAt(0);
				
		String a = "ACEPTADA";
		String p = "POSIBLE";
		String r = "RECHAZADA";
		
		if(edad>=18 && nota>=5 && sexo=='f')
		{System.out.println(a);}
		else if(edad>=18 && nota>=5 && sexo=='m')
		{System.out.println(p);}
		else if(edad<18 || nota<5)
		{System.out.println(r);}
		else {System.out.println(r);}
		
		//EL UNICO DETALLE ES QUE NO DISCRIMINA LA M o la F PARA LA VARIABLE "SEXO"
		//TE MANDA EN AUTOM�TICO EL RECHAZO SI ES DIFERENTE A ESAS 2 CONSTANTES.
			
	}

}
