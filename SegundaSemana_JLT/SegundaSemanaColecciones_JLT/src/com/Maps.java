package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// La interface Map asocia clavez a valores
		//Esta interface no puede contener claves duplicadas
		//Pero si valores duplicados
		//Cada clave puede tener asociado un valor como maximo
		
		//Hasmap: esta implementacion almacena las clavez en una tabla
		//has. Es la que mejor rendimiento tiene en los maps, pero
		//esto no garantiza un orden al momento de realizar iteraciones
		
		//Declarando un Hasmap
		//El primer dato el es tipo que funcionara como 
		//clave o llave (key)
		//El segundo valor sera el tipo de dato a almacenar en dicha clave
		//Ejemplo, vamos a declarar un Hasmap para guardar
		//elementos de tipo String
		//1, "Adrian"
		//2, "Rafael"
		//5, "Miguel"
		//3, "Arasandi"
		//3, "Alexis" -  Las llaves no pueden repetirse
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap
		
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//Imprimir en consola determinado valor contenido en una lleve
		System.out.println(usuarios.get(5));
	
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		//Decalarar un HashMap con llaves String y guardad elementos Double
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		//Para remover un elemento - .remove
		decimales.remove("B");
		
	}

}
