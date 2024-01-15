package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de HERENCIA
		//Clase animal, que hereda a otra clase por ejemplo: perro.
		
		Animal gato=new Animal("Gato", 2, "blanco");
		Animal perro=new Animal("perro", 3, "negro");
	
		Perro husky=new Perro("perro", 3, "negro", "husky", 1);
		
		System.out.println(husky);
		
	}

}
