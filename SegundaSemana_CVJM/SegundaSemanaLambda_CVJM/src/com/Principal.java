package com;

public class Principal {

	public static void main(String[] args) {
		/* EXPRESIONES LAMBDA: tambien conocidas como "funciones anonimas" que 
		 * implementan el metodo de una interface funcional
		 * Lo cual nos permite escribir el metodo para su uso inmediato
		 * 
		 * El operador de las expresiones Lambda es ->
		 * Su sintaxis es (parametros)->{Cuerpo de lambda} 
		 * 
		 * Ejemplo de definicion de metodo con el uso de expresion Lambda
		 */
		
		IMetodo calculadora = (a,b) -> System.out.println(a+b);
		 IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		
		//Una vez definido, procedemos a probarlo a traves del "objeto" calculadora
		
		calculadora.operar(5, 11);
		
		calculadora2.operar(15, 4);
		

		
	}

}
