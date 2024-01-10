package curso; //nombre del paquete 

public class TiposDeDatos {  //nombre de la clase 
	//y apertura
	public static void main(String[] args) {  //apertura del main
		// El método principal es el punto de entrada y ejecución
		//de un programa
		
		
		/*Comentario 
		 * de
		 * muchas 
		 * lineas
		 * 
		 */

		//Declaración de tipos de datos
		
		/*TIPOS DE DATOS PRIMITOVPS
		 * NUMÉRICOS ENTEROS 
		 */
		
		//Declarar variables de los tipos de datos pero sin 
		//un valor asignado
		
		byte numero1; 
		short numero2;
		int numero3;
		long numero4; 
		
		
		//Asigmarles un valor ai asi lo resguardo 
		
		byte numero5=-128; //1 Byte 
		short numero6 = 32767; //2 Bytes
		int numero7 = 2147483647; //4 Bytes
		long numero8= 54323403788L; //8 Bytes
		//Las variables de tipo long 
		// para almacenar mas alla de los admitidos en los int
		//necesitan del sufijo "L"
		
		//La variable "comodin" o mas utilizada para almacenar
		//numeros enteros es la tipo "int"
		
		/*TIPO DE DATOS PRIMITIVOS 
		 *NÚMERICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 */
		
		float numero9 = 3.3422F; //Los tipo de dato float
		//necesitan el sufijo "F"  //4 bytes
		
		double numero10 = 3.23233434543987; // 8 bytes de memoria
		//y no necesita sufijo 
		
		//La variable mas utilizada para numeros decimales es 
		// "double"
		
		/*TIPOS DE DATOS PRIMIRIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true; //Estos tipos de dato facilitan el
		//tranajo al evaluar condiciones o expresiones, Solo 
		// admiten TRUE or FALSE
		
		char caracter = 'a'; //se almacena letra, simbolos '&, $' 
		// o espacios ' ' y se guarda entre comillas simples
		// mi teclado es con ? (despues del 0)
		
		/* TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO WRAPPER
		 * 
		 * Cuando entemos frente a un tipo de dato no primivito 
		 * lo identificaremos facilmente porque se trata de una 
		 * clase (es decir, el nombre del tipo de dato comienza
		 * con mayuscula)
		 */
		
		//Cadena de texto o secuencia de caracteres
		String cadena = "Hola Generacion 159"; 
		String nombre = "Cindy Valeria Juarez Martinez";
		String nombreProfe = "Jorge Alejandro Bravo Ramirez";
		
		/*El tipo de dato String admite secuencias de caracteres,
		 * incluyendo simbolos, espacios, signos de puntuacion,
		 * numeros etc.
		 * Sin embargo, si almacenamos numeros en un tipo de dato
		 * String, se almacena como texto y no como numero.
		 */
		
		//TIPOS DE DATO WRAPPER O ENVOLTORIO
		// Son tipos de dato que son clases y por este hecho van 
		//a ottogarle otras funcionalidades o propiedades 
		//a las variables declaradas
		
		byte x= 124;
		Byte by= 126;
		Short sh= 1000;
		
		
		
		//Si yo utilizo mi variable x que es un tipo de dato
		//promitivo 
		//x. al agregarle un punto, no me permite realizar alguna
		//otra accion
		
		//Si utilizo mi variable by que esun tipo dato wrapper 
		//veamos que ocurre al ponerle un punto . delante del 
		//nombre
		by.toString();  //Aqui este metodo permite convertir el
		//valor contenido en byte a cedena de texto
		
		//COMO DARLE SALIDA EN CONSOLA A NUESTROS DATOS
		//para poder visualarlos 
		//Ejemeplo, imprimir pantalla lo contenido en alguna 
		//variable (nombre)
		
		System.out.println(nombre);
		System.out.println(cadena);
		
		//syso / sout + control + espacio
		System.out.println("Hola Mundo");
		
		//Concatenar - unor valores para moestrarlos en una 
		//impresion
		
		System.out.println("Hola Mundo, mi nombre es " + nombre);
		System.out.println("El resultado de 34 + 54 es: " + (34+54));
	
		
		
		
		
		
		
		
				
				
	} //Cierre del main

} //Cierre de la clase 
