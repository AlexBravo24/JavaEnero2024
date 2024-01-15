package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Cuando estamos ante un objeto de composicionn
		//primero debemos crear los que forman parte del mismo
		
		
		//instanciamos primero el almacenamiento
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		
		Memoria ram = new Memoria("kingston", "DDR4", 16);
		
		Computadora laptop = new Computadora("laptop", "HP", "440", disco, ram);
		
		System.out.println(laptop);

	}

}
