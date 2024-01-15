package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//Lista es una coleccion o conjunto de elementos
		//Que admite elementos duplicados
		//se impplementa a travez de la clase array list
		//se basa en un array redimensionable
		//es de las que mejor rendimiento tiene
		//sobre la mayoria de implementaciones
		
		//puede alamcenar tipos de datos en comun
		//incluyendo objetos
		
		//Ejemplo de como declarar una lista de elementos
		//String
		//estas colecciones se encuentran en el paquete java.util
		//por lo que hay que importarlas
		
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tipos de datos estructurados (objeto)
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//si quiero mostrar un elemento en especifico en consola
		System.out.println(lista.get(3));
		
		//.contains () - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Judiel"));
		System.out.println(lista.contains("Rafael"));
		
		//.indexof - Devuelve en la que se encuentra por primera vez
		System.out.println(lista.indexOf("Elias"));
		
		//.lastindexof - Devuelve el indice donde encuentra al elemento 
		//la ultima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - elimina al elemento mediante la posicion 
		//o mediante el objeto en la posicion primera que encuentre
	    
		//lista.remove("Elias");
		//System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		
		//conforme vamos eliminando, los valores del indice
		//se van desplazando, siendo ocupados por los otros elementos
		
		//si yo quiero agregar nuevo elemento en la posicion 3
		//el elemento que ocupa esa posicion va ser dezplazado a la siguiente
		//y no elimina el siguiente
		lista.add(3,"Enrique");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Podemos declarar una lista sin parametrizar
		List<Object>elementos = new ArrayList<Object>();
		
		//Esto me va a permitir diferentes tipos de dato en ella
		elementos.add("alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);

}
}
