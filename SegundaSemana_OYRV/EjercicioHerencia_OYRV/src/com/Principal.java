package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Escuela escuela1 = new Escuela("Ingles Mexicano", "Masculino", "15");
		Alumno alumno1 = new Alumno( "Ana", "Femenino", "24", "Sexto", "Ingles", "Matutino");
		
		System.out.println(escuela1);
		System.out.println(alumno1);
		
	}
	
}
