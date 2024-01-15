package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// La interfaz "MAP" asocia claves a valores
		//esta interface no puede contener claves duplicadas
		//pero si valores duplicados
		//cada clave puede tener asociado un valor como maximo 
		
		//HashMap: esta implementacion almacena las claves en una tabla 
		//hash. es la que mejor rendimiento tiene en los maps, pero 
		//esto no garantiza un orden al momento de realizar interaciones.
		
		//Declarando un HashMap
		//El primer valor es el tipo de dato que funcionará como 
		//Clave o llave (key)
		//El segundo valor será el tipo de dato a almacenar en dicha clave 
		//ejemplo: vamos a declarar un HashMap para guardar 
		//elementos del tipo String
		//1."Adrian"
		//2."Rafael"
		//5."Miguel"
		//3."Arasandi"
		//3."Alexis"-las llaves no pueden repetirse**
		
		Map<Integer,String> usuarios=new HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap - .put(clave o key, valor)
		
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//Imprimir en consola, determinado valor contenido en una llave 
		
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Arasandi");
		
		System.out.println(usuarios.get(5));
		
		//Declarar un HashMap con llaves String y guardar elementos double
		
		Map<String, Double> decimales=new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		//PARA RMEOVER UN ELEMENTO (.remove)
		
		decimales.remove("B");
		
		System.out.println(decimales);

	}

}
