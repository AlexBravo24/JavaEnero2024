package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la Programaci�n Orientada a Objetos (POO), solo
		// debe existir una clase con el m�todo principal,
		// ya que aqu� llamaremos posteriormente a los objetos
		// que tendr�n sus propias acciones
		
		// Aqu� ya puedo crear una variable de mi clase
		// Persona. La creaci�n de esta variable
		// se le conoce como "instancia" u objeto en s�
		
		Persona persona1 = new Persona();
		
		// Si yo quiero asignarle un nombre a persona1
		// persona1.nombre="Carlos"; <-- Forma incorrecta
		// de asignar valores a un objeto
		
		// Instanciando una persona con el Constructor con todos
		// los par�metros
		
		Persona persona2 = new Persona("Daniel", 28, "Mexicana", 1.71, 70);
		
		// Instanciar una nueva persona con solo nombre
		Persona persona3 = new Persona("Ana");
		
		// Probando el m�todo getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad()); // Imprime 0 porque
		// Ana no tiene asignada una edad, solo nombre
		
		// Probando el m�todo setNombre en persona1, que est� vac�o
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Ingl�s");
		
		System.out.println(persona1.getNacionalidad());
		
		// Imprimir los atributos completos de mi Objeto en consola
		System.out.println(persona2);
		
		// Modelar un Objeto, el que ustedes gusten
		// con 5 atributos por lo menos
		// Crean Constructor vac�o, Constructor con todos los par�metros
		// Getters y Setters
		// M�todo toString()
		// Y aqu�, en esta clase Principal, instancian o crean uno vac�o
		// y uno con todos los par�metros
		// y los mandan a imprimir en consola
		
		Pokemon charmander = new Pokemon();
		
		Pokemon pikachu = new Pokemon("Pikachu", "El�ctrico", 92, 774, 4.08, 0.32);
		
		charmander.setNombre("Charmander");
		
		System.out.println(charmander);
		System.out.println(pikachu);
		
		

	}

}
