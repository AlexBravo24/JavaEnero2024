package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda - Son funciones "anónimas" que implementan el método de una
		//interface funcional.
		//Lo cual nos permite escribir el método para su uso inmediato
		
		//El operador de las expresiones lambda es ->
		//Su sintaxis es (parametros) -> {Cuerpo de lambda}
		
		//Ejemplo de definición de método con el uso de expresión Lambda
		IMetodo calculadora = (a, b) -> System.out.println(a+b);
		
		IMetodo calculadora2 = (x,y) -> System.out.println(x-y);
		
		//Una vez definido, procedemos a probarlo a través del "objeto" calculadora
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		
		//¿PODEMOS CREAR UNA INSTANCIA DE UNA INTERFACE?
		//No, pero podemos crear una instancia de una clase anónima, que nos permita
		//implementar dicha interface
		//IMetodo no crea el objeto calculadora, calculadora (objeto) es creada por una clase
		//anónima
		
		

	}

}
