package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva Persona
		Persona persona1 = new Persona("Valeria", "Femenino", 25);
		
		//Ejemplo de instanciar un nuevo Empleado
		//Una vez volvemos Empleado como clase Abstracta
		//No podemos crear instancias de la misma
		//Empleado desarrollador = new Empleado("Alex", "Masculino", 24, "ALX33", "Java JR", 25000, "Matutino");
		
		//Imprimir en consola sus valores
		System.out.println(persona1);
		
		//System.out.println(desarrollador);
		
		//EJERCICIO. REALIZAR UN EJEMPLO DE HERENCIA
		//POR EJ. UNA CLASE ANIMAL, QUE HEREDA A OTRA CLASE, POR EJ. PERRO
		
		//Probar el método comer de nuestra Persona
		persona1.comer();
		
		//Probar el método respirar de Persona
		persona1.respirar(); //"Estoy respirando"
		
		//Probando el método polimorfico comer
		persona1.comer("pizza");
		
		persona1.comer("pollo", 4);
		
		//VAMOS A REVISAR QUE LOS MÉTODOS TAMBIÉN SON HEREDADOS POR LA CLASE HIJA
		//desarrollador.respirar();
		
		//EJEMPLO DE INSTANCIAR UN VENDEDOR, QUE ES UN OBJETO DE UNA CLASE NIETA
		Vendedor liverpool = new Vendedor();
		
		liverpool.comer();
		
		liverpool.vender();
		
		

	}

}
