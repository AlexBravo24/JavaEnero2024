package com.condicionales;

import java.util.Scanner;

public class Condicionales14_EGC {

	public static void main(String[] args) {
//		14. Un obrero necesita calcular su salario semanal, 
//		el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas 
//		se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra

		Scanner scan = new Scanner(System.in);
		System.out.println("Cuantas horas trabajará?");
		int horas = scan.nextInt();

		if (horas >= 40) {
			int horasExtra = horas - 40;
			int horasReales = horas - horasExtra;
			double salario = horasReales * 16;
			double salarioExtra = horasExtra * 20;
			double salarioTotal = salario + salarioExtra;
			System.out.println("Si usted trabaja " + horas + " horas, usted habrá trabajado un total de " + horasExtra
					+ " horas extras, por lo que su salario será de $" + salarioTotal + " dolares.");
		} else {
			double salario = horas * 16;
			System.out.println("Si usted trabaja " + horas + " su salario será de $" + salario + " dolares.");
		}

	}
}
