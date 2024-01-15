package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream : Funcionalidad apartir de java 8 que nos va a permitir hacer un mejor uso de los datos de una coleccion, en una coleccion podemos contar con muchos datos 
		//y al ponerlos en un "flujo" vamos a ser capaces de solicitarlos o gestionarlos de la forma que mas con convenga, ya sea filtrandolos, ordenandolos etc 
		
		//vamos a crear una lista de persona y vamos a añadir elementos 
		List<Persona> alumnos = new ArrayList<Persona>();
		
		//creamos otra lista donde coleccionaremos los elementos filtrados de acuerdo a nuestros criterios 
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//añadimos elementos a nuestra lista original 
		alumnos.add(new Persona("Alberto", 30,"Masculino"));
		alumnos.add(new Persona("Fernando", 29,"Masculino"));
		alumnos.add(new Persona("Edwin", 35,"Masculino"));
		alumnos.add(new Persona("Afredo", 28,"Masculino"));
		alumnos.add(new Persona("Daniel", 28,"Masculino"));
		alumnos.add(new Persona("Roberto", 26,"Masculino"));
		alumnos.add(new Persona("Alejandro", 31,"Masculino"));
		alumnos.add(new Persona("Ana", 25,"Femenino"));
		alumnos.add(new Persona("Valeria", 25,"Femenino"));
		alumnos.add(new Persona("Judiel", 32,"Masculino"));
		alumnos.add(new Persona("Omar", 27,"Masculino"));
		
		//si quiero imprimir un solo valor en consola 
		//System.out.println(alumnos.get(0));
		//si quiero imprimir todos los elementos recurrimos a un ciclo for
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));
//		}
		
		//ciclo for each - para cada elemento de nuestra coleccion
		
//		for (Persona i: alumnos) {
//			System.out.println(i);
//		}
		
		//ciclo for each- a traves del metodo de lista
		//alumnos.forEach(a -> System.out.println(a));
		
		//ejemplo de filtrar algun genero con un ciclo convencional
//		for (Persona i: alumnos) {
//			if(i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//			}
//		}
//		filtrada.forEach(i -> System.out.println(i));
		
		//filtrar con el API Stream a las personas de genero femenino 
//		filtrada = alumnos.stream().filter(i -> i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		
//		filtrada.forEach(i -> System.out.println(i));
		
		//ordenar a las personas por edad ascendente
		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		filtrada.forEach(i -> System.out.println(i));
		
		//contar los elementos que tenemos en una lista 
		long cuantos = alumnos.stream().count();
		System.out.println(cuantos);
		
		//pueden investigar que hacen las funciones 
		//.allmatch
		//.anymatch
		//Optional<persona> - la clase optional lo que hace es tener la posibilidad de manejar valores nulos 

	}

}
