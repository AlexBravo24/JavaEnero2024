package curso; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	//y apertura

	public static void main(String[] args) { //apertura del main
		//El método principal es el punto de entrada y ejecución
		//de un programa
		
		// Comentarios de una sola linea con
		//dos diagonales
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 */
		
		//CTRL + S para guardar cambios en la clase en el codigo
		
		//Declaración de Tipos de Datos
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Declarar variables de los tipos de datos pero sin
		//un valor asignado
		//Aunque las variables puedan contener tipos de dato distinto
		//no pueden repetirse el nombre de las mismas
		byte numero1;
		short numero2;
		int numero3;
		long numero4;
		
		//Posteriormente puedo asignarles un valor si así
		//lo requiero
		numero1=127;
		
		
		//Declarar variables con tipo de dato y valor asignado
		//desde un inicio
		byte numero5 = -128; //1  BYTE
		short numero6 = 32767; //2 BYTES
		int numero7 = 2147483647; //4 BYTES
		long numero8 = 2147483648L; //8BYTES
		//Las variables de tipo long
		//para almacenar rangos más alla de los admitidos en los int
		//necesitan del sufijo "L"
		
		//La variable "comodín" o más utilizada para almacenar numeros enteros
		//es la tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
		float numero9 = 3.1416F; //los tipo de dato float necesitan el sufijo
		//"F" para contener el valor //4 bytes
		
		double numero10 = 3.1416780909078; //8 bytes de memoria
		//y no necesita sufijo
		
		//La variable comodín más utilizada es la de tipo "double"
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true; //Estos tipos de dato facilitan el trabajo
		//al evaluar condiciones o expresiones. Solo admiten TRUE or FALSE
		
		char caracter = 'A'; //Puede contener o almacenar un solo caracter
		//y se asigna o guarda el mismo entre comilla simple
		//Puede almacenar un espacion, un símbolo, una letra, etc
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO/TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO WRAPPER
		 *
		 * Cuando estemos frente a un tipo de dato no primitivo
		 * lo identificaremos facilmente porque se trata de una clase
		 * (es decir, el nombre del tipo de dato comienza con
		 * mayúscula)
		 *
		 */
		
		//Cadena de texto o secuencia de caracteres
		String cadena = "Hola Generación 159";
		String nombre = "Jorge Alejandro Bravo Ramirez";
		
		//El tipo de dato String admite secuencias de caracteres,
		//incluyendo simbolos, espacios, signos de puntuacion,
		//numeros, etc. 
		//Sin embargo, si almacenamos numeros en un tipo de dato
		//String, se almacena como texto y no como numero.
		
		//Tipos de dato Wrapper o Envoltorio
		//Son tipos de dato que son clases, y por ese hecho van
		//a otorgarle
		//otras funcionalidades o propiedades
		//a las variables declaradas
		
		byte x = 127;
		Byte by = 127;
		Short sh = 10000;
		
		//Si yo utilizo mi variable x que es un dato primitivo
		//x. al agregarle un punto, no me me permite realizar alguna 
		//otra accion
		
		//Si yo utilizo mi variable by que es un tipo de dato wrapper
		//veamos que ocurre al poner un punto . delante del nombre
		by.toString(); //Aqui este metodo me permite convertir el
		//valor contenido en byte a cadena de texto
		
		//Como darle salida en consola a nuestros datos
		//para poder visualizarlos
		//Ejemplo, imprimir en pantalla lo contenido en alguna variable, por 
		//ejemplo, la variable nombre
		
		System.out.println(nombre);
		System.out.println(cadena);
		
		//syso / sout + ctrl + espacio
		System.out.println("Hola mundo");
		
		//Concatenar - unir valores para mostrarlos en una impresion
		System.out.println("Hola mundo mi nombre es " + nombre);
		
		//Para ejecutar las sumas, cuando entramos en concatenacion
		//hay que encerrar la operacion entre parentesis
		System.out.println("El resultado de la suma es " + (127+5));
	
	}// cierre del main
	
} //cierre de la clase
