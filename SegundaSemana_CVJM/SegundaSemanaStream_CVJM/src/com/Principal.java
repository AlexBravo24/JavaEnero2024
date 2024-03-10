package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		/* API STREAM - Funcioalidad a partir de Java 8, que nos va a permitir hacer 
		 * un mejor uso de los datos de una coleccion.
		 * En una coleccion podemos contar con muchos datos y al ponerlos en un 
		 * "flujo"/Stream vamos a ser capaces de solicitarlos o gestionarlos 
		 * de la forma que mejor nos convenga, ya sea filtrandolos, ordenandolos, etc.
		 * 
		 * A traves de una sola linea de codigo determinar las funcionalidades
		 * 
		 * Vamos a crear una lista de persona y añadiremos elementos
		 */
		//Definir coleccion List

		List <Persona> alumnos = new ArrayList<Persona>(); //Lista original
		
		//Creamos otra lista donde coleccionaremos los elementos filtrados 
		//de acuerdo a nuestro criterio
		
		List<Persona>filtrada=new ArrayList<Persona>();
		
		//Añadimos elementos a nuestra lista original "alumnos"
		alumnos.add(new Persona("Alberto", 30, "Masculino"));
		alumnos.add(new Persona("Fernando", 29, "Masculino"));
		alumnos.add(new Persona("Edwin", 35, "Masculino"));
		alumnos.add(new Persona("Alfredo", 28, "Masculino"));
		alumnos.add(new Persona("Daniel", 28, "Masculino"));
		alumnos.add(new Persona("Roberto", 26, "Masculino"));
		alumnos.add(new Persona("Alejandro", 31, "Masculino"));
		alumnos.add(new Persona("Ana", 25, "Femenino"));
		alumnos.add(new Persona("Valeria", 25, "Femenino"));
		alumnos.add(new Persona("Judiel", 32, "Masculino"));
		alumnos.add(new Persona("Omar", 27, "Masculino"));
		
		// Si quiro imprimir un solo valor en consola
		System.out.println(alumnos.get(0));
		
		//Si quiero imprimir todos los elementos recurrimos a un ciclo for
		//for (int i = 0; i < alumnos.size(); i++) {
			//System.out.println(alumnos.get(i));
			
		//}
		
		//Ciclo for each - Es para cada elemento de nuestra coleccion
		// for (Clase) i:Esta en la lista alumnos que quiero mostrar
		//{ quiero que ejecute lo sig
		
		//for (Persona i:alumnos) {
			//System.out.println(i);
		//}
		
		//Ciclo for each a traves del metodo de la lista 
		//coleccion.forEach(determinar parametro llamado por mi) -> expresion Lambda
		//alumnos.forEach(a->System.out.println(a)); 
		
		//Ejemplo de FILTRAR algun genero con un ciclo convencional
		//Para cada elemento persona
//		for (Persona i:alumnos) {
//			if(i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//			}
//		}
//		
//		
//		filtrada.forEach(i->System.out.println(i));
//	
		//Filtrar con el API Stream a las personas de genero Femenino
		//filtrada =alumnos.stream().filter(i-> i.getGenero().equals("Femenino")).collect(Collectors.toList());
		
		//filtrada.forEach(i-> System.out.println(i));
		
		//ORDENAR A LAS PERSONAS por edad ascendente
		//utilzamos la interface comparator, (se compara la edad de menos a mayor)
		filtrada=alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		filtrada.forEach(i->System.out.println(i));
				
		//Contar los elementos que tenemos en una lista
		long cuantos = alumnos.stream().count();
		
		//.allMatch
		//.anyMatch
		//Optional<Persona)(envolver al dato en )- La clase opcional hace tener la 
		//posibilidad de manejar valores nulos
	}

}
