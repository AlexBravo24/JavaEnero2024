package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo debe existir una clase
		//con el método principal
		
		//Ya que aquí llamaremos posteriormente a los objetos
		//que tendrán sus propias acciones
		
		//Aqui ya puedo crear una variable de mi clase
		//Persona. La creación de esta variable
		//Se le conoce como "instancia" u objeto en sí
		Persona persona1 = new Persona();
		
		//Si yo quiero asignarle un nombre a persona1
		//persona1.nombre="Carlos"; <-- forma incorrecta
		//de asignar valores a un objeto
		
		//Instanciando una persona con el constructor con todos
		//los parametros
		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);
		
		//Instanciar una nueva persona con solo nombre
		Persona persona3 = new Persona("Ana");
		
		//Probando el método getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//Probando el método setNombre en persona1 que esta vacio
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Inglés");
		
		System.out.println(persona1.getNacionalidad());
		
		//Imprimir los atributos completos de mi objeto en consola
		System.out.println(persona2);
		
		//Modelar un objeto el que ustedes gusten
		//Con 5 atributos por lo menos
		//Crean constructor vacio, constructor con todos los parametros
		//Getters y Setters
		//Método toString()
		//y aqui en esta clase Principal, instancian o crean uno vacio
		//un con todos los parametros
		//y los mandan a imprimir en consola
		
		Torta salchicha = new Torta();
		Torta cubana = new Torta("Cubana", "Trigo", "Milanesa", 50, 350);
		
		salchicha.setNombre("Salchicha");
		
		System.out.println(salchicha);
		System.out.println(cubana);

	}

}
