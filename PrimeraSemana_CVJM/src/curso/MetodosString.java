package curso;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		// Declarar una cadena de texto que nos sirva 
		// como ejemplo 
		
		String cadena = ("Hoy es 4 de Enero de 2024");
		
		// .length()
		// .length() - devuelve el valor del tamaño de nuestra 
		//cadena de texto en un valor numerico entero contando 
		// los caracteres y espacios
		
		System.out.println("Probando en metodo . length: ");
		System.out.println(cadena.length());
		
		//.charAt()
		//.charAt()- Nos devuelve el caracter de acuerdo a la 
		// posicion a la que se encuentre dicho caracter
		// En los [] va el caracter que quiero que salga 
		// Contando desde el 0,1,2,3...
		
		System.out.println("Probando el metodo .charAt");
		System.out.println(cadena.charAt(10));
		
		//Si no sabemos la longitud y quiero saber el ultimo
		//caracter 
		System.out.println("Probando el metodo .charAt sin saber long");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring
		//Devuelve una subcadena a partir del indice especificado
		//Presenta en consola el texto a partir del numero de posicion
		//que indicas en substring 
		
		//.substring(int beginIndex)
		System.out.println("Probando el método .substring(int beginIndex): ");
		System.out.println(cadena.substring(9));
		
		//.substring(int beginlndex, int endlndex)
		//Muestra el texto a partir de la posicion indicada y hasta 
		//donde se indique que finalice 
		System.out.println("Probando el método .substring(beginIndex, endIndex): ");
		System.out.println(cadena.substring(9, 20));
		
		//.toLowerCase() / .toUpperCase()
		//Convierte la cadena en minusculas / en mayusculas
		
		//.toLowerCase() 
		System.out.println("Probando en metodo .toLowerCase(): ");
		System.out.println(cadena.toLowerCase());
		
		//.toUpperCase()
		System.out.println("Probando en metodo .toUpperCase(): ");
		System.out.println(cadena.toUpperCase());
		
		//.equials()
		//Compara el valor de un objeto o string contra otro
		//Comparar el vaor de un String contra otro
		
		//.equials(ObjectanObject):boolean-String
		System.out.println("Probando en metodo .equials(ObjectanObject): ");
		//Quiero que me diga el metodo equials si lo que voy a 
		//escribir "" es igual a cadena
		System.out.println(cadena.equals("Hoy és 4 de Enero de 2024"));
		//Contando mayusculas, puntuacion etc.
		
		//equalsIgnoreCase(anotherString)
		//Conpara un String contra otro ignorando mayusculas y minusculas
		System.out.println("Probando en metodo .equalsIgnoreCase(anotherString): ");
		System.out.println(cadena.equalsIgnoreCase("HoY de 4 De EnEro dE 2024"));
		
		//.contentEquals(cs)
		//Funciona igual que el equals normal
		System.out.println("Probando en metodo .contentEquals(cs): ");
		System.out.println(cadena.contentEquals("Hoy es 4 de Enero de 2024"));
		
		//.replace()
		//Nos permite reemplazar las apariciones de un texto o 
		//caracter con otro que indiquemos 
		
		//.replace(oldChar, newChar)
		System.out.println("Probando en metodo .replace(oldChar, newChar): ");
		System.out.println(cadena.replace("2024", "1999"));
		
	
	
	
	
	
	
	
	
	}

}
