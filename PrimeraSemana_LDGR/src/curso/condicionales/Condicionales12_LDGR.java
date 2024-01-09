package curso.condicionales;

import java.util.Scanner;

public class Condicionales12_LDGR {

	public static void main(String[] args) {
		// Construir un programa que calcule el �ndice de masa corporal 
		// de una persona (IMC = peso [kg] / altura2 [m]) e indique 
		// el estado en el que se encuentra esa persona en funci�n 
		// del valor de IMC:
		
		Scanner entrada = new Scanner(System.in);
		
		int peso;
		System.out.println("Introduzca su peso en kg:");
		peso = entrada.nextInt();
		
		System.out.println("Introduzca su altura en cent�metros:");
		double altura = entrada.nextInt();
		
		double imc = (peso/((altura*altura)/10000));
				
		System.out.println("Su IMC es " + imc);
		
		
		if(imc<16) {
			System.out.println("Diagn�stico: Criterio de ingreso en hospital");
		}else if (imc>=16 && imc<=17) {
			System.out.println("Diagn�stico: Infrapeso");
		}else if (imc>=17 && imc<=18) {
			System.out.println("Diagn�stico: Bajo peso");
		}else if (imc>=18 && imc<=25) {
			System.out.println("Diagn�stico: Peso normal (saludable)");
		}else if (imc>=25 && imc<=30) {
			System.out.println("Diagn�stico: Sobrepeso (obesidad de grado I)");
		}else if (imc>=30 && imc<=35) {
			System.out.println("Diagn�stico: Sobrepeso cr�nico (obesidad de grado II)");
		}else if (imc>=35 && imc<=40) {
			System.out.println("Diagn�stico: Obesidad prem�rbida (obesidad de grado III)");
		}else if (imc>40) {
			System.out.println("Diagn�stico: Obesidad m�rbida (obesidad de grado IV)");
		}

		
        

	}

}
