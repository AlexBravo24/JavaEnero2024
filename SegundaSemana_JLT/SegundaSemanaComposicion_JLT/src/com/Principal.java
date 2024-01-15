package com;

public class Principal {

	public static void main(String[] args) {
		
		//Caudno estamos ante un objeto de composicion
		//Primero debemos crear los que forman
		//parte del mismo
		
		//creamos primero almacenamiento
		
		Almacenamiento disco = new Almacenamiento("kingston", "SDD", 480);
		
		//Creamos la memoria ram
		Memoria ram = new Memoria("ADATA", "DDR4", 16);
		
		//Creamos nuestra computadora
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		
		//imprimimos en consola nuestra laptop
		System.out.println(laptop);
		
		//CREAR UN OBJETO DE COMPOSICION
		//EJEMPLO - UN CELULAR QUE CUENTA CON MARCA,COLOR, PRECIO
		//Y DEAMS CON UNA CAMARA PROCESADOR, PERO TAMBIEN
		//TIENEN SUS PROPIOS ATRIBUTOS
		
		

	}

}
