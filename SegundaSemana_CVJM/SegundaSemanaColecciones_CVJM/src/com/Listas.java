package com;


import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		/*LISTA: Es una coleccion o conjunto de elementos (no primitivos) que admite 
		 * elementos duplicados y se implementa a traves de la clase .ArrayList
		 * Se basa en un array redimensionable, es decir que va aumentando su tamaño 
		 * mientras tenga mas elementos.
		 * Es de las que mejor rendimiento tiene sobre la mayoria de situaciones
		 * 
		 * Puede almacenar un tipo de datos en comun, incluyendo objetos
		 * 
		 * Ejmeplo de como declarar una Lista de elementos String
		 * 
		 * Estas colecciones se encuentran en el paguete java.util por lo que 
		 * hay que importarlas
		 * 
		 */
		
		//Lista de tipo String

		//Praametrizarla <tipo de argumentos de lista> + nombre de la variable
		List<String> lista= new ArrayList<String>();
		
		//Lista de tipo entero
		//Las listas solo admiten tipos de datos estructurados (Objetos) es decir
		//no tipos primitivos
		//List <int> numeros= new ArraysList<int>(); <-- mal
		//Para agregar valores numericos se utiliza INTEGER
		
		List <Integer> numeros=new ArrayList <Integer>();
		
		//Agregar valores a una lista 
		//traemos a nuestra lista . add y agregamos los elementos a la lista 
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Como mandar a imprimir
		//Visualizar el conjunto de elementos de mi lista 
		System.out.println(lista);
		
		//METODOS DE LA LISTA
		
		// .get - Para devolver un elemento especifico 
		System.out.println(lista.get(3));
		
		//.contains() - Devuelve true si el elemento existe en la lista 
		System.out.println(lista.contains("Valeria"));
		System.out.println(lista.contains("Jafet"));
		
		// .indexOf - Devuelve la posicion en la que encuentra por primera vez 
		//al elemento
		System.out.println(lista.indexOf("Elias"));
		
		// .lastIndexOf - Devuelve el indice donde encuentra al elemento final
		//(donde lo encuentra por ultima vez)
		System.out.println(lista.lastIndexOf("Elias"));
		
		// .remove() - Elimina la elemento
		//Por la posicion o el objeto (Objetc o) boolean
		lista.remove("Elias"); //elimina al objeto de la primera posicion [0]
		System.out.println(lista);
		lista.remove(1);//Elimina al objeto que de la posicion especificada [5]
		System.out.println(lista);
		//Conforme vamos eliminando elementos los valores del indice se van
		//desplazando, siendo ocupados por los otros elementos
		
		//Si yo quiero agregar un elemento en la posicion 1
		lista.add(1,"Enrique");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(1, "Valeria");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual
		 for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Podemos declara una lista sin parametrizar o sin "<Object>"
		 List <Object>elementos = new ArrayList<Object>();
		 
		 //Esto me va a permitir guardar diferentes tipos de datos en ella
		 elementos.add("Alex");
		 elementos.add(1200.2);
		 elementos.add(true);
		 
		 System.out.println(elementos);
		 
	}

}
