package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Ejemplo de instanciar una nueva persona 
		Persona persona1 = new Persona("Valeria", "Femenino", 22);
		System.out.println();
		
		//Ejemplo de instanciar empleado
		//Una vez que volvemos abstracta la clase empleado, no podemos crear instancias
//		Empleado desarrollador = new Empleado("Alex", "Masculino", 24, "alex33", "Java Jr", 25000, "Matutino");
//		System.out.println(desarrollador);
		
		
		//Probar el metodo comer de nuestra persona
		persona1.comer();
		//Probar metodo respirar de persona
		persona1.respirar();
		
		
//		String comida;
//		System.out.println("que come"); //Esto es solo para mi jajaja comprobar que puedo dar los datos  desde terminal
//		comida = sc.next();
		//Probando el metodo polimorfico comer
		persona1.comer("pizza", 2);
		
		
		//Los metodos tambien son heredados por la clase hija
//		desarrollador.respirar();
		
		
		//Instanciar clase nieta (Vendedor)
		Vendedor vendedor = new Vendedor("Juan", "Masculino", 25, "JUA123", "Java Med", 27000, "Matutino", 0.15);
		System.out.println(vendedor);
		
		vendedor.checarEntrada();
		vendedor.comer("pizza");
		vendedor.vender();
		
		
//		Estudiantes estudiante1 = new Estudiantes("Jose", "Masculino", 19, "N387GB5G", "Medicina", "4 años");
//		System.out.println(estudiante1);
//		Estudiantes estudiante2 = new Estudiantes("Sarai", "Femenino", 24, "SAR123", "Ciencias Sociales", "4 años");
//		System.out.println(estudiante2);
//		Estudiantes estudiante3 = new Estudiantes("Miguel", "Masculino", 20, "MIG4567", "Filosofia", "4 años");
//		System.out.println(estudiante3);
	
	
	
	
	
	}
}
