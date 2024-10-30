package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona
		Persona persona1= new Persona("Valeria", "Femenino", 25);
		
		//Ejemplo de instanciar un nuevo Empleado
		/*Una vez volvemos Empleado como clase Abstracta 
		 * No podemos crear instancias de la misma 
		 * 
		 * Una vez volvemos Empleado como clase abstracta no se pueden 
		 * crear instancias de la misma 
		 */
		//***Empleado desarrollador= new Empleado ("Alex", "Masculino", 24, "ALX340299DY7", "JAVA JR", 25000, "Matutino"); 
		
		System.out.println(persona1);
		//*** System.out.println(desarrollador);

		 //EJERCICIO DE HERENCIA:Animal
		 
		 //Probar el metodo <comer> de nuestra Persona usando
		 //persona1 y el METODO VOID
		 
		 //Escribiendo esta accion, va a ejecutar la linea de imprimir 
		 // de la clase Persona:
		 //"Estoy comiendo..." en consola
		 persona1.comer();
		 
		 
		 //Probar el metodo <respirar> de nuestra Persona usando
		 //persona1 y el METODO CON RETORNO DE TIPO DE DATO
		 persona1.respirar();
		  //y no aparece nada porque me falta llamar el String 
		 //con imprimir en Principal o en la clase Persona
		 
		 System.out.println(persona1.respirar());
		 
		 //PROBANDO METODO POLIMORFICO comer 
		 persona1.comer("nachos");
		 
		 //PROBANDO METODO POLIMORFICO comer(sobre carga de argumentos)
		 persona1.comer("pizza", 6);
		 
		 
		 //VAMOS A REVISAR LOS METODOS TAMBIEN SON HEREDADOS A LA CLASE HIJA
		 //***desarrollador.respirar();
		 
		 //EJEMPLO DE INSTANCIAR UN VENDEDOR (NIETA)
		 Vendedor liverpool = new Vendedor ();
		 liverpool.comer();
		 
		 liverpool.checarEntrada();
		 
		 //La definio vendedor porque desde Empleado se hizo abstact
		 liverpool.vender();
		 
		 
		 
	}

}
