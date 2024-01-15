package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// Expresiones Lamda - Son funciones "anonimas"
		//que implementan el método de una interface funcional
		//lo cual escribir el método 
		//para su uso inmediato
		
		//El operador de las expresiones lambda es ->
		//Su sintaxis es (parametros) ->{Cuerpo de Lambda}
		
		//Ejemplo de definición de método con el uso de expresion 
		//lambda
		
		//interface ---objeto a crear por clase anonima que implementa la interface
		//= parametros sin tipo de dato---que quiero hacer
		IMetodo calculadora = (a,b) ->System.out.println("suma : " +  (a+b));
		
		IMetodo calculadora2 = (x, y) ->System.out.println(x - y);
		
		//una vez definido, procedemos a probarlo atravez del
		//objeto calculadora
		calculadora.operar(5, 11);
		calculadora2.operar(15, 4);
		
		
		//¿PODEMOS CREAR UNA INSTANCIA DE UNA INTERFACE?
		//NO, PERO PODEMOS CREAR UNA INSTANCIA DE CLASE ANONIMA
		//QUE NOS PERMITE IMPLEMENTAR DICHA INTERFACE
		
		
	}

}
