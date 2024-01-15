package com;

public class Principal {

	public static void main(String[] args) {
		
		//Cuando estamos ante un objeto de composicion
		//primero debemos crear los que forman parte del mismo
		
		//Primero, por ejemplo, creamos el almacenamiento
		
		Almacenamiento disco = new Almacenamiento("Kingstone", "SSD", 400);
		
		//Memoria RAm
		Memoria ram = new Memoria("ADATA", "DDR4", 16);
		
		//Creamos objeto con sus piezas
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		//Imprimimos en consola
		System.out.println(laptop);
		
	}

}
