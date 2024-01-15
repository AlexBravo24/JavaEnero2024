package com;

public class Principal {

	public static void main(String[] args) {
		// Cuando estamos ante un objeto de composicion primero debemos crear los que forman
		//Parte del mismo
		
		//Creamos primero el almacenamiento 
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		
		//Creamos la memoria RAM
		Memoria ram = new Memoria("Adata", "DDR4", 16);
		
		//Creamos nuestra nueva computadora
		
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		
		//Imprimimos en consola nuestra laptop
		
		System.out.println(laptop);
		
		//Crear un objeto de composicion
		//Ejemplo - un celular, que cuenta con marca, color, precio
		//y ademas con una camara y procesador, estos ultimos son objetos
		//que forman parte del celular, pero tambien tiene sus propios atributos
		

	}

}
