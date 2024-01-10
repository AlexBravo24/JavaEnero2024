package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		//Métodos o funcionalidades de la clase String
		
		
		//Declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena = "Hoy es 04 de Enero de 2024";
		
		//.lenght() - Devuelve el valor del tamaño de nuestra cadena de texto en un valor numérico entero.
		System.out.println("Probando el método .lenght()");
		System.out.println(cadena.length());
		
		
		//.charAt() - Devuelve el caracter de acuerdo a la posición en la que se cneuntre.
		System.out.println("Probando el método .charAt");
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		//.substring() - Devuelve una subcadena a partir del índice especificado
		System.out.println("Probando el método .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		
		//.toLoweCase() y -toUpperCase
		//Convierte la cadena a minúsculas y mayúsculas respectivamente
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - Compara el valor de un objeto contra otro
		//Compara el valor de un String contra otro
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.contentEquals("hoy es 04 de enero de 2024"));
		
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//Ignora el uso de mayúsculas y minúsculas
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 04 de enero de 2024"));
		
		//.replace() - Reemplaza las apariciones de un caracter con otro que indiquemos
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace(" ", "-"));

	}

}
