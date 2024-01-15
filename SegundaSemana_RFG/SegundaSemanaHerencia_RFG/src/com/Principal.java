package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Sam", "Masculino", "30");
		//("Alex", "Masculino", 24, "RFC1283", "Desarrollador", 25.00, "Vespertino")
		//Empleado desarrollador = new Empleado("Alex", "Masculino", "24", "RFC1283", "Desarrollador", 25,  "Vespertino");
		
		Estudiante estudiante1 = new Estudiante("Sofia", "Femenino", "20", "BUAP", "Computación");
		
		System.out.println(estudiante1.toString());
		
		persona1.comer();
		persona1.respirar();
		persona1.comer("pizza");
		
		Vendedor liverpool = new Vendedor();
		
		liverpool.vender();
	}
	
	

}
