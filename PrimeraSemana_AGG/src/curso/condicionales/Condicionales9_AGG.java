package curso.condicionales;

import java.util.Scanner;

public class Condicionales9_AGG {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7)
		//y escriba el día correspondiente. Si introducimos otro número nos da un error.

Scanner entrada=new Scanner(System.in);
		
		int dia;
		
		System.out.println("Introduce el numero de dia:");
		dia=entrada.nextInt();
		
		if (dia==1)
			{System.out.println("Hoy es: Lunes");}
		if(dia==2)
			{System.out.println("Hoy es: Martes");}
		if(dia==3)
			{System.out.println("Hoy es: Miercoles");}
		if(dia==4)
			{System.out.println("Hoy es: Jueves");}
		if(dia==5)
			{System.out.println("Hoy es: Viernes");}
		if(dia==6)
			{System.out.println("Hoy es: Sabado");}
		if(dia==7)
			{System.out.println("Hoy es: Domingo");}
		if(dia<1 || dia>7)
			{System.out.println("ERROR: dia incorrecto");}
		
	}

}
