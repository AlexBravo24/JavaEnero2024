package com;

public class Principal {

	public static void main(String[] args) {

		//las expreciones - son funciones "anonimas"
		//que implementan el metodo de una interface funcional
		//lo cual nos permite escribir el metodo
		//para uso inmediato
		
		//El operador de las expreciones lambda es -
		//sintaxis es (parametro) ->{cuwerpi de lambda}
		
		//Ejemplo de definicion de metodo con el uso de lambda
		
		IMetodo calculadora = (a,b) -> System.out.println("Suma: "+(a+b));
		IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		
		//Una vez definido procedemos a probarlo atraves del objeto calculadora
		
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		
		//Podemos crear una instancia de una interface?
		//No. pero podemos crear una instancia de una clase anonima
		//que nos permita implementar dicha interface
		
		
		
	}

}
