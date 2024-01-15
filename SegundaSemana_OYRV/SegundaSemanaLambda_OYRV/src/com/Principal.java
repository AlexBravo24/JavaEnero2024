package com;

public class Principal {

	public static void main(String[] args) {
		// EXPRESIONES LAMBDA: son conocidas como funciones anonimas queimplementan el metodo de una interface funcional, lo cual nos permite escribir el metodo para su eso inmediato
		
		//el operador de las expresiones lambda es -> su sintaxis es (parametros) -> {cuerpo lambda}
		
		//Ejemplo de definicion de metodo con el uso de expresion lambda
		
		IMetodo calculadora = (a, b) -> System.out.println("suma:"+(a+b));
		IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		
		//una vez definido, procedemos a probarlo atraves del "objeto" calculadora
		calculadora.operar(5, 11);
		calculadora2.operar(15, 4);
		//¿podemos crear una instancia de una interface?
		//no, pero podemos crear una instancia de una clase anonima que nos permita implementar dicha interface 
		

	}

}
