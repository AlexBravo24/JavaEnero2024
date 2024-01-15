package curso.condicionales;

import java.util.Scanner;

public class Condicionales12_AMGC {

	public static void main(String[] args) {
		/* Construir un programa que calcule el índice de masa corporal de una persona
		 * (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona
		 * en función del valor de IMC:
		 * 
		 * Nota 1: se recomienda el empleo de sentencias if–else anidadas.
		 * Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		float peso;
		float altura;
		double IMC;
		
		System.out.println("Ingrese su peso en kg:");
		peso = entrada.nextFloat();
		
		System.out.println("Ingrese su altura en m:");
		altura = entrada.nextFloat();
		
		IMC = peso/(altura*altura);
		//IMC = peso/Math.pow(altura, 2);
		System.out.println("Su índice de masa corporal (IMC) es:" + IMC);
		System.out.println("Diagnóstico:");

		
		if (IMC<16) {
			System.out.println("Criterio de ingreso en hospital");
			
		} else if (IMC>=16 && IMC<17) {
			System.out.println("Infrapeso");
			
		} else if (IMC>=17 && IMC<18) {
			System.out.println("Bajo peso");
			
		}  else if (IMC>=18 && IMC<25) {
			System.out.println("Peso normal (saludable)");
			
		} else if (IMC>=25 && IMC<30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
			
		} else if (IMC>=30 && IMC<35) {
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
			
		} else if (IMC>=35 && IMC<=40) {
			System.out.println("Obesidad premórbida (obesidad de grado III)");
			
		} else {
			System.out.println("Obesidad mórbida (obesidad de grado IV)");
		}

	}

}
