package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		// La interfaz Map asocia claves a valores
		// Esta interface no puede contener claves duplicadas
		// Pero si valores duplicados
		// Cada clave puede tener asociado un valor como maximo

		// HashMap: Esta implementacion almacena las claves en una tabla
		// llamada has. Es la que tiene mejor rendimiento pero esto no
		// garantiza un orden al momento de realizar iteraciones

		// Declarando un HashMap
		// EL primer valor es el tipo de datos que funcionara como llave(key)
		// EL segundo valor es el tipo de datos a almacenar en dicha key
		// Ejemplo: declarar HashMap para almacenar String
		// 1, "Edwin"
		// 3, "Tito"
		// 2, "Alazan"
		// 3, "Juan" - Las llaves no pueden repetirse!

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap - .put(Key,Value);
		usuarios.put(1,"Edwin");
		usuarios.put(3,"Tito");
		usuarios.put(2,"Alazan");
		usuarios.put(8,"Juan");
		System.out.println(usuarios);
		
		// Imprimir en consola determinado valor en una llave;
		System.out.println(usuarios.get(8));
		
		// Declarar un HashMao con llaves String y guardar elementos double
		Map<String,Double> decimales = new HashMap <String, Double>();
		
		decimales.put("Pi", 3.1416);
		decimales.put("Universe", 42.0);
		
		System.out.println(decimales);
		System.out.println(decimales.get("Pi"));
		
		//Para remover un elemento
		
		decimales.remove("Universe");
		System.out.println(decimales);

	}

}
