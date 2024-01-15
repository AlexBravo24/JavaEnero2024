package com;

public class Principal {

	public static void main(String[] args) {
		
		//Cuando estamos ante un objeto de composiscion primero debemos crear los que forman parte del mismo, creamos primero el almacenamiento
		
		almacenamiento disco = new almacenamiento("kington", "SSD", 480);
		
		//ahora creamos la memoria RAM
		
		memoria ram = new memoria("ADATA", "DDR4", 16);
		
		//CREAMOS NUESTRA NUEVA COMPUTADORA
		
		Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);
		
		//imprimimos en consola nuestra laptop
		System.out.println(laptop);
		
		//crear un objeto de composicion ejemplo:celular que cuenta con una camara y procesador estos ultimos son objetos que forman parte del celular pero tienen sus propios atributos 
		
		

	}

}
