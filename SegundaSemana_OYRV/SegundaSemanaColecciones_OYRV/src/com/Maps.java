package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		//la interfaz map asocia claves a valores, esta interface no puede contener claves duplicadas(ID), pero si valores duplicados
		//cada clave puede tener asociado un valor como maximo 
		
	    //HASHMAP: esta implementacion almacena las claves en una tabla 
		//HASH: es la que mejor rendimiento tiene en los maps, pero esto no garantiza un orden al momento de realizar iteraciones 
		
		//declando un hashmap, el primer valor es el tipo de datoque funcionaria como clave o llave (key)
		//el segundo valor sera el tipo de dato a almacenar en dicha clave 
		//ejemplo: vamos a declarar un hashmap para guardar elementos de tipo String
		//1, "Adrian"
		//2, "Rafael"
		//5, "Miguel"
		//3, "Arasandi"
		//3, "Alexis" -las llaves no pueden repetirse
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//AGREGAR datos a mi Hashmap - .put(clave, valor)
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//imprimir en consola un determinado valor contenido en la llave 
		
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "ARASANDI");
		
		System.out.println(usuarios.get(5));
		
		//declarar un HASMAP con llaves String o guardar elementos double
		
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("a", 1200.59);
		decimales.put("b", 200.59);
		
		System.out.println(decimales.get("b"));
		
		//para remover un elemento- .remove
		decimales.remove("b");
	}

}
