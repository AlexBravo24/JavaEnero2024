package com;

public class Principal {

	public static void main(String[] args) {
		// En la Programacion orientada a objetos solo debe de existir una clase con el metodo principal, ya que aqui llamaremos posteriormente a los objetos que tendran sus propias acciones 
		// aqui ya puedo crear una varialble de mi clsae Persona, la creacion de esta variable se lo conoce como "instancia" u objeto en si
		Persona persona1 = new Persona();
		
		//si yo quiero asignarle un nombre a persona1
		//persona1.nombre="carlos"; forma incorrecta de asignar valores a un objeto
		
		//instanciando una persona con el constructor con todos los parametros 
		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);	
		
		// instanciar una nueva persona con solo nombre 
		Persona persona3 = new Persona("Ana");
		
		//probando el metodo GETnombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//probando el metodo SETnombre en persona1 que esta vacio 
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Ingles");
		
		System.out.println(persona1.getNacionalidad());
		
		//imprimir los atributos completos de mi objeto en consola
		System.out.println(persona2);
		
		//Modelar un objeto el que ustedes gusten, con 5 atributos por lo menos 
		//crean constructor vacio, con todos los paranmetros 
		//getters y setters
		//tostring
		//y aqui en esta clase principal , instancian o crean uno vacio
		//uno con todos los parametros y los mandan a imprimir en consola 
		
		equipo jugadores = new equipo(23);
		equipo dt = new equipo(23, "Piojo Herrera", "cuero" , "Luis M", "ColoColo"  );
		equipo balones = new equipo(23, "Piojo Herrera", "cuero" , "Luis M", "ColoColo"  );
		System.out.println(jugadores.getJugadores());
		System.out.println(dt.getDt());
		System.out.println(balones.getBalones());
	
	
	}

}
