package com;

public class Principal {

	public static void main(String[] args) {
		// En POO solo debe existir una clase
		//con  el metodo principaly
		//ya que aqui llamaremos los objetos que 
		//tendras sus propias acciones
		/*
		 * Aqui ya puedo crear una variable de mi clase
		 * persona, la creacion de esta variable
		 * se le conoce como instacia u objeto en si */
		
		Persona persona1 = new Persona();
		
		//Si yo quiero asignarle un nombre a persona1
		//persona1.nombre="Alfredo";-
		//Forma incorrecta de asignar valores a un objeto
		
		/*Instanciando una persona con el constructor con todos los
		 * parametros*/
		Persona persona2 = new Persona("Alfredo", 25,"Mexicana", 1.75, 70);
		
		//instaciar una nueva persona con solo su nombre
		
		Persona persona3 = new Persona("Alfredo");
		
		//Probando el metodo getNombre en la persona 3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//Probando el metodo setNombre en persona1 que esta vacio
		persona1.setNombre("Alfredo");
		persona1.setNacionalidad("Canadiense");
		System.out.println(persona1.getNacionalidad());
		//imprimir atributos completos de persona2
		
		System.out.println(persona2);
		
		Carro auto2 = new Carro();
		
		Carro auto = new Carro("Golf gti", 98, "verde", "v6", 125000);
		
		auto2.setNombre("Ford");
		System.out.println(auto2);
		System.out.println(auto);
		
	}

}
