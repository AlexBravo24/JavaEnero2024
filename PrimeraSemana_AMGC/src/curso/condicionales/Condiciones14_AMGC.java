package curso.condicionales;

import java.util.Scanner;

public class Condiciones14_AMGC {

	public static void main(String[] args) {
		/* 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		 * Si trabaja 40 horas o menos se le paga $16 por hora.
		 * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y
		 * $20 por cada hora extra.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int horas;
		int extra;
		int pesos;
		
		System.out.println("Ingrese las horas trabajadas en la semana:");
		horas = entrada.nextInt();
		
		if (horas>40){
			extra=horas-40;
			pesos=(40*16)+(extra*20);
		} else {
			pesos=horas*16;
		}
		
		System.out.println("Su salario semanal es de: $" + pesos);
	}

}
