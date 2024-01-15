package com;

public class Principal {

	public static void main(String[] args) {
		// Cuando estamos ante un objeto de composicion
		//primero debemos crear los que forman
		//parte del mismo
		
		//creamos primero el almacenamiento
		
		Almacenamiento disco=new Almacenamiento("Kingston", "SSD", 480);
		Almacenamiento disco2=new Almacenamiento("Kingston", "Solido", 500);
		//creamos la memeria RAM 
		Memoria ram=new Memoria("ADATA", "DDR4", 16);
		
		//creamos nuestra nueva computadora
		Computadora laptop=new Computadora("Laptop", "HP", "440", disco, ram);
		Computadora escritorio=new Computadora("Escritorio", "DEll", "xt-43", disco2, ram);
		
		//imprimimos en consola nuestra laptop
		
		System.out.println(escritorio);
		
		
	}

}
