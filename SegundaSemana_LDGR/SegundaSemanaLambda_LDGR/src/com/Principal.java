package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda - Son funciones "an�nimas" que implementan
		// el m�todo de una interface funcional, lo cual nos permite
		// escribir el m�todo para su uso inmediato.
		
		// El operador de las expresiones Lambda es ->
		
		// Su sintaxis es (par�metros) -> {Cuerpo de Lambda}
		
		// Ejemplo de definici�n de m�todo con el uso de expresi�n Lambda
		
		IMetodo calculadora = (a, b) -> System.out.println(a+b);
		// calculadora es un "objeto an�nimo" que implementa la interface
		// funcional "IMetodo"
		
		IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		
		// Una vez definido, procedemos a probarlo a trav�s del
		// "objeto" calculadora
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		
		// �PODEMOS CREAR UNA INSTANCIA DE UNA INTERFACE?
		// R = No, pero podemos crear una instancia de una clase an�nima
		// que nos permita implementar dicha interface.

	}

}
