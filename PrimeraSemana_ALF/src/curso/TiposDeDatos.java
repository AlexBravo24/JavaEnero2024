package curso; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) {
		//El metodo main 
		//Comentarios de una sola linea con dos lineas
		/* con este hacemos comentarios 
		 * con varias lineas
		 * */
		
		// Comentarios de una sola linea con
				// dos diagonales
				byte numero1;
				short numero2;
				int numero3;
				long numero4;
		// posteriormente puedo asignarles un valor si asi se requiere 
				numero1=127;
				
		//declarar variables con tipo de dato y valor asignado desde un inicio 
				byte numero5 = -128; // 1 
				short numero6 = 32767; // 2 bytes
				int numero7 = 2147483647; // 4 bytes
				long numero8 = 2147483648L;  // 8 bytes
				// las varialbles de tipo long para almacenar rangos mas alla de los admitidos en los int necesita el sufijo "L"
				//la varible "comodin" o mas utilizada para almacenar numeros enteros es la tipo "int"
				/*TIPOS DE DATOS PRIMITIVOS
				 * NUMERICOS EN PUNTO O COMA FLOTANTE 
				 * (D
		* (DECIMALES)
				 */
				float numero9 = 3.1416F; // los tipos de datos float necesitan el sufijo "F" para contener el valor "4 bytes"
				double numero10 = 3.1416780909078; // 8 bytes de memoria y no necesita sufijo y es la varible "comodin" mas utilizada es la tipo "double"
				
				/*TIPOS DE DATOS PRIMITIVOS 
				 * Booleanos
				 * Caracter
				 */
				boolean evalua = true; //Estos tipos de dato facilitan el trabjao al evaluar condiciones o expresiones, solo admiten TRUE o FALSE
				char caracter = 'A'; // puede contener o almacenar un solo caracter y se asigna o guarda el mismo entre comilla simple, puede almacenar un espacio,simbolo o letra etc.
				/*TIPOS DE DATOS NO PRIMITIVOS 
				 * TIPOS DE DATO OBJETO
				 * TIPOS DE DATO WRAPPER
				 
		* CUANDO ESTEMOS FRENTE A UN TIPO DE DATO NO PRIMITIVO LO IDENTIFICAREMOS FACILMENTE PORQUE DE TRATA DE UNA CLASE (ES DECIR, EL NOMBRE DEL TIPO DE DATO ES CON MAYUSCULA)
				 */
				//cADENA DE TEXTO O SECUENCIA DE CARACTERES 
				String cadena = "hola generacion 159";
				String nombre = "Alfredo lopez fernandez";
				
				System.out.println(nombre);
				 //syso + ctrl + espacio
				//atajo para imprimir
				
				System.out.println("hola mundo");
				// imprimir valores numerico directamente
				
				System.out.println(28);

				//concatenar unir texto con suma de numeros etc
				
				System.out.println("El resultado de la suma de 45 + 5 es: "+ (45+5));
	}//cierre del main

}//cierre de la clase++
