package curso;  //nombre del paquete

public class TiposDeDatos {  //nombre de la clase y apertura

	public static void main(String[] args) { //apertura del main
		//El método principal es el punto de entrada y ejecución
		//de un programa
		
		//main + CTRL + espacio + enter
		
		
		// Comentarios de una sola línea con
		// dos diagonales
		
		/*Comentarios
		 * de
		 * múltiples líneas
		 */
		
		//CTRL+S guarda cambios en el código
		
		//Declaración de tipos de datos
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Declarar variables de los tipos de datos pero sin un valor asignado
		//Aunque las variables puedan contener tipos de datos distintios, no puede repetirse el nombre de las mismas
		byte numero1;    //tipo de dato en naranja; variable en amarillo
		short numero2;
		int numero3;
		long numero4;
		
		//Después puedo asignarles un valor si lo necesito
		numero1=127;
		
		
		//Declarar variables con tipo de dato y valor asignado desde un inicio
		byte numero5 = -128;        //1 BYTE
		short numero6 = 32767;      //2 BYTES
		int numero7 = 2147483647;   //4 BYTES
		long numero8 = 2147483648L; //8 BYTES
		//En long para almacenar rangos más allá de los aceptados del tipo int, se agrega el sufijo "L"
		
		//El tipo de variable más utilizada es int para almacenar números enteros
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 */
		
		float numero9 = 3.1416F;  //Los tipos de dato float necesitan el sufijo "F" para contener el valor //4 BYTES
		double numero10 = 3.1416812513; //8 BYTES
		
		//El tipo de variable "comodín" o más utilizada en java para contener num decimales es double.
		
		
		/*TIPOS DE DATOS PRIMIRIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true;  //Facilitan el trabajo al evaluar condiciones o expresiones. True or false
		char caracter = 'o';  //Un caracter a la vez y se asigna escribiéndolo dentro de comillas simple ''
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO / TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO WRAPPER
		 * 
		 * Cuando estemos frente a un tipo de dato no primitivo, lo identificaremos facilmente porque se trata de
		 * una clase, es decir, el nombre del tipo de dato comienza con mayúscula
		 */
		
		//Cadena de texto o secuencia de caracteres
		String cadena = "Hola mundo";  //
		String nombre = "Ana Mary :)";
		
		//El tipo de dato string admite secuencia de caracteres, símbolos, espacios, signos de puntuación, num, etc.
		//Si almacenamos números en un tipo de dato String se almacena como texto y no como número.}
		
		
		//Wrapper o envoltorio
		//Son tipos de datos que son clases y por esto van a otorgarle otras funcionalidades
		//o propiedades a las variables declaradas
		
		byte x = 127;
		Byte by = 127;
		Short sh = 10000;
		
		//by está envulta por una clase, esto permite darle ciertas funcionalidades
		//Si yo utilizo mi variable x, que es un dato primitivo
		//x. al agregarle un punto, no me permite realizar ninguna otra acción.
		
		//Si utilizo mi variable by, que es un datoo wrapped, veamos que ocurre al
		//poner un punto delante del nombre:
		//by.  //aparece un menú con varias funciones
		
		by.toString(); //Me permite convertir el valor contenido en byte a cadena de texto
		
		//Como darle la salida en consola a nuestros datos para visualizarlos
		//Imprimir en pantalla lo contenido en una variable
		
		System.out.println(nombre); //ln es para salto de línea
		
		//syso + ctrl + espacio
		//sout +ctrl + espacio
		System.out.println(cadena);
		System.out.println("¿cómo les va?");
		
		//Concatenar
		//Unir valores para mostrarlos en una impresión
		System.out.println(nombre + " ¿cómo les va?");
		
		//Para ejecutar sumas se pone la suma entre parentesis para que se realice la operación
		System.out.println("El resultado de la suma es " + (127+5));
		
		
	}  //cierre del main
	
}  //cierre de la clase
