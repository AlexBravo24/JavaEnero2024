package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona
		
		Persona persona1 = new Persona("Valeria", "Femenino", 25);
		
		//Ejemplo de instaciar un nuevo empleado
		
		//Empleado desarrollador = new Empleado("Edwin", "Masculino", 45, "EGC4851157", "desarrollador java jr.", 25000, "Matutino");
		//Una vez volvemos Empleado como una clase abstracta no podemos crear instancias de la misma
		
		//Imprimir con consola sus valores
		System.out.println(persona1);
		//System.out.println(desarrollador);
		
		Estudiante student1 = new Estudiante("Tito", "Masculino", 28, "Tecnologías de la Información", "Matutino", 8.3);
		System.out.println(student1);
		
		//Probar el metodo comer de nuestra persona
		persona1.comer();
		
		//Probar el metodo respirar con return
		System.out.println(persona1.respirar());
		//Probando el metodo polimorfico comerF
		persona1.comer("Pizza");
		persona1.comer(4, "pollo");
		
		//vamos a revisar que los metodos tambien
		// son heredados por la clase hija
		
		student1.comer();
		
		Vendedor vendedorLiverpool = new Vendedor();
		
		vendedorLiverpool.vender();

		
	}
	
	

}
