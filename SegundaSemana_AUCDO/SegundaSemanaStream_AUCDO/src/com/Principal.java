package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream - es una funcionalidad apartir de java 8 nos vapermitir
		//hacer un mejor uso de los datos de una coleccion
		//En una coleccion podemos contar con muchos datos y al ponerlos en un flujo
		//vamos a ser capaces de solicitarlos o gestionarlos de la forma que mas nis convenga
		//ya sea filtrandolos, ordenandolos, etc
		
		//Vamos a crear una loista de personas y vamos a
		//añadir elementos
		List<Persona> alumnos = new ArrayList <Persona>();
		
		//Creamos otra lista donde colecionaremos los alementos filtrados
		//deacuerdo a nuestros criterios
		List<Persona>filtrada = new ArrayList<Persona>();
		
		//Añadimos elementos a la lista original
		alumnos.add(new Persona("Alberto", 30, "Masculino"));
		alumnos.add(new Persona("Fernando", 29, "Masculino"));
		alumnos.add(new Persona("Edwin", 28, "Masculino"));
		alumnos.add(new Persona("Alfredo", 35, "Masculino"));
		alumnos.add(new Persona("Daniel", 28, "Masculino"));
		alumnos.add(new Persona("Alfredo", 25, "Masculino"));
		alumnos.add(new Persona("Roberto", 26, "Masculino"));
		alumnos.add(new Persona("Alejandro", 31, "Masculino"));
		alumnos.add(new Persona("Ana", 25, "Femenino"));
		alumnos.add(new Persona("Omar", 27, "Masculino"));
		alumnos.add(new Persona("Judiel", 32, "Masculino"));
		alumnos.add(new Persona("Valeria", 25, "Femenino"));
		
		//Si quiero imprimir un solo valor en consola
//		System.out.println(alumnos.get(0));
		
		//Si yo quiero imprimir todos los elementos
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));
//		}
		
		//O con un ciclo for each - Para cadaa elemnto de nuestra coleccion
//		for(Persona i: alumnos) {
//			System.out.println(i);
//		}
		
		//Ciclo for each atraves del metodo de la lista
//		alumnos.forEach(a -> System.out.println(a));
		
		//Ejemplo de filtrar algun genero con ciclo convencional
//		for (Persona i: alumnos) {
//			if (i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//			}		
//		}
//		filtrada.forEach(i -> System.out.println(i));
		
		
		//Ejemplo de filtrar con API Stream al genero femenino
//		filtrada = alumnos.stream().filter(i -> i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		filtrada.forEach(i -> System.out.println(i));
		
		//ORDENAR a las personas por edad ascendente
//		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		filtrada.forEach(i->System.out.println(i));
		
		//Contar los elementos que tenemos en una lista
		long cuantos = alumnos.parallelStream().count();
		System.out.println(cuantos);
		
		//.allMatch
		//.anyMatch
		//Optional <persona> - la clase Optional lo que hace es tener la posibilidad
		//de manejar valores nulos 
		
		
		
		
		
		
	}

}
