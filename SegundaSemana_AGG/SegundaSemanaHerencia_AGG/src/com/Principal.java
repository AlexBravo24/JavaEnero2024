package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona
		
		Persona persona1= new Persona("Valeria", "Femenino", 25);
		
		//Ejemplo de instanciar un nuevo Empleado
		//una vez volvemos empleado como clase abstracta, 
		//no podemos crear instancias de la misma	
		//Empleado desarrollador=new Empleado("Alex", "Masculino", 24, "GOGA921109", "Java JR", 25000, "Matutino");
		
		//Imprimir en consola sus valores
		System.out.println(persona1);
		//System.out.println(desarrollador);

		//probar el metodo "comer" de nuestra persona
		
		persona1.comer();
		
		//vamos a probar el metodo "respirar" de nuestra persona
		persona1.respirar();
		
		//probando el metodo polimofico "comer"
		
		persona1.comer("pizza");
		
		persona1.comer("pollo", 4);
		
		//VAMOS A REVISAR LOS METODOS TAMBIEN HEREDADOS POR LA CLASE HIJA
		
		//desarrollador.respirar();
		
		//Ejemplo de instanciar un vendedor, que es un objeto de una clase nieta
		
		Vendedor liverpool = new Vendedor();
		
		liverpool.comer();
		
		liverpool.vender();
		
		
		
	}

}
