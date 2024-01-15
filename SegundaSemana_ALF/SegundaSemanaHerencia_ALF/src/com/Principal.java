package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva persona
		
		Persona persona1 = new Persona("Valeria","Femenino",25);
		
		//Instanciar un nuevo empleado
		//Una vez volvemos a empleado como calse abstracta
		//no podemos crear instancias de la misma
		//Empleado desarrollador = new Empleado("Alfredo","Masculino", 24, "ALX33","Java Jr", 25000,"Matutino");
		
		System.out.println(persona1);
		
		//System.out.println(desarrollador);
		
		//EJERCICICIO HERENCIA
		Persona persona2 = new Persona("Alfredo","Masculino",25);
		
		Extranjero pasaporte = new Extranjero("Jullian", "Masculino", 30,"Alemana",8958737, "Soltero", 80000,"Aria");
		
		System.out.println(persona2);
		System.out.println(pasaporte);
		
		
		//PROBAR EL METODO COMER DE NUESTRA PERSONA
		
		persona1.comer();
		//Probar el metodo de respirar de persona
		
		System.out.println(persona1.respirar());
		System.out.println("llamando la variable oxigeno");
		persona1.respirar();
		
		//PROBANDO EL METODO POLIMORFICO COMER
		persona1.comer("hamburguesa");
		
		persona1.comer("Pollo", 3);
		
		//Vamor a revisar que los metodos tambien son heredados por la clase hija
		
		//desarrollador.respirar();
		
		//Ejemplo de instacia de un vendedor
		//es un objeto de clase nieta
		
		Vendedor liverpool = new Vendedor();
		
		liverpool.comer();
		
		liverpool.vender();
		
		
		
		
	}

}
