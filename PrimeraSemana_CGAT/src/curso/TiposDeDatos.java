package curso; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase
	//y apertura
public static void main(String[] args) { //apertura del main
	//Es el método principal
	//Comentarios con dos diagonales
	
	//CTRL+S para guardar cambios en la clase en el código

		/* Comentarios
		 * de
		 * multiples
		 * lineas
		 */
	
	//Declaracion de Tipos de Datos
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS ENTEROS
	 */
	
	//Declarar variables de los tipos de datos pero
	//sin un valor asignado
	//Aunque las ariables puedan contener tpo de dato distinto
	//no pueden repetirse el nombre de las mismas
	byte numero1;
	short numero2;
	int numero3;
	long numero4;
	
	//Posteriormente puedo asignarles un valor si se requiere
	numero1=127;
	
	
	//Declarar variables con tipo de dato y valor asignado
	//desde un inicio
	byte numero5 = -128; //1 BYTE
	short numero6 = 32767;//2 BYTES
	int numero7 = 2147483647;//4 BYTES
	long numero8 = 2147483648L; //8 BYTES
	//Las variables de tipo long
	//para almacenar rangos más alla de los admitidos en los int
	//necesitan el sufijo "L"
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
	 * (DECIMALES)
	 */
	
	float numero9 = 3.1416F; //los tipos de dato float necsitan el sufijo
	//"F" para contener el valor //4 bytes
	
	double numero10 = 3.1416780909078; //8 bytes de memoria y no ncesita sufijo
	
	/*TIPOS DE DATOS PRIMITIVOS
	 *Booleanos
	 *Caracter
	 */
	
	boolean evalua = true; //Estos tipos de dato facilitan el trabajo
	//al evaluar condiciones o expresiones. Solo admiten TRUE o FALSE
	
	
	char caracter = 'A'; //Puede contener o almacenar un solo caracter
	// y lo asigna o guarda entre comilla simple
	//Puede almacenar un espacio, símbolo, letra, etc
	
	/*TIPOS DE DATOS NI PRIMITIVOS
	 * TIPO DE DATO OBJETO
	 * TIPO DE DATO REFERENCIALES
	 * TIPO DE DATO WRAPER
	 * 
	 * Cuando estemos frente a un tipo de dato no primitivo
	 * lo identificaremos porque se trata de una clase; es decir;
	 * el nombre del tipo de dato comienza con mayuscula
	 * 
	 */
	
	//Cadena de texto o secuencia de caracteres
	String cadena = "Hola Generacion 159"; 
	String nombre = "Carlos Guillermo Aguilar Torres";
	
	//El tipo de dato String admite secuencias de caracteres,
	//incluyendo símbolos, espacios, signos, números, etc.
	//Sin embargo, si almacenamos numeros en tipo de datos
	//String, se almacena como texto y no como número.
	
	//Tipos de datos Wraper o Envoltorio
	//Son tipos de dato que son clases y por este hecho
	// van a otorgarle
	//otras funcionalidades o propiedades
	//a las variables declaradas
	
	byte x = 127;
	Byte by =127;
	Short sh = 10000;
	
	//Si yo utilizo mi variable x que es un tipo de dato primitivo
	//x, al gregarle un punto, no me permite realizar alguna otra acción
	
	//Si yo llamo a mi variable by que es un tipo de dato wraper
	//vemos que ocurre al poner un punto . delante del nombre
	by.toString(); //Este método me permite convertir el
	//valor contenido a byte a cadena de texto
	
	//Como darle salida en consola a nuestros datos
	//para poder visualizarlos
	//Ejemplo imprimier en pantalla una variable
	//ejemplo, la variable nombre
	
	System.out.println(nombre);
	System.out.println(cadena);
	
	//Concatenar
	System.out.println("El resultado de 46 + 4 es " + (46+4));
	
	
	

	
	}//cierre del main	
	
} //cierre de la clase
