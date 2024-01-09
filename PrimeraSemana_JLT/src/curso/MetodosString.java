package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase
		// String
		
		// Declarar una cadena de texto
		//que nos sirva como ejemplo
		
		String cadena = "Hoy es 4 de Enero de 2024";
		
		//.length() - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor numerico entero
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		//.charAt () - Nos devuelve el caracter de acuerdo 
		//a la posicion en la que se encuentre dicho caracter
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(2));
		//System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el método .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,15));
		
		//.tilowerCase()/ .toUpperCase () -
		//Convierte la cadena a minusculas/ a mayusculas
		
		System.out.println("Probando el método .toLowercase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals () - Compara el valor de un objeto contra otro
		//valor de un String contra otro
		
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("hoy es 4 de enero de 2024"));
		System.out.println(cadena.equals("Hoy es 4 de Enero de 2024"));
		System.out.println(cadena.contentEquals("2023"));
		
		//.equalsIgnoreCase () - Compara el valor de un String contra otro
		//ignora el uso de mayusculas y minusculas
				
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hOy eS 4 de enEro dE 2024"));
		System.out.println(cadena.equalsIgnoreCase("Hoy es 4 de Enero de 2023"));
		
		//.replace() - Nos permite reemplazar las apariciones de un caracter
		//con otro que indiquemos
		
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace(" ","%"));
	}

}
