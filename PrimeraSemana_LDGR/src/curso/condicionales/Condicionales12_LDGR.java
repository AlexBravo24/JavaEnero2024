package curso.condicionales;

import java.util.Scanner;

public class Condicionales12_LDGR {

	public static void main(String[] args) {
		// Construir un programa que calcule el índice de masa corporal 
		// de una persona (IMC = peso [kg] / altura2 [m]) e indique 
		// el estado en el que se encuentra esa persona en función 
		// del valor de IMC:
		
		Scanner entrada = new Scanner(System.in);
		
		int peso;
		System.out.println("Introduzca su peso en kg:");
		peso = entrada.nextInt();
		
		System.out.println("Introduzca su altura en centímetros:");
		double altura = entrada.nextInt();
		
		double imc = (peso/((altura*altura)/10000));
				
		System.out.println("Su IMC es " + imc);
		
		
		if(imc<16) {
			System.out.println("Diagnóstico: Criterio de ingreso en hospital");
		}else if (imc>=16 && imc<=17) {
			System.out.println("Diagnóstico: Infrapeso");
		}else if (imc>=17 && imc<=18) {
			System.out.println("Diagnóstico: Bajo peso");
		}else if (imc>=18 && imc<=25) {
			System.out.println("Diagnóstico: Peso normal (saludable)");
		}else if (imc>=25 && imc<=30) {
			System.out.println("Diagnóstico: Sobrepeso (obesidad de grado I)");
		}else if (imc>=30 && imc<=35) {
			System.out.println("Diagnóstico: Sobrepeso crónico (obesidad de grado II)");
		}else if (imc>=35 && imc<=40) {
			System.out.println("Diagnóstico: Obesidad premórbida (obesidad de grado III)");
		}else if (imc>40) {
			System.out.println("Diagnóstico: Obesidad mórbida (obesidad de grado IV)");
		}

		
        

	}

}
