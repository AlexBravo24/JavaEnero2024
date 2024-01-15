package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		// Una lista es una colección o conjunto de elementos
		// que admite elementos duplicados.
		// Se implementa a través de la clase ArrayList
		// Se basa en un Array redimensionable
		// Es de las que mejor rendimiento tiene
		// sobre la mayoría de situaciones
		
		// Puede almacenar un tipo de datos en común, 
		// incluyendo Objetos
		
		// Estas colecciones se encuentran en el paquete java.util
		// por lo que hay que importarlas
		
		// Ejemplo de cómo declarar una Lista de elementos String
		
		List<String> lista = new ArrayList<String>();
		
		// Ejemplo de una lista con elementos de tipo entero
		
		// Las listas solo admiten tipos de datos
		// estructurados (Objeto). Las variables de tipo primitivo
		// como "int" no son aceptadas, por eso en su lugar se
		// utilizó "Integer".
		List<Integer> numeros = new ArrayList<Integer>(); 
		
		// Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		// Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		// Si quiero mostrar un elemento específico en consola
		System.out.println(lista.get(3));
		
		// .contains() - Devuelve "true" si el elemento 
		// existe en la lista
		System.out.println(lista.contains("Alex")); // Dará false
		System.out.println(lista.contains("Rafael")); // Dará true
		
		// .indexOf - Devuelve la posición en la que encuentra
		// por primera vez al elemento
		System.out.println(lista.indexOf("Elias"));
		
		// .lastIndexOf - Devuelve el índice donde encuentra
		// al elemento la última vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		// .remove() - Elimina al elemento mediante la posición
		// o mediante el Objeto, pero lo elimina solo la primera
		// vez que lo encuentra
		
		lista.remove("Elias");
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista); //Conforme vayamos eliminando,
		// los datos se van desplazando, por ejemplo, al eliminar 
		// a Elias, que ocupaba la primera posición (0), ahora Jafet
		// ocupa esa posición (cuando antes estaba en el índice 1)
		
		// Si yo quiero agregar un nuevo elemento en la posición 3,
		// el elemento que ocupa esa posición va a ser desplazado
		// a la siguiente, mas no eliminado o reemplazado
		lista.add(3, "Enrique");
		System.out.println(lista);
		
		// Reemplazar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		// Mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		// Podemos declarar una lista sin parametrizar
		List elementos = new ArrayList();
		// Sería lo mismo que poner: 
		// List<Object> elementos = new ArrayList<Object>();
		
		// Esto me va a permitir guardar diferentes tipos de
		// dato en ella
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		
		

	}

}
