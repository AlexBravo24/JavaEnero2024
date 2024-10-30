package com;

public class Principal {

	public static void main(String[] args) {
		/* Cuando estamos ante un objeto de composicion
		 * primero debemos crear los que formen parte 
		 * del mismo
		 * 
		 * Primero creamos el almacenamoento 
		 * 
		 */
		
		Almacenamiento disco= new Almacenamiento ("Kingstone", "SSD,", 480);
				
		//Creamos la memoria RAM
				
		Memoria ram= new Memoria ("ADATA","DDR4", 16);

		//Creamos nuestra computadora 
		Computadora laptop=new Computadora ("Laptop", "HP", "440", disco, ram);
		
		
		//Imprimir en sonsola nuestra laptop
		System.out.println(laptop);
		
	}

}
