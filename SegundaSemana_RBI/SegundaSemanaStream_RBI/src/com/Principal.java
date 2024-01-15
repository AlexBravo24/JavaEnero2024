package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// < > API Stream - Funcionalidad a partir de JAVA 8
		//Que nos va a permitir hacer un mejor uso de los
		//datos de una colección.
		//En una colección podemos contar con muchos datos 
		//y al ponerlos en un "flujo" vamos a ser capaces
		//de solicitarlos o gestionarlos de la forma que
		//mejor nos convenga, ya sea filtrandolos, ordenandolos
		//etc
		
		//Vamos a crear una lista de personas y vamos a añadir elementos
		
		List <Persona> alumnos = new ArrayList <Persona>();
		
		List <Persona> filtrada = new ArrayList <Persona>();
		
		alumnos.add(new Persona("Alberto", 30, "Masculino"));
		alumnos.add(new Persona("Juana", 22, "Femenino"));
		alumnos.add(new Persona("Rogelio", 27, "Masculino"));
		alumnos.add(new Persona("Sofía", 25, "Femenino"));
		alumnos.add(new Persona("Alfredo", 28, "Masculino"));
		alumnos.add(new Persona("Daniel", 28, "Masculino"));
		alumnos.add(new Persona("Ana", 25, "Femenino"));
		alumnos.add(new Persona("Omar", 27, "Masculino"));
		alumnos.add(new Persona("Valeria", 25, "Femenino"));
		alumnos.add(new Persona("Judiel", 32, "Masculino"));
		
		System.out.println(alumnos.get(3));	
		
		/*for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i));	
		}*/
		
		//Ciclo for each - Para cada elemento de nuestra coleccion
		
		/*for(Persona i: alumnos) {
			System.out.println(i.toString());
		}*/
		
		//alumnos.forEach(a -> System.out.println(a));
		
		/*for(Persona i: alumnos) {
			if(i.getGenero().equals("Masculino")) {
				filtrada.add(i);
			}
		}
		filtrada.forEach(a -> System.out.println(a));
		*/
		
		//Filtrar con el API Stream
		//filtrada = alumnos.stream().filter(i -> i.getGenero().equals("Femenino")).collect(Collectors.toList());
		//filtrada.forEach(i -> System.out.println(i.toString()));
		
		//ORDENAR a las personas por edad ascendente 
		
		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(i -> System.out.println(i));
		
		//	CONTAR LOS ELEMENTOS QUE TENEMOS EN UNA LISTA
		long cuantos = alumnos.stream().count();
		
		System.out.println(cuantos);
		
		//Investigar 
		//.allMatch
		//.anyMatch
		//Optional<Persona> - La clase Optional lo que hace es tener la posibilidad de manejar
		//Valores nulos 
	}

}
