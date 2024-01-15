package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream- Funcionalidad apartir de java8
		/*Que nos va a permitir hacer un mejor uso de los
		 * datos de una coleccion
		 * En una coleccion podemos contar con muchos datos
		 * y a ponerlos en un flujo, vamos a hacer capses 
		 * de solicitarlos o gestionarlos de la forma que mejor nos convenga
		 * ya sea filtrandolos, ordenandolos etc
		 * 
		 * 
		 * Vamos a crear una lista de persona y vamos a añadir elementos*/
		
		List<Persona> alumnos = new ArrayList<Persona>();
		
		//Creamos otra lista donde coleccionaremos los elemento filtrados deacuerdo 
		//a nuestros criterios
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadimos elementos a nuestrra lista original Persona
		
		alumnos.add(new Persona("Alberto",30,"MASCULINO"));
		alumnos.add(new Persona("Fernando",29,"MASCULINO"));
		alumnos.add(new Persona("Edwin",35,"MASCULINO"));
		alumnos.add(new Persona("Alfredo",28,"MASCULINO"));
		alumnos.add(new Persona("Daniel",28,"MASCULINO"));
		alumnos.add(new Persona("Roberto",26,"MASCULINO"));
		alumnos.add(new Persona("Alejandro",31,"MASCULINO"));
		alumnos.add(new Persona("Ana",25,"FEMENINO"));
		alumnos.add(new Persona("Valeria",25,"FEMENINO"));
		alumnos.add(new Persona("Judiel",32,"MASCULINO"));
		alumnos.add(new Persona("Omar",27,"MASCULINO"));
		
		//si quiero imprimir un solo valor en consolo
		
		System.out.println(alumnos.get(0));
		
		//imprimir todos los elemento con ciclo for
		
//		for(int i = 0; i<alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));
//			
//		}
//		
		//con el ciclo for each -para cada elemento de nuestra coleccion
		
//		for (Persona i: alumnos) {
//			System.out.println(i);
//		}
		//Ciclo for each atraves del metodo de la lista
		
//		alumnos.forEach(a -> System.out.println(a));
//		
//		//ejemplo de filtar con un ciclo convencional 
//		
//		for(Persona i : alumnos) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//			}
//		}
//		filtrada.forEach(i -> System.out.println(i));
//		
		//Filtrar con el API Stream a las personas de genro femenino
		
		//ORDENAR ALAS PERSONAS POR EDAD ASCENDENTE
		filtrada  = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		filtrada.forEach(i ->System.out.println(i));
		
		//CONTAR ELEMENTOS EN UNA LISTA
		Long cuantos = alumnos.stream().count();
		
		System.out.println(cuantos);
		
		//ingestigar las funciones all.Match, .anyMatch, .Optiona<Persona>- esta ultimo clase lo que 
		//hace en tener la posibilidad de manejar valore nulos.

	}

}
