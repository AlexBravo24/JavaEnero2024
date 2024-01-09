package curso; // nombre del paquete

public class TiposDeDatos { // nombre de la clase y apertura
	
	//CTRL + Barra espaciadora para escribir public static void main

public static void main(String[] args) { // Apertura del main
	// Comentarios de una solo línea con 
	// dos diagonales
	
	/* Comentarios
	 * de 
	 * múltiples
	 * líneas
	 */
	
	// CTRL + S para guardar cambios en la clase en el código
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS ENTEROS
	 */
	
	//Declarar variables de los tipos de datos pero
	//sin un valor asignado
	
	/*Aunque las variables puedan contener tipos de datos distintos,
	 * no pudene repetirse el nombre de las mismas
	 */
	byte numero1;
	short numero2;
	int numero3;
	long numero4; 
	
	/* Posteriormente, puedo asignarles un valor si así
	 * lo requiero
	 */
	
	numero1=127;
	
	
	// Declarar variables con tipo de dato y valor asignado
	// desde el inicio
	byte numero5 = -128; // 1 BYTE
	short numero6 = 32767; // 2 BYTES
	int numero7 = 2147483647; // 4 BYTES
	long numero8 = 2147483648L; // 8 BYTES 
	//Las variables de tipo long
	// para almacenar rangos más allá de los admitidos en el int,
	// necesitan el sufijo "L" o "l"
	
	// La variable "comodín" o la más utilizada para almacenar
	// números es la tipo "int"
	
	/* TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
	 * (DECIMALES)
	 */
	
	float numero9 = 3.1416F; // 4 BYTES 
	// Los tipos de datos float, necesitan
	// el sufijo "F" para contener el valor 
	
	double numero10 = 3.1416780909078; // 8 BYTES DE MEMORIA
	// double no necesita sufijo
	
	//La variable "comodín" más utilizada es la de tipo "double"
	
	/* TIPOS DE DATOS PRIMITIVOS
	 * Booleanos
	 * Caracter
	 */
	
	boolean evalua = true; // Estos tipos de dato, facilitan el trabajo
	// al evaluar condiciones o expresiones. Solo admiten "true" o "false"
	
	char caracter = 'A'; //Puede contener o almacenar un solo caracter
	// y se asigna o guarda el mismo entre comilla simple
	// Puede almacenar un espacio, un símbolo, una letra, etc.
	
	/*TIPOS DE DATOS NO PRIMITIVOS
	 * TIPOS DE DATO OBJETO/TIPOS DE DATO REFERENCIALES
	 * TIPOS DE DATO WRAPPER
	 * 
	 * Cuando estemos frente a un tipo de dato no primitivo,
	 * lo identificaremos fácilmente porque se trata de una Clase,
	 * es decir, el nombre del tipo de dato comienza con mayúscula
	 */
	
	//Cadena de texto o secuencia de caracteres
	String cadena = "Hola Generación 159";
	String nombre = "Luis Daniel García Ramírez";
	
	// El tipo de dato String admite secuencias de caracteres, 
	// incluyendo símbolos, espacios, signos de puntuación,
	// números, etc.
	// Sin embargo, si almacenamos números en un tipo de dato String,
	// se almacena como texto y no como número
	
	/*Tipos de dato Wrapper o Envoltorio
	 * Son tipos de dato que son clases, y por ese hecho van a
	 * otorgarle otras funcionalidades o propiedades a las
	 * variables declaradas
	 */
	
	byte x = 127;
	Byte by = 127;
	Short sh = 10000;
	
	// Si yo utilizo mi variable "x" que es un dato primitivo x,
	// al agregarle un punto,no me permite realizar alguna otra
	// acción
	
	// Si yo utilizo mi variable "by" que es un tipo de dato wrapper,
	// veamos qué ocurre al poner un punto (.) delante del nombre
	
	by.toString(); // Aquí este método me permite convertir el valor
	// contenido en byte a cadena de texto
	
	/* Cómo darle salida en consola a nuestros datos para poder
	 * visualizarlos
	 * Ejemplo: imprimir en pantalla lo contenido en alguna variable,
	 * por ejemplo, la variable nombre
	 */
	
	System.out.println(cadena);
	System.out.println(nombre); //Se puede ejecutar con clic derecho,
	// Run As, Java Application
	
	// println (Es una "L" minúscula, no es una "i" mayúscula
	
	// El ln en el print, es para que lo imprima en una sola línea
	
	// Atajo para escribir esto:
	// Escribir "syso" o "sout" + CTRL + espacio
	
	// Concatenar - unir valores para mostrarlos en una impresión
	System.out.println("Hola mundo, mi nombre es " + nombre);
	
	// Para ejecutar las sumas, cuando entramos en concatenación,
	// hay que encerrar la operación entre paréntesis
	System.out.println("El resultado de la suma 127+5 es: " + (127+5));
	
} // Cierre del main
	
} // Cierre de la clase
