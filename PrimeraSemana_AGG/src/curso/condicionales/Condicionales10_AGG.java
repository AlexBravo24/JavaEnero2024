package curso.condicionales;

import java.util.Scanner;

public class Condicionales10_AGG {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un número entero entre uno y doce
		//e imprima el número de días que tiene el mes correspondiente.

		Scanner entrada=new Scanner(System.in);
		
		int mes;
		System.out.println("Introduce el numero de mes:");
		mes=entrada.nextInt();
		
		if (mes==1)
			{System.out.println("El numero de dias es 31");}
		if (mes==2)
			{System.out.println("El numero de dias es 28");}
		if (mes==3)
			{System.out.println("El numero de dias es 31");}
		if (mes==4)
			{System.out.println("El numero de dias es 30");}
		if (mes==5)
			{System.out.println("El numero de dias es 31");}
		if (mes==6)
			{System.out.println("El numero de dias es 30");}
		if (mes==7)
			{System.out.println("El numero de dias es 31");}
		if (mes==8)
			{System.out.println("El numero de dias es 31");}
		if (mes==9)
			{System.out.println("El numero de dias es 30");}
		if (mes==10)
			{System.out.println("El numero de dias es 31");}
		if (mes==11)
			{System.out.println("El numero de dias es 30");}
		if (mes==12)
			{System.out.println("El numero de dias es 31");}
		if(mes<1 || mes>12)
			{System.out.println("Error de mes");}
	}

}
