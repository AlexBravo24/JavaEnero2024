package com;

public class Principal {

	public static void main(String[] args) {
		
		// Cuando estamos ante un Objeto de composición, primero 
		// debemos crear los que forman parte del mismo
		
		// Creamos primero el almacenamiento
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		
		// Creamos la memoria RAM
		Memoria ram = new Memoria("ADATA", "DDR4", 16);
		
		// Creamos nuestra nueva computadora
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		
		// Imprimimos en consola nuestra laptop
		System.out.println(laptop);
		

	}

}
