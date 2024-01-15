package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo debe existir una clase 
		//con el metodo principal
		
		//ya que aqui llamaremos posteriormente a los objetos
		//que tendrán sus propias acciones
		
		//Aqui puedo crear una variable de mi clase
		//persona. La creacion de esta variable
		//se le conoce como "instancia" u objeto en sí
		
		Persona persona1 = new Persona();
		
		//si yo quiero asignarle un nombre a persona1
		
		//persona1.nombre="Carlos"; <-- forma incorrecta de asignar valores 
		//a un objeto
		
		//Instanciando una persona con el constructor con todos los parametros
		
		Persona persona2=new Persona("Daniel", 25, "Mexicana", 1.8, 70);  //con Ctrl+spacio 
																			//Seleccionas todos los atributos del contructor
	
		//instanciar una nueva persona con solo nombre
		Persona persona3=new Persona("Ana");
		
		//probando el metodo getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//probando el metodo setNombre en persona1 que esta vacio
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Inglés");
		
		System.out.println(persona1.getNacionalidad());
		
		System.out.println(persona2);
		
		//Modelar un objeto el que ustedes gusten
		//con 5 atributos por lo menos
		//crean: constructor vacío, constructor con todos los parametros
		//Getter y setter
		//metodo toString()
		//y aqui en esta clase principal, instancian o crean uno vacio
		
		Auto ford = new Auto();
		Auto chevrolet=new Auto("Chevrolet", "beat", "blanco", 255000, 2021);
		
		System.out.println(ford);
		
		System.out.println(chevrolet);
		
		}
	
}
