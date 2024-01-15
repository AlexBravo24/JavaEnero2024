package com;

public class Principal {

	public static void main(String[] args) {
		
		// Cuando estamos ante un objeto de composicion
		//primero debemos crear los que forman
		//parte del mismo
		
		//Creamos primero el almacenamiento
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		
		//Creamos la memoria ram
		Memoria ram = new Memoria("ADATA", "DDR4", 16);
		
		//Creamos nuestra nueva computadora
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		
		//Imprimimos en consola nuestra laptop
		System.out.println(laptop);
		
		//CREAR UN OBJETO DE COMPOSICION
		//EJEMPLO - UN CELULAR, QUE CUENTA CON MARCA, COLOR, PRECIO
		//Y ADEMÁS CON UNA CAMARA Y PROCESADOR, ESTOS ULTIMOS
		//SON OBJETOS QUE FORMAN PARTE DEL CELULAR, PERO TAMBIEN
		//TIENEN SUS PROPIOS ATRIBUTOS
		//EN OTRO PROYECTO LLAMADO EjercicioComposicion_XXX
		

	}

}
