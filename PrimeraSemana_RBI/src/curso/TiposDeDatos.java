package curso;

public class TiposDeDatos { //nombre de la clase y apertura
	
	public static void main(String[] args) { //apertura del main
		// El metodo principal es el punto de entrada y ejecucion de un programa
		// Comentario de una sola linea 
		
		/*
		 * comentarios de 
		 * multiples lineas
		 * jeje
		 * 
		 */
		
		// Declaracion de tipos de datos
		
		/*
		 * Tipos de datos primitivos
		 * numericos enteros
		 */
		
		//Declarar variables de los tipos de datros pero sin un valor asignado
		//auqnue las variables puedan contener tipos de datos distintos no pueden repetirse el nombre de las mismas.
		
		byte numero1;
		short numero2;
		int numero3;
		long numero4;
		
		// posteriormente puedo asignarles un valor si asi lo requiero 
		
		numero1 = 127;
		
		
		// Declarar variables con tipo de dato y valor asignado desde un inicio 
		
		byte numero5 = -128;
		short numero6 = 32767;
		int numero7 = 2147483647;
		long numero8 = 2147483648L; //Las variables de tipo Long para almacenar rangos mas alla de los admitidos en los int necesitan del sufijo "L"
		
		//La variable "comodin" o mas utilizada para almacenar numeros enteros es la tipo "Int"
		
		/*
		 * Tipos de datos primitivos 
		 * numericos en punto o coma flotante
		 * (Decimales)
		 */
		
		float numero9 = 3.1416F; //Los tipos de dato float necesitan el sufijo "F" para contener el valor // 4 bytes
		
		double numero10 = 3.141615; //8 bytes de memoria y no necesita sufijo 
		
		//la variable comodin mas utilizada es la de tipo "double"
		
		/*
		 * Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true; //Estos tipos de datos facilitan el trabajo al evaluar condiciones o expresiones. Solo admiten true or False
		
		char caracter = 'h'; // Puede contener o almacenar un solo caracter  y se asigna o guarda el mismo entre comilla simple, puede almacenar un espacio, un simbolo, una letra etc. 
		
		
		/*Tipos de datos no primitivos 
		 * tipos de dato objeto/ tipos de datos referenciales
		 * tipo de dato wrapper
		 * 
		 * 
		 * Cuando estemos frente a un tipo de dato no primitivo lo identificaremos facilmente por que se trata de una clase
		 * (Es decir, el nombre del tipo de dato comienza con mayuscula)
		 */
		
		//Cadena de texto o secuencia de caracteres
		String cadena = "Hola generacion 159";
		String nombre = "Raymundo Barranco Illescas";
		
		//El tipo de dato String admite secuencias de caracteres,
		//Incluyendo simbolos, espacios, signos de puntuacion, numeros, etc. 
		//Sin embargo, si almacenamos numeros en un tipo de dato
		//String se almacena como texto y no como numero. 
		
		//Tipos de dato wrapper o Envoltorio 
		//Son tipos de datos que son clases, y por ese hecho van a otorgarle otras funcionalidades o propiedades a las
		//variables declaradas 
		
		byte x = 127;
		Byte by = 127;
		Short sh = 10000;
		
		//Si yo utilizo mi variable x que es un dato primitivo
		//x. al agregarle un punto, no me permite realizar alguna otra accion
		
		//Si yo utilizo mi variable by que es un tipo de dato wrapper
		//Veamos que ocurre al poner un punto. delante del nombre
		by.toString(); //Aqui este metodo me permite convertir el valor contenido en byte a cadena de Texto
		
		//Como darle salida en la consola a nuestros datos
		//para poder visualizarlos
		//Ejemplo, imprimir en pantalla lo contenido en alguna variable por ejemplo la variable nombre
		
		System.out.println(nombre);
		
		System.out.println(cadena);
		
		//syso / sout ctrl + espacio
		System.out.println("Hola Mundo");
		
		//Concatenar - unir valores para mostrarlos en una impresion 
		System.out.println("Hola mundo mi nombre es " + nombre);
		
		//Para ejecutar las sumas, cuando entramos en concatenacion hay que encerrar la operacion entre parentesis
	}// cierre del main
} // cierre de la clase
