package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto
		//de elementos, que admite elementos duplicados
		//se implementa a traves de la clase ArrayList
		//y se basa en un array redimensionable
		//es la que mejor rendimiento tiene sobre la 
		//mayoria de las situaciones
		
		//puede almacenar un tipo de datos en comun
		//incluyendo objetos
		
		//Ejemplo de como declarar una lista de elementos "String"
		//Estas colecciones, se encuentran en el paquete java.util
		//por lo que hay que importarlas
		
		List<String>lista=new ArrayList<String>();
		
		//Ejemplo d euna lista con elementos del tipo entero
		//las listas solo admiten tipos de datos estructurados (objeto)
		List<Integer>numeros=new ArrayList<Integer>();
		
		//Agregar valores a una lista (.add) 
		lista.add("Elias");
		lista.add("jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista 
		System.out.println(lista);

		//Si quiero mostrar un elemento específico en consola utilizo ".get"
		System.out.println(lista.get(3));
		
		// METODO: ".contains()" Devuelve el valor True si el elemento existe en la lista 
		
		System.out.println(lista.contains("Elias"));
		
		//METODO ".indexOf()" Decuelve la posicion en la que encuentra por primera vez 
		//al elemento 
		System.out.println(lista.indexOf("Elias"));
		
		//METODO ".lastindexOf()" - devuelve la posicion en la que se encuentra el elemento
		//la ultima vez
		
		System.out.println(lista.lastIndexOf("Elias"));
		
		//METODO ".remove()" - elimina al elemento mediante la posicion o mediante el objeto
		//pero solo elimina la primera vez que encuentra el objeto
			//(.Objetc o)
		//elimina al elemento mediante la posicion
			//(.int Index)
		lista.remove(3);
		System.out.println(lista);
		//conforme se van eliminando elementos, los valores del indice 
		//se van desplazando, siendo ocupados por los otros elementos 
		lista.remove(3);
		System.out.println(lista);
		
		//Si yo quiero agregar un nuevo elemento en la posicion 3		
		lista.add(3,"Enrique");
		//se dezplaza el valor de la posicion 3 a la 4 y en la 3 queda la que acabamos de 
		//agregar sin eliminar el valor anterior
		System.out.println(lista);
		
		//Reemplazar el valor d euna determinada posicion 
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de manera individual 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));}
		
		//podemos declarar una lista sin parametrizar 
		List elementos =new ArrayList();
		//Esto me va a permitir guardar diferentes tipos de dato en ella
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		System.out.println(elementos);
		
//				// o bien de la siguiete forma
//		List<Object> elementos =new ArrayList<Object>();
//		elementos.add("Alex");
//		elementos.add(1200.59);
//		elementos.add(true);
//		System.out.println(elementos);
		
	}
	

}
