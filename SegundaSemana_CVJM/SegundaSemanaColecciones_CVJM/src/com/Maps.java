package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		/*MAPS: La interfaz Map asocia claves a valores.
		 * Esta interface no puede contener claves duplicadas (key, ID)
		 * pero si valores duplicados 
		 * Cada clave puede tener asociado un valor como maximo
		 * 
		 * Ucuparemos a la clase: HashMap
		 * Esta implementacion almacena las claves en una tabla hash. Es la que mejor
		 * rendimiento tiene en los maps, pero esto no garantiza un orden al momento 
		 * de realizar interaciones
		 * 
		 * Al momento de declarar un HashMap 
		 * El primer valor es el tipo de dato que funcionara como clave o llave 
		 * El segundo valor será el tipo de dato a almacenar en dicha clave 
		 * Ejemplo, vamos a declarar un HashMap para guardar elementos de tipo 
		 * String
		 * Llave | elemento
		 * 1. "Adrian"
		 * 2. "Rafael"
		 * 5. "Miguel"
		 * 3. "Arasandi"
		 * 3. "Lex"<-- La llave no se puede repetir, ya que se reemplazara 
		 *             el valor con el nuevo
		 * 
		 * tipo                                          nos almacenará
		 */

		Map<Integer, String> usuarios = new HashMap <Integer , String>();
		
		//Agregar datos a mi HashMap - .put(clave, valor)
		//.put(Integer key, String value)
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//Imprimir en consola determinado valor contenido en una llave 
		System.out.println(usuarios.get(5));
		
		//Reemplazar valor
		//.put(Integer key, String value)
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		usuarios.replace(5, "El reemplazado");
		System.out.println(usuarios.get(5));
		System.out.println(usuarios);
		
		//Declarar un HashMap con llaves String y guardar elementos double
		Map<String, Double> decimales =new HashMap <String, Double>();
		
		decimales.put("Primero", 99.1);
		decimales.put("Segundo", 98.56);
		
		//Obtener el valor de la llave "Segundo"
		System.out.println(decimales.get("Segundo"));
		
		System.out.println(decimales);
		
		//Para remover un elemento - .remove
		decimales.remove("Primero");
		System.out.println(decimales);
		
		
	}

}
