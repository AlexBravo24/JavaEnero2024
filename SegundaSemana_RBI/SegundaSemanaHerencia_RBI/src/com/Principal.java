package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de Instanciar una nueva persona
		Persona persona1 = new Persona("Valeria", "Femenino", "25");
		
		//Ejemplo de Instanciar un nuevo empleado
		//una vez  volvemos empleado como clase abstracta
		//no podemos crear instancias de la misma 
		//Empleado desarrollador = new Empleado("Alex", "Masculino", "24", "ALX33", "Java JR", 25000, "matutino");
		
		//Imprimir en consola sus valores
		System.out.println(persona1);
		//System.out.println(desarrollador);
		
		//Probar el metodo comer de nuestra Persona
		
		persona1.comer();
		
		//Probar el metodo respirar de Persona
		
		System.out.println(persona1.respirar());//Estoy respirando
		
		//Probando el metodo polimorfico comer
		persona1.comer("Hamburguesa");
		
		persona1.comer("tortas", 3);
		
		//Vamos a revisar que los metodos ambien son heredados por la clase hija
		
		//desarrollador.respirar();
		
		//Ejemplo de instanciar a un vendedor, que es un objeto de una clase nieta
		Vendedor liverpool = new Vendedor();
		
		liverpool.comer();
		
		liverpool.vender();
		
		

	}

}
