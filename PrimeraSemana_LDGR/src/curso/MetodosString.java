package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		// Declarar una cadena de texto 
		// que nos sirva como ejemplo
		
		String cadena = "Hoy es 4 de Enero de 2024";
		
		// .length() - Devuelve el valor del tamaño de nuestra
		// cadena de texto en un valor numérico entero
		
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		// .charAt() - Nos devuelve el caracter de acuerdo a la
		// posición en la que se encuentre dicho caracter
		
		System.out.println("Probando el método charAt()");
		System.out.println(cadena.charAt(2)); 
		
		// Aunque la longitud de la cadena es de 25 caracteres
		// (incluyendo espacios), se empieza a contar la primera
		// posición desde 0. Esto tiene que ver con los ARRAYS.
		
		// [H][O][Y][ ][E][S]
		//  0  1  2  3  4  5
		
		// Si quisiéramos imprimir el último caracter de la cadena,
		// pero no conociéramos la longitud de la misma:
		
		System.out.println("Imprimiendo el último caracter de la cadena:");
		System.out.println(cadena.charAt(cadena.length()-1)); //Longitud menos 1
		
		// .substring() - Devuelve una subcadena a partir del
		// índice especificado
		
		System.out.println("Probando el método .substring");
		System.out.println(cadena.substring(4)); // Imprime a partir del
		// espacio 4 (omite la palabra "Hoy" en la frase)
		
		System.out.println(cadena.substring(4,20)); // Para indicar en
		// qué caracter inicia a imprimir, y en cuál termnina
		
		// .toLowerCase() - Convierte la cadena a minúsculas
		// .toUpperCase() - Convierte la cadena a mayúsculas
		
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		// .equals() - Compara el valor de un objeto contra otro
		// Comparar el valor de un String contra otro
		
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("hoy es 4 de enero de 2024"));
		// Me saldrá "false" ya que la H de Hoy y la E de Enero
		// eran mayúsculas en la frase original, y aquí las 
		// escribí como minúsculas
		
		
		// .equalsIgnoreCase() - Compara el valor de un String contra otro
		// e ignora el uso de mayúsculas y minúsculas
				
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoY eS 4 de eNerO DE 2024"));
		
		
		System.out.println(cadena.contentEquals("2024")); //Este método es
		// para el tema "Colecciones de datos", ya que podemos buscar un
		// nombre dentro de un listado de varios String
		
		// equals compara contra otro objeto
		// contentEqueals compara la cadena de caracteres (funciona más
		// a nivel String, en cambio equals no solo sirve para eso, sino
		// para comparar objetos)
		// Funcionan casi igual
		
		
		// .replace() - Nos permite reemplazar las apariciones de un
		// caracter con otro que indiquemos
		System.out.println("Probando el método .replace");
		System.out.println(cadena.replace("e", "$")); //Reemplazará
		// todas las letras "e" minúsculas de la frase por el símbolo "$". 
		// La "E" mayúscula no se ve afectada.
		
		System.out.println(cadena.replace(" ", "%")); // Los espacios
		// también son caracteres. Aquí reemplazará cada espacio por
		// un símbolo de "%"
		
		System.out.println(cadena.replace(" ", "")); //En este ejemplo,
		// cada vez que encuentre un espacio, lo eliminará. O mejor dicho,
		// reemplazará un espacio por un "no espacio".
		
		

	}

}
