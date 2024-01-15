package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo debe existir una clase
		// con el metodo principal(main)

		// Ya que aqui llamaremos posteriormente a los
		// objetos que tendrán sus propias acciones

		// Aqui ya puedo crear una variable de mi clase Persona.java
		// La creacion de esta variable se le conoce como
		// "instancia" y objeto.

		Persona persona1 = new Persona();// esto es un obejeto o instancia

		// Si yo quisiera asignarle un nombre a persona1:

		// persona1.nombre = "Edwin"; <-- forma incorrecta
		// de asignar valores a un objeto

		// Instanciando una persona con el constructor con
		// todos los paremetros

		Persona persona2 = new Persona("Juan", 45, "Mexicana", 1.70, 54.5);

		// Ejemplo persona con solo nombre
		Persona persona3 = new Persona("chetti");
		
		
		//Ejemplo de puebla de metodo GET en la persona 3
		
		System.out.println(persona3.getNombre());//imprime chetti
		
		System.out.println(persona3.getEdad());//imprime 0 por que no se ha asignado edad
		
		//ejemplo del metodo SET en nombre
		
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Inglés");
		
		System.out.println(persona1.getNacionalidad());
		
		//SI quiero imprimir en pantalla todos los atributos de persona2
		
		System.out.println(persona2);//Para que funcione así es necesario generar el source de toString
		
		
		//Ejercicio 
		
		RazaPerro husky = new RazaPerro();
		RazaPerro belgianMalinois = new RazaPerro("Pastor Belga", "Café y/o Negro", 60, 35.5, 12);
		husky.setName("Siberiano");
		
		System.out.println(husky);
		System.out.println(belgianMalinois);
		
		
		
		

	}
}