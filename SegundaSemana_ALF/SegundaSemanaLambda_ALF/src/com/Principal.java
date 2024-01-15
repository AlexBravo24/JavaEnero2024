package com;

public class Principal {

	public static void main(String[] args) {
		
		// LAMBDA -son funciones anonimas que implementan el metodo
		//de una interface funcional, lo cual nos permite escribir
		//el metodo para el uso inmediato
		
		/*El operador de las expresiones lambda es
		 * Sintaxis en parametros {cuerpo de lambda}
		 * 
		 * EJEMPLO DE DEFINICION DE METODO CON EL USO DE 
		 * EXPRESION LAMBDA*/
		
		IMetodo calculadora = (a,b)-> System.out.println(a+b);
		
		IMetodo calculadora2 = (x,y)-> System.out.println(x-y);
		
		//Una vex definido procedemos a probarlo a travez del
		//objeto caluladora
		calculadora.operar(5, 11);
		calculadora2.operar(15, 11);
		
		//Podemos crear una unstacia de uan interce 
		//No pero podemos crear una instacia de una clase anonima
		//que nos permita inplementar dicha interface
		
		

	}

}
