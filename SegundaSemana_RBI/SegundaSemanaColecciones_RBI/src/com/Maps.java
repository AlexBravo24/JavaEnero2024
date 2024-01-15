package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// La interfaz Map asocia claves a valores 
		//Esta interface no puede contener claves duplicadas 
		// Pero si valores duplicados
		// cada clave puede tener asociado un valor como maximo 
		
		//HashMap: esta implementacion almacena las claves en una tabla hash.
		//Es la que mejor rendimiento tiene en los maps, pero esto no garantiza un orden al momento de realizar iteraciones. 
		
		//Declarando un HashMap
		//El primer valor es el tipo de dato que funcionara como clave o llave (Key)
		//El segundo valor sera el tipo de dato a almacenar en dicha clave
		//Ejemplo, vamos a declarar un HashMap para guardar elementos de tipo String
		//1, "Adrian"
		//2, "Rafael"
		//3, "Migue"
		//las llaves no pueden repetirse
		
		Map<Integer, String> usuarios = new HashMap<Integer,String>();
		
		//Agregar datos a mi HashMap - .put(clave, valor)
		usuarios.put(1,"Marcos");
		usuarios.put(2,"Enrique");
		usuarios.put(3,"Rafael");
		usuarios.put(4,"Elias");
		usuarios.put(5,"Alexis");
		
		//imprimir en consola determinado valor contenido en la llave
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		//Declarar un HashMap con llaves String y  guardar elementos double
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 122.23);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		//Para remover un elemento - .remove
		
		decimales.remove("B");

	}

}
