package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		//La interfaz Map asoia claves a valores.
		//Esta interface no puede contener claves duplicadas, pero si valores duplicados (ID)
		//Cada clave puede tener asociado un valor como máximo.
		
		//HashMap: esta implementación almacena las claves en una table hash. Es la que mejor
		//rendimiento tiene en los maps, pero esto no garantiza un orden al momento de realizar
		//iteraciones
		
		//Declarando un HashMap
		//El primer valor es el tipo de ddato que funcionara como clave o llave (key)
		//El segundo valor será el tipo de dato a almacenar en dicha clave
		
		//Ejemplo, vamos a declarar un HashMap para guardar elementos de tipo String
		//1, "Adrian"
		//2, "Rafael"
		//5, "Miguel"
		//3, "Sandy"
		//3, "Alexis" - Las llaves no pueden repetirse
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap - .put(clave, valor)
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elías");
		usuarios.put(5, "Alexis");
		
		//Imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(5));
		
		//Reemplaza
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		//Podemos declarar un HasMap con llaves String y guardar elementos Double
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales);
		System.out.println(decimales.get("B"));
		
		//Para remover un elemento - .remove
		decimales.remove("A");
		System.out.println(decimales);


	}

}
