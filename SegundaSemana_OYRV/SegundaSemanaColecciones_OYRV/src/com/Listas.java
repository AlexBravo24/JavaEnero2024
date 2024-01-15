package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto de elementos que admmite elementos duplicados, se implementa atraves de la clase Arraylist y se basa en un array redimensionable 
		// es de las que mejor rendimiento tiene sobre la mayoria de situaciones, puede almacenar un tipo de datos en comun, incluyendo objetos 
		//Ejemplo de como declarar una lista de elementos String
		//estas colecciones se encuentran en el paquete java.until por lo que hay que importarlas 
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//las listas solo admiten tipos de datos estructurados (objeto)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafed");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//visualizar el conjunto de elementos de mi lista 
		System.out.println(lista);
		
		//si quiero mostrar un elemento en especifico en consola 
		System.out.println(lista.get(3));
		
		//.contains () - devuelve el true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOf - devuelve la posicion en la que enceuntra por primera vez al elemento 
		System.out.println(lista.indexOf("Elias"));
		
		//.lastindexOf - devuelve el indice donde encuentra al elemento por ultima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - elimina al elemento mediante la posicion 
		//o mediante el objeto pero lo elimina solo la primera vez que loo encuentra 
		lista.remove(3);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		//conforme vamos eliminando elementos los valores del indice se van desplazando siendo ocupados por los otros elementos 
		
		//si yo quiero agregar un nuevo elemento el la posicion 3
		//el elemtno que ocupa esa pasicion va a ser desplazado al siguiente mas no eliminado o reemplazado 
		lista.add(3,"Enrique");
		System.out.println(lista);
		
		//reemplazar el valor de una determinada posiscion 
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));

		}
		
		//PODEMOS DECLARAR UNA LISTA SIN PARAMETRIZAR
		List<Object> elementos = new ArrayList<Object>();
		
		//esto me va a permitir guardar diferentes tipos de datos en ella
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		
		

	}

}
