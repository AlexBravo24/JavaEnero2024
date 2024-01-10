package com.condicionales;

import java.util.Scanner;

public class Condicionales12_EGC {

	public static void main(String[] args) {
//		12.Construir un programa que calcule el índice de masa corporal de 
//		una persona (IMC = peso [kg] / altura2 
//		[m]) e indique el estado en el que se 
//		encuentra esa persona en función del valor de IMC:

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su peso...");
		double peso = scan.nextDouble();
		System.out.println("ingrese su altura...");
		double altura = scan.nextDouble();
		double imc = Math.round(peso / (altura * altura));
		String diagnostico ="";
		if(imc < 16) {
			 diagnostico = "Criterio de ingreso en el hospital";
		} else if(imc > 16 && imc < 17 ) {
			diagnostico = "infrapeso";
		} else if ( imc > 17 && imc < 18) {
			diagnostico = "bajo peso";
		} else if (imc > 18 && imc < 25) {
			diagnostico = "peso normal (saludable)";
		} else if (imc > 25 && imc < 30) {
			diagnostico = "peso normal (saludable)";
		} else if (imc > 30 && imc < 35) {
			diagnostico = "sobrepeso crónico (obesidad de grado II)";
		} else if (imc > 35 && imc < 40) {
			diagnostico = "obesidad premórbida (obesidad de grado III)";
		} else if (imc > 40) {
			diagnostico = "obesidad mórbida (obesidad de grado IV)";
		}
		System.out.println("su peso es " + peso + " kilogramos y su "
				+ "altura es " + altura * 100 + " centimetros "
				+ " por lo que su Indice de Masa Corportal "
				+ "es de " + imc + " por lo que usted tiene " + diagnostico + ".");
		
	}

}
