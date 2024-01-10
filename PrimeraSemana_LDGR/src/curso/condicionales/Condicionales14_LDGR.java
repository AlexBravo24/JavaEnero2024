package curso.condicionales;

import java.util.Scanner;

public class Condicionales14_LDGR {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, el 
		// cual se obtiene de la siguiente manera: Si trabaja 40 
		// horas o menos se le paga $16 por hora. Si trabaja más 
		// de 40 horas se le paga $16 por cada una de las 
		// primeras 40 horas y $20 por cada hora extra
		
		Scanner entrada = new Scanner(System.in);
		
		int horas;
		int extra;
		int salario; 
		int salario2;
		System.out.println("Introduzca el número de horas trabajadas:");
		horas = entrada.nextInt();
		
		if(horas<=40) {
			salario = horas*16;
			System.out.println("Su salario semanal es de $" + salario);
		} else if (horas>40){
			salario2 = 640;
			extra = horas-40;
			int total = salario2 + (extra*20);
			System.out.println("Su salario semanal es de $" + total);
		}

	}

}
