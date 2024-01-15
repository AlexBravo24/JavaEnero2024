package com;

public class Principal {

	public static void main(String[] args) {

		//ejemplo de instanciar una nueva persona
		
		Persona persona1 = new Persona("valeria", "Femenino", 25);
		//una vez volvemos empleado como clase abstracta no podemos crear 
		//instancias de la misma
		//Empleado desarrollador = new Empleado("Alex", "Masculino", 24, "alex384", "java jr" , 30000, "matutino");
		
		System.out.println(persona1);
		
		//System.out.println(desarrollador);
		
		persona1.comer();
		persona1.respirar();
		
		persona1.comer(" pizza");
		
		persona1.comer("pollo", 3);
		
		//VAMOS A REVISAR QUE LOS METODOS TAMBIEN SON HEREDADOS POR LA CLASE HIJA
		
		//desarrollador.respirar();
		
		//EJEMPLO DE INSTANCIAR UN VENDEDOR QUE ES UN OBJETO DE UNA CLASE NIETA
		
		Vendedor liverpool= new Vendedor();
		
		liverpool.comer();
		
		liverpool.checarEntrada();
		
		liverpool.vender();
		
	}


}
