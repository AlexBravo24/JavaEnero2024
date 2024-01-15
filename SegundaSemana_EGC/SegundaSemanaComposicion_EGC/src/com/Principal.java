package com;

public class Principal {

	public static void main(String[] args) {
		// Cuando estamos ante un objeto de composicion
		//primero debemos crear los que forman parte
		//del mismo
		
		//Creamos primero el almacenamiento
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Memoria ram = new Memoria("Adate", "DDR4", 16);
		
		//Creamos ahora si nuestra nueva computadora
		Computadora laptop = new Computadora("Portatil", "HP", "Pavilion 1000", disco, ram);
		
		System.out.println(laptop);

	}

}
