package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		/*
		 * Las interfaces Map asocia claves a valores
		 * Esta interfaz no puede contener claves duplicadas (ID)
		 * Pero si valore duplicado
		 * Cada clave puede tener asociado un valor como maximo
		 * 
		 * HahMap: esta implementacion almacena las claves en una tablas
		 * hash. es la que mejor rendimiento tiene en los maps, pero
		 * no garantiza un orden al momento de realizar iteraciones
		 * 
		 * Declarando un HashMap
		 * El primer valor es el tipo de dato que funcionara 
		 * como clave o llave (key)
		 * el segundo valor sera el tipo de dato a almacenar en dicha clave
		 * Ejemplo: vamos a declarar un HashMap para guardar
		 * elemneto de tipo string
		 * 1,"Adrian"
		 * 2,"Alfred"
		 * 5,"Azucena"
		 * 3,"Polet" - LAS LLAVES NO PUEDEN REPETIRSE
		 * */
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregar datos a mi hashMap - .put(clave, valor);
		
		usuarios.put(1, "Alfredo");
		usuarios.put(2, "Marcos");
		usuarios.put(3, "Azula");
		usuarios.put(4, "Polett");
		usuarios.put(5, "Charlie");
		
		//Imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(3));
		
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		//Declarar un hashMap con llaves string y guardar elemento de tipo double
		
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		System.out.println(decimales.get("B"));
		
		//Para remover un elemento - .remove
		
		decimales.remove("B");
		

	}

}
