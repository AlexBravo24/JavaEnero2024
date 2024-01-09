package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		//M�todos o funcionalidades de la clase String
		
		
		//Declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena = "Hoy es 04 de Enero de 2024";
		
		//.lenght() - Devuelve el valor del tama�o de nuestra cadena de texto en un valor num�rico entero.
		System.out.println("Probando el m�todo .lenght()");
		System.out.println(cadena.length());
		
		
		//.charAt() - Devuelve el caracter de acuerdo a la posici�n en la que se cneuntre.
		System.out.println("Probando el m�todo .charAt");
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		//.substring() - Devuelve una subcadena a partir del �ndice especificado
		System.out.println("Probando el m�todo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		
		//.toLoweCase() y -toUpperCase
		//Convierte la cadena a min�sculas y may�sculas respectivamente
		System.out.println("Probando el m�todo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el m�todo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - Compara el valor de un objeto contra otro
		//Compara el valor de un String contra otro
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.contentEquals("hoy es 04 de enero de 2024"));
		
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//Ignora el uso de may�sculas y min�sculas
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 04 de enero de 2024"));
		
		//.replace() - Reemplaza las apariciones de un caracter con otro que indiquemos
		System.out.println("Probando el m�todo .replace()");
		System.out.println(cadena.replace(" ", "-"));

	}

}
