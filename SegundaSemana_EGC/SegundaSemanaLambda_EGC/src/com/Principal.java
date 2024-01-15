package com;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lambda son conocidas
		// como funciones anonimas que implementan
		// el metodo de una interface funcional
		// lo cual nos permite escribir el metodo para
		// su uso inmediato
		
		//El operador de las operaciones lambda es ->
		// Su sintaxis es (parametros) -> {Cuerpo de lambda}
		
		//Ejemplo de definición de metodo con el uso de
		//expresion Lambda
		
		//IMetodo calculadora = (a,b) -> System.out.println("suma: "+ (a+b));
		IMetodo calculadora = (a,b) -> System.out.println(a+b);
		//2do ejemplo
		IMetodo calculadora2 = (x,y) -> System.out.println("resta: " + (x-y));
		// una vez definido procedemos a probarlo a través del
		// "objeto" calculadora
		
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		
		//Podemos crear una instancia de una interface?
		//respuesta: no pero podemos crear una instancia de una clase anonima
		// que nos permita implementar dicha interface
		

	}

}
