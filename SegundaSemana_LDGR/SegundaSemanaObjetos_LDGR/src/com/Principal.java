package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la Programación Orientada a Objetos (POO), solo
		// debe existir una clase con el método principal,
		// ya que aquí llamaremos posteriormente a los objetos
		// que tendrán sus propias acciones
		
		// Aquí ya puedo crear una variable de mi clase
		// Persona. La creación de esta variable
		// se le conoce como "instancia" u objeto en sí
		
		Persona persona1 = new Persona();
		
		// Si yo quiero asignarle un nombre a persona1
		// persona1.nombre="Carlos"; <-- Forma incorrecta
		// de asignar valores a un objeto
		
		// Instanciando una persona con el Constructor con todos
		// los parámetros
		
		Persona persona2 = new Persona("Daniel", 28, "Mexicana", 1.71, 70);
		
		// Instanciar una nueva persona con solo nombre
		Persona persona3 = new Persona("Ana");
		
		// Probando el método getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad()); // Imprime 0 porque
		// Ana no tiene asignada una edad, solo nombre
		
		// Probando el método setNombre en persona1, que está vacío
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Inglés");
		
		System.out.println(persona1.getNacionalidad());
		
		// Imprimir los atributos completos de mi Objeto en consola
		System.out.println(persona2);
		
		// Modelar un Objeto, el que ustedes gusten
		// con 5 atributos por lo menos
		// Crean Constructor vacío, Constructor con todos los parámetros
		// Getters y Setters
		// Método toString()
		// Y aquí, en esta clase Principal, instancian o crean uno vacío
		// y uno con todos los parámetros
		// y los mandan a imprimir en consola
		
		Pokemon charmander = new Pokemon();
		
		Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 92, 774, 4.08, 0.32);
		
		charmander.setNombre("Charmander");
		
		System.out.println(charmander);
		System.out.println(pikachu);
		
		

	}

}
