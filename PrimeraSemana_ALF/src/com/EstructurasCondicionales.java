package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ESTRUCTURAS CONDICIONALES
		 * IF_ EVALUA VALORES BOLEANOS*/
		int x = 12;
		if(x<=11) {
			System.out.println("Si " + x + " Es menor");
		}else {
			System.out.println("No "+ x + " Es mayor");
		}
		
		/*OPERADORES LOGICOS
		 * AND, OR , NOT, DIFERENTE DE, IGUALDAD
		 *  Condiciones compuestas
		 *  AND - &&- Devuelve el valor true cuando se cumplan
		 *  todas las condiciones */
		
		if(x<13 && x>13) {
			System.out.println("Si " + x + " Es menor");
		}else {
			System.out.println("No "+ x + " Es mayor");
			
		}
		
		/*
		 * OR -- Devuelve el valor true cuanso se cumple almenos una de las condiciones*/
		
		if(x<13 || x>13 || x==13) {
			System.out.println("Si " + x + " Es menor");
		}else {
			System.out.println("No "+ x + " Es mayor");
			
		}
		
	}

}
