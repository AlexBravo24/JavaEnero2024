package com;

public class Principal {

	public static void main(String[] args) {
		// En la programacion orientada a objetos solo debe existir una clase con el 
		//método principal 
		
		//ya que aqui llamaremos a los objetos que tendrán sus propias acciones
		
		//aqui ya puedo crear una variable de mi clase persona
		//la creacion de esta variable se le conoce como instancia u objeto
		Persona persona1 = new Persona();
		
		//forma incorrecta de asignar valores a un objeto		
		//persona1.nombre = "carlos"
		
		//instanciandp una persona con el constructor con todos los parametros
		
		Persona persona2 = new Persona("Daniel", 25, "mexicana", 1.7, 70.5);
		
		//intanciar una persona con solo el nombre
		Persona persona3 = new Persona("Ana");
		
		//Probando el metodo nombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		
		//Probando el metodo setnombre
		
		persona1.setNombre("carlos");
		persona1.setNacionalidad("Inglés");
		
System.out.println(persona1.getNacionalidad());

//imprimir todos los atributos de mi objeto 
System.out.println(persona2);

//modelar un objeto el que ustedes gusten
//con 5 atributos por lo menos
//crean constructor vacio, constructor con todos los parametros
//getters y setters
//Método tostring
//y aqui en esta clase prinipal crean uno vacio 
// y uno con todos los parametros


Contenedores contenedor1 = new Contenedores("India");

Contenedores contenedor2 = new Contenedores("China", 40, "Ropa", "Rojo", "Mexico");

System.out.println(contenedor1);
System.out.println(contenedor2);
		

	}

}
