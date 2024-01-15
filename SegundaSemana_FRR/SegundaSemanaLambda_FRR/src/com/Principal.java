package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//Las expresiones lambda - son conocidas como funciones anonimas
		//que implementan el metodo de una clase funcional
		//lo cual nos permite escribir el metodo para su uso inmediato
		
		//el operador de las expresiones lambda es "->"
		//por lo que al final la sintaxis es (parametros) -> {cuerpo de lambda}
		
		//ejemplo de definicion de metodo con el uso de expresion lambda
		
		IMetodo calculadora = (a, b) -> System.out.println("suma: " + (a+b));
		
		IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		//una vez definido se procede a probarlo
		//a travez deñ objeto calculadora
		
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		
		//podemos crear una instancia de una interfase?
		//no. pero podemos crear una instancia de una clase 
		//anonima que nos permita implementar dicha interfase
		
		
	}

}
