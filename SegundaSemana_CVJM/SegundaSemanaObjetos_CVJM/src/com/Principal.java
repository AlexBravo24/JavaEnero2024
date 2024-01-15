package com;

public class Principal {

	public static void main(String[] args) {
		/*En la POO solo debe existir una clase con el metodo principal
		
		Ya que aqui llamaremos posteriormente a los objetosque tendrían 
		sus propias acciones
		
		Despues de crear la plantilla aqui yo ya puedo crear una 
		variable de mi clase Persona. La creacion de esta variable 
		se le conoce como "instancia" u "objeto"
		
		*/
		Persona persona1= new Persona(); 
		
		//Si yo quiero asignarle un nombre a perosna1
		
		//persona1.nombre="Gerardo"; <--- forma incorrecta de 
		//asignar valores a un objeto despues de que 
		//se le pusiera un modificador de "private"
		
		//CONSTRUCTOR CON TODOS LOS PARAMETROS
		/*Instanciando una persona con el constructor con todos
		 *los parametros 
		 *
		 *Persona persona2= new Persona Crtl + Space para que salgan los parametros
		 */
		Persona persona2= new Persona("Daniel", 25, "Mexicana", 1.80, 89);
		
		//Instanciar una nueva persona con solo nombre
		Persona persona3 = new Persona("Ana");
		
		//NORMALMENTE VAMOS A UTILIZAR CONSTRUCTOR VACIO Y EL DE TODOS 
		//LOS PARAMETROS 
		
		
		/*METODOS GETTERS Y SETTERS
		 * Get: recuperar el valor de un atributo asignado
		 * Set: establecer el valor del parametro (atributo) cuando los 
		 * atributos son privados
		 * 
		 */
		
		//Probado el metodo getNombre en la persona3 (nos permitira 
		//recuperar el valor del nombre almacenado en la variable
		
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
	
		//Probando metodo setNombre en perona1 que esta vacio
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Cubana");
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getNacionalidad());
		
		//Imprimir los atributos completos de mi objeto en consola
		System.out.println(persona3); //<-- forma incorrecta si no se ha 
		// generado el metodo ToString (sale un codigo)
		
		//Manera en la que podemos imprimir todos los atributos
		//de manera correcta --> ir a la variable principal (Persona)
		// y generar el metodo "Generate toString()" para convertirlos en texto
		
		System.out.println(persona1);
		
		/*Modelar un objeto, con minimo 5 atributos 
		 * Crear constructor vacio, constructor con todos los parametros y 
		 * Getters y Setters
		 * Metodo toString()
		 * y en esta misma clase Principal, instanacian o crean uno vacio
		 * y uno con todos los parametros
		 * y los mandan a imprimir a consola
		 */
		
		Mascota tiaPerrita =new Mascota();
		
		Mascota miPerrita =new Mascota("Rihanna", "Pughuahua", 5, 1, "Super bonita", "Corre mucho", "La mas tierna del mundo");
		
		tiaPerrita.setNombre("Yaki");
		
		System.out.println(miPerrita);
		System.out.println(tiaPerrita);

	}

}
