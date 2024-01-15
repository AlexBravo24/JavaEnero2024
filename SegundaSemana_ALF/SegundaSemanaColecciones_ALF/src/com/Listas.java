package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//Una lista es una coleccion  o conjunto de elementos
		//que admite elementos duplicados
		//Se implementa atra ves de la clase ArrayList
		//se basa en una array redimensionable
		//Es de las que mejor rendimiento tiene
		//sobre la mayoria de las situaciones
		//Puede almacenar tipos de datos comun
		//incluyendo objetos
		
		//EJEMPLO DE COMO DECLARAR UNA LSTA DE ELEMENTO STRING
		//Estas colecciones se encuentrar en el paquete Java.Util
		//tenemos qu eimportarlas
		
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elemento de tipo entero
		//Las listas solo admiten tipos de datos estruturados (Objeto).
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		
		lista.add("Alfredo");
		lista.add("Alfredo");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Alfredo");
		
		//VIsualizar el conjunto de elementos
		System.out.println(lista);
		//mostrar un elemento especifico en consola
		System.out.println(lista.get(3));
		
		//.contains() - devuelve true si el objeto existe en la lista
		
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Alfredo"));
		
		//.indexOf - devuelve la posicion en la que encuentra por primera vez el elemento
		
		System.out.println(lista.indexOf("Alfredo"));
		
		//.lastIndexOf- Devuelve el indice donde encuentra el elemento la ultima vez
		
		System.out.println(lista.lastIndexOf("Alfredo"));
		
		//.remove() - elimina al elmento mediante la posicion o mediante el objeto
		//pero lo elimina en cuanto lo encunetre por primera vez
		
		lista.remove("Alfredo");
		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		//Conforme se eliminenen elementos se desplazan y cambian de posicion 
		//A auna anterior de la que estaban
		 //Para agregar un nuevo elemento en la posicion 3 
		//Igual si se agregan mas elemento se mueven asi adelante
		
		lista.add(1,"Azucena");
		System.out.println(lista);
		
		//Para reemplazar el valor de determinada posicion
		
		lista.set(3, "Polett");
		System.out.println(lista);
		//Mostrar los valores de manera individual
		
		for(int i= 0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Podemos declarar una lista sin parametrizar
		
		List<Object> elementos = new ArrayList<Object>();
		
		//Esto me va a permitir guardar elementos de diferentes tipos
		
		elementos.add("Alfred");
		elementos.add(1200.56);
		elementos.add(true);
		elementos.add(12);
		
		System.out.println(elementos);
		
		

	}

}
