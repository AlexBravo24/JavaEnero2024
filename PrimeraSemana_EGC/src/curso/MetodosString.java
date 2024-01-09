package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase
		// String 
		
		// Declarar una cadena de texto 
		// que nos sirva como ejemplo
		
		String cadena = "Hoy es 04 de Enero del 2024";
		System.out.println(cadena.length());// numero de caracteres
		System.out.println(cadena.charAt(cadena.length()-1)); // retorna el caracter de la posicion que elija
		System.out.println(cadena.substring(4)); // retorna la cadena a patir de la posición que eleija
		System.out.println(cadena.substring(4,18)); // retorna la cadena de la posición que eleija y hasta la posicion que elija
		System.out.println(cadena.toLowerCase()); //retorna cadena en minuscula
		System.out.println(cadena.toUpperCase()); //retorna cadena en mayuscula
		System.out.println(cadena.equals("Hoy es 04 de Enero del 2025")); //compara si las cadenas son iguales y retorna boolean
		System.out.println(cadena.equalsIgnoreCase("HOY es 04 de ENERO del 2024"));//compara sin importar si es UpperCase o LowerCase
		System.out.println(cadena.replace('e', '3')); //reemplaza un char por otro
	}

}
