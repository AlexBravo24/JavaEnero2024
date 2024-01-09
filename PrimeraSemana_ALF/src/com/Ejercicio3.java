package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Resultado de divisón y error de cero");
		Scanner entrada = new Scanner(System.in);
		double numero;
		double Resultado;
		System.out.println("Ingresa un numero:");
		numero = entrada.nextInt();
		double numero2;
		System.out.println("Ingresa un numero:");
		numero2 = entrada.nextInt();
		
		 if(numero2 == 0) {
			 System.out.println("No es posible continuar con la operacion"
			 		+ " ya que no se puede dividir con cero");
		 }else {
			 Resultado = numero/numero2;
			 System.out.println("El resultado de la division entre : " + numero+ " y "
					 + numero2+ " es : "+
					 Resultado);
			 
		 }

	}

}
