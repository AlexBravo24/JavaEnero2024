package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		// M�todos o funcionalidades de la clase String
		
		// Declarar una cadena de texto 
		// que nos sirva como ejemplo
		
		String cadena = "Hoy es 4 de Enero de 2024";
		
		// .length() - Devuelve el valor del tama�o de nuestra
		// cadena de texto en un valor num�rico entero
		
		System.out.println("Probando el m�todo .length()");
		System.out.println(cadena.length());
		
		// .charAt() - Nos devuelve el caracter de acuerdo a la
		// posici�n en la que se encuentre dicho caracter
		
		System.out.println("Probando el m�todo charAt()");
		System.out.println(cadena.charAt(2)); 
		
		// Aunque la longitud de la cadena es de 25 caracteres
		// (incluyendo espacios), se empieza a contar la primera
		// posici�n desde 0. Esto tiene que ver con los ARRAYS.
		
		// [H][O][Y][ ][E][S]
		//  0  1  2  3  4  5
		
		// Si quisi�ramos imprimir el �ltimo caracter de la cadena,
		// pero no conoci�ramos la longitud de la misma:
		
		System.out.println("Imprimiendo el �ltimo caracter de la cadena:");
		System.out.println(cadena.charAt(cadena.length()-1)); //Longitud menos 1
		
		// .substring() - Devuelve una subcadena a partir del
		// �ndice especificado
		
		System.out.println("Probando el m�todo .substring");
		System.out.println(cadena.substring(4)); // Imprime a partir del
		// espacio 4 (omite la palabra "Hoy" en la frase)
		
		System.out.println(cadena.substring(4,20)); // Para indicar en
		// qu� caracter inicia a imprimir, y en cu�l termnina
		
		// .toLowerCase() - Convierte la cadena a min�sculas
		// .toUpperCase() - Convierte la cadena a may�sculas
		
		System.out.println("Probando el m�todo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el m�todo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		// .equals() - Compara el valor de un objeto contra otro
		// Comparar el valor de un String contra otro
		
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("hoy es 4 de enero de 2024"));
		// Me saldr� "false" ya que la H de Hoy y la E de Enero
		// eran may�sculas en la frase original, y aqu� las 
		// escrib� como min�sculas
		
		
		// .equalsIgnoreCase() - Compara el valor de un String contra otro
		// e ignora el uso de may�sculas y min�sculas
				
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoY eS 4 de eNerO DE 2024"));
		
		
		System.out.println(cadena.contentEquals("2024")); //Este m�todo es
		// para el tema "Colecciones de datos", ya que podemos buscar un
		// nombre dentro de un listado de varios String
		
		// equals compara contra otro objeto
		// contentEqueals compara la cadena de caracteres (funciona m�s
		// a nivel String, en cambio equals no solo sirve para eso, sino
		// para comparar objetos)
		// Funcionan casi igual
		
		
		// .replace() - Nos permite reemplazar las apariciones de un
		// caracter con otro que indiquemos
		System.out.println("Probando el m�todo .replace");
		System.out.println(cadena.replace("e", "$")); //Reemplazar�
		// todas las letras "e" min�sculas de la frase por el s�mbolo "$". 
		// La "E" may�scula no se ve afectada.
		
		System.out.println(cadena.replace(" ", "%")); // Los espacios
		// tambi�n son caracteres. Aqu� reemplazar� cada espacio por
		// un s�mbolo de "%"
		
		System.out.println(cadena.replace(" ", "")); //En este ejemplo,
		// cada vez que encuentre un espacio, lo eliminar�. O mejor dicho,
		// reemplazar� un espacio por un "no espacio".
		
		

	}

}
