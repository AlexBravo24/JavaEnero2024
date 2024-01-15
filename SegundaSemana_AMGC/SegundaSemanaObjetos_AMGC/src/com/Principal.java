package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO solo debe existir una clase con el m�todo main
		//Ya que aqu� llamaremos posteriormente a los objetos que tendr�n sus propias acciones
		
		//Aqu� ya puedo crear una variable de mi clase Persona
		//La creaci�n de esta variable se le conoce como "instancia" u objeto en s�
		Persona persona1 = new Persona();
		
		//Si yo quiero asignarle un nombre a persona1
		//persona1.nombre="Carlos"; <-- forma incorrecta de asignar valores a un objeto con modificador
		
		//Instanciando una persona con el constructor con todos los parametros
		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);
		
		//Instanciar una nueva persona con solo nombre
		Persona persona3 = new Persona("Ana");
		
		//Probando el m�todo getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//Probadno el m�todo setNombre en persona1 que est� vac�o
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Ingl�s");
		
		System.out.println(persona1.getNacionalidad());
		
		//Imprimir los atriburos completos de mi objeto en consola
		System.out.println(persona2);
		
		
		/* EJERCICIO
		 * Modelar un objeto, el que ustedes gusten
		 * Con 5 atributos
		 * Crean construtor vacio, constructor con todos los parametros, getters y setters, m�todo
		 * toString().
		 * y aqu� en esta clase Principal, instancian o crean uno vac�o, uno con todos los
		 * par�metros y los mandan a imprimir en consola
		 */
		
		Parkinson paciente1 = new Parkinson();
		Parkinson paciente2 = new Parkinson("Mujer", 68, true, false, true, "Probable");
		
		
		paciente1.setTemblor(true);
		paciente1.setDiagnostico("Positivo");
		
		System.out.println(paciente1);
		System.out.println(paciente2);
		
	}

}
