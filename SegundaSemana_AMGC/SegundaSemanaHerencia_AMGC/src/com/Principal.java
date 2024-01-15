package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva persona
		Persona persona1 = new Persona("Valeria", "Femenino", 25);
		
		//Ejemplo de instanciar un nuevo empleado
		//Una vez volvemos empleado como clase abstracta, no podemos crear instancias de la misma
		//Empleado desarrollador = new Empleado("Alex", "Masculino", 24, "ALX33", "Java JR", 25000, "Matutino");
		
		//Ejemplo de instanciar un nuevo alumno
		Alumno alumno1 = new Alumno("Ximena", "Femenino", 22, "UDLAP", 5, 9.6);
		
		//Imprimir en consola valores
		System.out.println(persona1);
		//System.out.println(desarrollador);
		System.out.println(alumno1);
		
		//Probar el método comer de nuestra Persona
		persona1.comer();
		
		//Probar el método respierar de Persona
		//persona1.respirar(); //"Estoy respirando"
		System.out.println(persona1.respirar());
		
		//Probando el método polimórfico comer
		persona1.comer("pozolito");
		
		persona1.comer("Pollo", 4);
		
		//Vamos a revisar que los métodos son heredados por la clase Hija
		//desarrollador.respirar();
		
		//Ejemplo, instanciar un vendedor, que es un objeto de una clase nieta
		Vendedor liverpool = new Vendedor();
		
		liverpool.comer();
		
		liverpool.vender();
		

	}

}
