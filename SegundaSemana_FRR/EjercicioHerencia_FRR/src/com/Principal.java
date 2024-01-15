package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona("Femenino", "Jazmin", 45);
		Paciente paciente1 = new Paciente("Masculino", "Enrique", 13, "tos", 4, false);

		System.out.println(persona1);
		System.out.println(paciente1);
		
	}
	

	
}
