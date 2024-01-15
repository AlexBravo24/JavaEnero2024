package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		// API Stream - Funcionalidad a partir de JAVA 8
		// que nos va a permitir hacer un mejor uso de los
		// datos de una colección
		// En una coleccion podemso contar con muchos datos
		// y al ponerlos en un "flujo" o Stream, vamos a ser capaces
		// de solicitarlos o gestionarlos de la forma que mas nos convenga
		// ya se filtrando, ordenando, etc.

		// Vamos a crear una lista de personas y vamos a añadir elementos

		List<Persona> alumnos = new ArrayList<Persona>();

//		Creamos otra lista donde coleccionaremos(guardaremos) los elemetos
//		filtrados de acuerdo a nuestros criterios

		List<Persona> filtrada = new ArrayList<Persona>();

		// Añadimos elementos a la lista original (alumnos)

		alumnos.add(new Persona("Alberto", 30, "MASCULINO"));
		alumnos.add(new Persona("Fernando", 29, "MASCULINO"));
		alumnos.add(new Persona("Edwin", 35, "MASCULINO"));
		alumnos.add(new Persona("Alfredo", 28, "MASCULINO"));
		alumnos.add(new Persona("Daniel", 28, "MASCULINO"));
		alumnos.add(new Persona("Roberto", 26, "MASCULINO"));
		alumnos.add(new Persona("Alejandro", 31, "MASCULINO"));
		alumnos.add(new Persona("Ana", 25, "FEMENINO"));
		alumnos.add(new Persona("Valeria", 25, "FEMENINO"));
		alumnos.add(new Persona("Judiel", 32, "MASCULINO"));
		alumnos.add(new Persona("Omar", 27, "MASCULINO"));

		// Si quiero imprimir un solo valor en consola
		// System.out.println(alumnos.get(0));

		// tenemos 3 opciones
		// 1 si quiero imprimir todos los elementos, recurrimos a un ciclo

//		for(int i=0; i< alumnos.size();i++) {
//			System.out.println(alumnos.get(i));
//		}

		// 2 existe tambien la opcion for each para cada elementos de nuestra coleccion
//		System.out.println("Ahora for each");
//		for(Persona i: alumnos) {
//			System.out.println(i);
//		}
//		

		// 3 ciclo for each a traves del metodo de la lista
		// alumnos.forEach(item -> System.out.println(item));

		// ejemplo de filtrar algun genero con un ciclo convencional
		// donde se agregar a otra lista
//		for (Persona i : alumnos) {
//			if (i.getGenero().equals("FEMENINO")) {
//				filtrada.add(i);
//			}
//		}
//
//		filtrada.forEach(i -> System.out.println(i));

		// OPCION EN 2 LÍNEAS CON API STREAM
		// EJEMPLO DE FILTRAR CON EL API STREAM A LAS PERSONAS DE GENERO FEMENINO

//		filtrada = alumnos.stream().filter(i -> i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		
//		filtrada.forEach(i -> System.out.println(i));

		// ORDENAR a las personas por edad ascendente

		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());

		filtrada.forEach(i -> System.out.println(i));

		// CONTAR LOS ELEMENTOS EN UNA LISTA
		long cuantos = alumnos.stream().count();
		System.out.println(cuantos);
		
		//.allMatch
		//.anyMatch
		//Optional<Persona> - La clase Optional lo que hace es tener la posibilida de 
		// manejar valores nulos
		
	}

}
