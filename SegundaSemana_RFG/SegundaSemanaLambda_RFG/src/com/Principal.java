package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda - Son funciones "an�nimas"
		// que implementan el m�todo de una interface funcional
		// lo cual nos permite escribir el m�todo
		//para su uso inmediato
		
		//El operador de las expresiones lambda es: ->
		//Su sintaxis es (parametros) -> { Cuerpo de lambda }
		
		//Ejemplo de definicion de m�todo con el uso de expresion
		//Lambda
		
		IMetodo calculadora = (a,b) -> System.out.println(a+b);
		IMetodo calculadora2 = (x,y) -> System.out.println(x-y);

		
		//Una vez definido, procedemos a probarlo a trav�s del
		//"objeto" calculadora
		
		calculadora.operar(5, 11);
		calculadora2.operar(15, 4);
		
		//�Podemos crear una instancia de una interface?
		//No, pero podemos crear una instancia de una clase anonima
		//que nos permita implementar dicha interface
		
	}

}
