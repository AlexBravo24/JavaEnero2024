package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stream- funcionalidad apartir de JAVA 8
		//que no va a permitir hacer un mejor uso de los
		//datos de una coleccion
		//En una colleccion podemos contar con muchos datos
		//y al ponerlos en un flujo vamos a ser capaces de
		//solicitarlos o gestionarlos de la forma que
		//mejor nos convenga, ya sea filtrandolos, ordenandolos
		//etc
		
		//Vamos a crear una lista de personas y vamos a añadir
		//elementos
		
		List<Persona> alumnos = new ArrayList<Persona>();
		
		//Creamos otra lista donde colleccionaremos los elementos
		//filtrados de acuerdo a nuestros criterios
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//añadimos elementos a nuestra lista original (alumnos)
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
		
//		//Si quiero imprimir un solo valor en consola
//		System.out.println(alumnos.get(0));
//		
//		Si quiero imprimir todos los elementos en consola (for)
//	    
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));
//	}	
		
		//Ciclo for each - Para cada elemento de nuestra coleccion
		
//		for (Persona i: alumnos) {
//			System.out.println(i);	
//		}

//		//Ciclo for each a travez del metodo de la lista
//		alumnos.forEach(a -> System.out.println(a));
		
		//Ejemplo de filtrar algun genero con un ciclo convencional
//		for (Persona i: alumnos) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//			}
//			filtrada.forEach(i->System.out.println(i));
//		}
		
		
//		
//		
//		//fILTRAR CON EL API STREAM ALAS PERSONAS DE GENERO FEMENINO
//		
//	    filtrada = alumnos.stream().filter(i -> i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		
//		filtrada.forEach(i -> System.out.println(i));
//		
        //Ordenar a las personas por la edad ascedente
	    filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
	    
	    filtrada.forEach(i -> System.out.println(i));
	    
	    //CONTAR LOS ELEMENTOS QUE TENEMOS EN UNA LISTA
	    long cuantos = alumnos.stream().count();
	    
	    System.out.println(cuantos);
	    
}    
}
