package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo debe existir una clase con el metodo principal
		
		//Ya que aqui llamaremos posteriormente a los objetos que tendran sus propias acciones
		
		//Aqui ya puedo crear una variable de mi clase persona
		//La creacion de esta variable se le conoce como "instancia" u objeto en si 
		Persona persona1 = new Persona();
		
		//Si yo quiero asignarle un nombre a persona1
		//persona1.nombre="Carlos"; <-- forma incorrecta de asginar valores a un objeto 
		
		//Instanciando una persona con el constructor con todos los parametros 
		
		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);
		
		//Instanciar una nueva persona con solo nombre 
		
		Persona persona3 = new Persona("Ana");
		
		//Probando el metodo getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//Probando el metodo setNombre en persona1 que esta vacio
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Ingles");
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getNacionalidad());
		
		//Imprimir los atributos completos de mi objeto en consola
		System.out.println(persona2);
		
		//Modelar un objeto con el que ustedes gusten 
		//Con 5 atributos por lo menos
		//Crean constructor vacios, constuctor con todos los parametros 
		//Metodo toString()
		//En esta clase principal, instancian o crean uno vacio 
		//con todos los parametros y los mandan a imprimir en consola
		
		Carro Chevy = new Carro();
		Carro Mustang = new Carro("Mustang", 1960, 160000, "Rojo", "Ford");
		
		Chevy.setModelo("Chevy");
		
		System.out.println(Chevy);
		System.out.println(Mustang);

	}
	
	

}
