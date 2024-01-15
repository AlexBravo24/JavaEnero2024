package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		//API stream -- funcionalidad a partir de java 8
		//que nos permitirá hacer un mejor uso de los datos de una coleccion
		
		//en una coleccion podemos contar con muchos datos
		//y al ponerlos en un flujo vamos a ser capaces de solicitarlos o gestionarlos
		//de la forma que mejor nos convenga, ya sea filtrandolos, ordenandolos
		//etc.
		
		//vamos a crear una lista de personas y vamos a añadir elementos
		
		List<Persona> alumnos = new ArrayList<Persona>();
		
		//crearemos una lista donde seleccionaremos los elementos filtrados
		//de acuerdo a nuestros criterios
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadimos elementos a nuestra lista original (alumnos)
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
		
//		System.out.println(alumnos.get(0));
		
		//si quiero imprimir todos los elementos
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));			
//		}
		
		//Ciclo for each - Para cada elemento de nuestra lista- hará lo que se argumente
		
//		for(Persona i: alumnos) {
//			System.out.println(i);
//		}
		
		//Ciclo for each a través del metodo de la lista
//		alumnos.forEach(a -> System.out.println(a));
		
//		//ejemplo de filtrar algun genero
//		for (Persona i: alumnos) {
//			if (i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//			}
//		}
		
//		filtrada.forEach(i -> System.out.println(i));
		
			//filtrar con el api stream a las personas de genero femenino
//			filtrada = alumnos.stream().filter(i -> i.getGenero().equals("Femenino")).collect(Collectors.toList());
//			
//			filtrada.forEach(i -> System.out.println(i));
		
		//ordenar a las personas por edad ascendente
		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(i -> System.out.println(i));
		
		long cuantos = alumnos.parallelStream().count();
		
		System.out.println(cuantos);
		
	}

}
