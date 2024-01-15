package com;

public class Principal {

	public static void main(String[] args) {
		//En la POO solo debe haber una clase con el metodo main (principal)
		//Aqui llamaremos a los objetos que tendran sus propias acciones
		
		//Variable de clase persona
		//A esto se le conoce como instancia u objeto
//		Persona persona1 = new Persona();
		
		
		//Asignar nombre a esta persona
		
		//persona1.nombre="Carlos"; //forma incorrecta de asignar valores a un objeto
		
		//Instanciar Persona con el constructor con todos los parametros
//		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.7, 70);

		
		//Instancia de un solo constructor
//		Persona persona3 = new Persona("Anna");
		
		
		//Probando metodo GETT recuperando el nombre de la persona 3
//		System.out.println(persona3.getNombre());
//		System.out.println(persona3.getEdad());
		
		//Probando el metodo gett nombre en persona 1 que esta vacip
//		persona1.setNombre("Carlor");
//		persona1.setNacionalidad("Ingles");
		
//		System.out.println(persona1.getNacionalidad());
		
		
		//Imprimir los atrivutos compleos de una persona
//		System.out.println(persona2);
		
		
		Hamburguesa hamburguesa1 = new Hamburguesa();
		Hamburguesa hamburguesa2 = new Hamburguesa("Hawaiana", "Jamon y piña", "Papas gajo", 10);
		
		hamburguesa1.setNombre("Hamburguesa Doble");
		hamburguesa1.setPrecio(12);
		
		System.out.println(hamburguesa1.getNombre());
		System.out.println(hamburguesa1.getPrecio());
		System.out.println(hamburguesa2);
		

		
	}

}
