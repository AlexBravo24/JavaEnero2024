package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//Una lista es una colección o conjunto de elementos que admite elementos duplicados
		//Se implementa a través de la clase ArrayList
		//Se basa en un array redimensionable
		//Es de las que mejor rendimiento tiene sobre la mayoría de situaciones
		
		//Puede almacenar un tipo de datos en común, incluyendo objetos
		
		//Ejemplo de como declarar una lista de elementos String
		//Estas colecciones se encuentran en el paquete java.util, por lo que se deben importar
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Solo admiten tipos de datos estructurados (Objeto), no primitivos (int)
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Sandy");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//Si quiero mostrar un elemento específico en consola
		System.out.println(lista.get(3));
		
		//.contains - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Rafael"));
		
		//.indexOf - Devuelve la posición en la que encuentra por primera vez al elemento
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf - Devuelve el indice donde encuentra al elemento por última vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - elimina al elemento mediante la posición
		//o mediante el objeto, pero lo elimina solo la pimera vez que lo encuentra
		lista.remove(3);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		
		//Conforme vamos eliminando elementos, los valores del índice se van desplazando,
		//siendo ocupados por los otros elementos
		
		//Si yo quiero agregar un nuevo elemento en la posición 3
		//El elemento que ocupa esa posición va a ser desplazado a la siguiente, más no
		//eliminado o reemplazado.
		lista.add(3, "Enrique");
		System.out.println(lista);
		
		//.set - Reemplazar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Podemos declarar una lista sin parametrizar
		List<Object> elementos = new ArrayList<Object>(); //Es lo mismo que:
		//List elementos = new ArrayList();

		//Esto me va a permitir guardar diferentes tipos de datos en ella
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);


	}

}
