package curso;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		
		//Declaracion de tipos de datos
		
		/*datos primitivos
		 * numericos enteros
		 */
		
		//Declarar variables de losn tipos de datos
		//pero sin valor asigando
		//el nombre de las variables mo se puede repetir
		 byte numero1;
		 short numero2;
		 int numero3;
		 long numero4;
		 
		 //se les puede asignar un valor despues
		 numero1=127;
		 
		 
		//asigna valor antes
		 byte numero5 = -128;//1 BYTES
		 short numero6 =32767;//2 BYTES
		 int numero7 =2147483647;//4 BYTES
		 long numero8 =2147483648L;//8 BYTES 
		//LONG necesita L para almacenar numeros mas grandes que int 
		//INT es la variable mas usada 
		 
		 
		 
		/*Datos primitivos
		 * NUMERO EN PUNTO O COMA FDLOTANTE
		 * (DECIMAL)
		 */
		 
		 float numero9 = 3.1416F;//4BYTES //se necesita la F para declarar
		 double numero10= 3.1416780909078; //8 BYTES //NO NECESITA declarar
		 //DOUBLE es la mas usada
		 
		 
		 
		 /*TIPOS DE DATOS PRIMITIVOS
		  * Booleanos
		  * Caracter
		  * 
		  */
		 
		 boolean evalua = true; //Cierto O Falso
		 char caracter = 'a';//un solo caracter (letra, numero, simbolo, espacio) entre comilla simple
		 
		 
		 
		 /*TIPOD DE DATOS NO PRIMITIVOS
		  * DATOS OBJET0
		  * DATOS PREFERENCIALES
		  * WRAPPER
		  * 
		  * LOS DATOS NO PRIMITIVOS SON CLASES
		  * LA PRIMERA LETRA ES MAYUSCULA
		  */
		  
		 //Cadena / secuencia de caracteres
		 
		 String cadna = "Hola mundo";
		 String nombre = "Lex Del Olmo";
		 //STRING acepta todo jaja pero los numeros se almacenan
		 //como texto no como numero
		 
		 
		 //WRPPER (ENVOLTORIO)
		 //Otroga ciertas propiedades los datos primitivos 
		 Byte by =127;
		 Short sh = 10000;
		 
		 //al usar el nombre de la variable Wraapper 
		 //con un . delnate, permite usar ciertas funciones
		 //(como ca,biar las propiedes de la variable de byte a int o algun otro)
		 
		 
		 ////////////////////////////////
		 
		 //syso+ctrl+ esopacio igual a System.out.println();
		 System.out.println(nombre);
		 
		 //Concatenacion
		 System.out.println("Hola mundo,  mi nombre es "+nombre);
		 //Para sumar hay que poner los numeros en parentecis cuando se concatena
		 System.out.println("el resultado de la suma es "+(127+5));
		 
		 
	}

}
