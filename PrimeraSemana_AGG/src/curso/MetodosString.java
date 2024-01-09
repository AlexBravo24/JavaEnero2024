package curso;

public class MetodosString {

	public static void main(String[] args) {
		// METODOS O FUNCIONALIDADES DE LA CLASE <<STRING>>
		//Declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena ="Hoy es 05 Enero 2024";
		
		//1.-  .length() - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor numérico entero (te cuenta, cuantas letras y espacios tiene tu frase)
		//por ejemplo: "hoy es 05 enero 2024" tiene 20 caracteres entre letras y espacios
		System.out.println("Probando el metodo .length()");
		System.out.println(cadena.length());		
		
		//2.- .charAt() - nos devuelve el caracter de acuerdo a la posicion 
		//en la que se encuentre nuestro caracter dentro de la cadena de texto
		
		System.out.println("Probando el metodo .charAt()");
		System.out.println(cadena.charAt(2)); //buscamos el caracter #2 porque sabemos que tiene de 
											// longitud mi texto 20.
		//cuando no sabemos que longitud tiene el texto lo podemos hacer combinando 
		//metodo .length() dentro del .charAt() por ejemplo:
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//3.- .substring - devuelve una subcadena a partir del 
		//indice especificado o sea, imprime la cadena de texto a partir del caracter que le indicas
		
		System.out.println("Probando el metodo .substring()");
		
		System.out.println(cadena.substring(4)); //te imprime desde el caracter 4 hasta el ultimo
		System.out.println(cadena.substring(4,16)); //te imprime desde el caracter 4 hasta el 16
		
		//4.- .toLowerCase() - convierte la cadena de texto a minusculas
		
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		//5.- .toUpperCase() - convierte la cadena de texto a mayusculas
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//6.- .equals() - compara el valor de un objeto contra otro 
		// o sea compara el valor de un String vs otro String, por ejemplo:
		
		System.out.println("Probando el metodo .equals");
		System.out.println(cadena.equals(cadena)); //me arroja un valor "true" pues la variable "cadena"
													//que quiero que compare es exactamente igual a lo 				
													//que esta escrito en la variable "cadena".
		System.out.println(cadena.equals("hoy es 05 de enero 2024")); //me arroja un valor "false"
									//pues lo que esta escrito en los parentesis a comparar con la variable
									//"cadena" no son del todo igual, ya que esta condicion compara 
									// hasta las mayusculas y minusculas
		
		//7.- .equalsIgnoreCase() - compara el valor de un string contra otro pero ignora
		//el uso de mayusculas y minusculas
		
		System.out.println("Probando el metodo .equalsIgnoreCase");		
		System.out.println(cadena.equalsIgnoreCase("hoy es 05 ENERO 2024")); //arroja un valor "true"
											//pues el texto dentro de la cadena dice exactamente lo mismo
											//sin importar si esta en mayusculas o minusculas
		
		//8.- .replace() - nos permite reemplazar las apariciones de un caracter 
		//en especìfico dentro de nuestra cadena de texto, por otro que nosotros especifiquemos
		
		System.out.println("probando el metodo .replace");
		System.out.println(cadena.replace("o", "$")); //si te distingue mayusculas de minusculas
									//en este ejemplo se reemplazò la "o" por "$".
		//tambien permite eliminar los espacios entre palabras dentro de la cadena de texto
		// dentro de: cadena.replace(" ", "") solo quitamos el espacio en las segundas comillas
		
	}

}
