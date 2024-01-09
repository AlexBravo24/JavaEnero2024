package curso;//nombre del paquete

public class TiposDeDatos {//nombre de la clase
//apertura del main 
	public static void main(String[] args) {
		//el metodo principal es el punto de entrada Y EJECUCION DE UN PROGRAMA
		
		//Alex comentarios de una sola linea
		//se utiliza dos diagonales y eso no intefiere con el codigo 
		/*comentarios de
		 * multiples
		 * lineas
		 * 
		 * 
		 */
		//CTRL + S para guardar cambios dentro del codigo
		//DECLARACION DE TIPOS DE DATOS
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		//DECLARAR VARIABLES DE LOS TIPOS DE DATOS PERO SIN
		//UN VALOR ASIGNADO ojo! aunque las variable spueden contener diferentes tipos de datos, no pueden repetirse
		byte numero1;
		short numero2;
		int numero3;
		long numero4;
		//posteriormente puedo asignarles un valor si asi lo requiero
		numero1=127;
				
		//declarar variables con tipo de dato y valor asignado
		//desde un inicio
		byte numero5 = -128; //1 BYTE
		short numero6 = 32767; //2 BYTES
		int numero7 = 2147483647; //4 BYTES
		long numero8 = 2147483648L; //8 BYTES
		//las variables de tipo long
		//para almacenar rangos mas allá de los admitidos en los int
		//necesitan del sufijo "L"
		//LA VARIABLE COMODIN O MAS UTILIZADA PARA ALMACENAR NUMEROS ENTEROS ES LA DEL TIPO "INT" 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
		float numero9 = 3.1416F; //los tipo de datos float necesitan el sufijo "F" para contener el valor 
		//el cual es de 4 bytes
		
		double numero10 = 3.1416780909078; //8 bytes de memoria y no necesita sufijo
		//double es la variable "comodin"  o mas utilizada para contener numeros decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOLEANOS
		 * CARACTER
		 */
		
		boolean evalua = true; //estos tipo sde dato fascilitan el trabajo
		//al evaluar condiciones o expresiones. solo admiten TRUE or FALSE
		
		char caracter = 'a'; //puede contener o almacenar un solo caracter 
		//y se asigna o guarda el mismo entre comilla simple
		//puede almacenar un espacio o un simbolo, una letra etc.
		
		/*tipos de datos no primitivos
		 * tipos de dato objeto/tipos de dato referenciales
		 * tipos de dato wrapper
		 * 
		 * cuando estemos frente a un tipo de dato no primitivo
		 * lo identificamos facilmente porque se trata de una clase
		 * (es decir, el nombre del tipo de dato comienza con mayuscula)
		 * 
		 */
		
		//cadena de texto o secuencia de caracteres
		String cadena = "Hola Clase";
		String nombre = "Alejandro Gonzalez Gomez";
		
		//El tipo de dato string admite secuencias de caracteres,
		//incluyendo simbolos, espacios, signos de puntuación,
		//numeros, etc.
		//sin embargo, si almacenamos numeros en un tipo de dato
		//string, se almacena como texto y no como numero
		
		//tipos de dato Wrapper o Envoltorio
		//son tipos de dato que son clases, y por ese hecho van a otorgarle
		//otras funcionalidades o propiedades a las variables declaradas
		
		byte x = 127; 
		Byte by = 127; 
		Short sh = 10000;
		
		//si yo utilizo mi variable x que es un dato primitivo
		//x. al agregarle un punto, no me permite realizar alguna otra acción
		//si yo utilizo mi variable by que es un tipo de dato wrapper
		//veamos que ocurre al pner un punto . delante del nombre
		by.toString(); //aqui este metodo me permite 
		
		System.out.println(nombre);
		System.out.println(cadena);
		System.out.println("Hola Mundo");
		
		
		//syso + ctrl + espacio te pone en auntomatico el "System.out.println()"
		
		//para concatenar (unir valores para mostrarlos en una sola impresion)
		//System.out.println("hola mundo, mi nombre es" + variable que se quiere imprimir, ejemplo "nombre")
		
		System.out.println("hola mundo, mi nombre es" + nombre);
		
		//para ejecutar sumas cpn el concatenado, hay que encerrar la operacion entre parentesis, ejemplo (127+8)
		
		System.out.println("el resutado de sumar 127 mas 30 es " + (127+30));
		
		
		
	}//cierre del main
	
}//cierre de la clase
