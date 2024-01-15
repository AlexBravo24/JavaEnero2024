package com;

public class Principal {

	public static void main(String[] args) {
		
		// Ejemplo de instanciar una nueva persona 
		
		Persona persona1 = new Persona("Valeria", "Femenino" , "25");
		//ejemplo de instanciar un empleado
		//una vez volvemos empleado como clase abstracta no podemos crear instancias de la misma
		//Empleado desarrollador = new Empleado("Alex", "Masculino", "24","ALE33","JAVA JR", 25000, "Matutino");
		
		System.out.println(persona1);
		//System.out.println(desarrollador);
		
		//probar el metodo (Comer) de nuestra persona 
		persona1.comer();
		
		//probar el metodo respirar de persona 
		System.out.println(persona1.respirar());
		
		//probando el metodo polimorfico
		persona1.comer(" Pizza");
		
		persona1.comer("Pollo",  4);
		
		//vamos a revisar los metodos son heredados por la clase hija 
		//desarrollador.respirar();
		
		//instanciar in vendedor, es un objeto de una clase nieta
		Vendedor liverpool = new Vendedor();
		liverpool.comer();
		
		liverpool.checarentrada();
		
		liverpool.vender();

	}

}