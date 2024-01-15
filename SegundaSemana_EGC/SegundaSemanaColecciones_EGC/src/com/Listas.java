package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto
		// de elementos que admite elementos duplicados
		// Se implementa a traves de la clase
		// ArrayList y se basa en un array redimensionable
		// Es de las que mejor rendimiento tiene sobre la
		// mayoria de situaciones.

		// Puede almacenar un tipo de datos en comun
		// incluyendo objetos.

		// Ejemplo de como declarar una Lista de
		// elementos String
		// Estas colecciones se encuentran en el paquete
		// java.util, por lo que hay que importarlas

		List<String> lista = new ArrayList<String>();

		// Ejemplo de lista con elementos de tipo entero
		// Las listas solo admiten tipos de datos estructurados(Objeto) es decir no
		// primitivos
		List<Integer> numeros = new ArrayList<Integer>();

		// Agregar valores a una lista

		lista.add("Edwin");
		lista.add("Jafet");
		lista.add("Andy");
		lista.add("Rafael");
		lista.add("Tito");
		lista.add("Jafet");

		System.out.println(lista.get(0));
		System.out.println(lista.get(0).equalsIgnoreCase("edwin"));// responde true si corresponde el String
		// sin importar si es Upper o Lower Case

		// .contains() - devuelve true si el elemento existe en la lista

		System.out.println(lista.contains("Jafet"));

		// . indexOF - devuelve la posición en que encuentra por primera vez al elemento

		System.out.println(lista.indexOf("Jafet"));

		// .LastIndexOf - devuelve el indice donde encuentra al elemen la ultima vez

		System.out.println(lista.lastIndexOf("Jafet"));

		// .remove - elimina al elemento mediante la posición
		lista.remove(5); // elimina al elemnto por posicion
		lista.remove("Jafet"); // elimina al elemento mediante el objeto en si
		System.out.println(lista);
		// pero lo elimina solo la primera vez que lo encuentra

		// si yo quiero agregar un nuevo elemento en la posicion 5
		// el elemento que ocupa esa posicion va a ser desplazado
		// mas no eliminado o reemplazado
		lista.add(3, "Obi Juan");
		System.out.println(lista);

		// Reemplazar el valor de una determinadas posicion.
		lista.set(3, "Ana kin");
		System.out.println(lista.size());

		// mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Podemos declarar una lista sin parametrizar
		// List elementos = new ArrayList(); se puede declarar así o
		List<Object> elementos = new ArrayList<Object>(); // De esta forma tambien funciona

		elementos.add(0, "TEST");
		elementos.add(1, 12.00);
		elementos.add(2, true);
		elementos.add(150);

		System.out.println(elementos);

	}

}
