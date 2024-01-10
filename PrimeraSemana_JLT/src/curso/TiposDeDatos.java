package curso; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	//y apertura
	
	public static void main(String[] args) { //apertura del main
		//El metodo principal es el punto de entrada y ejecucion
		//de un programa
		
		//comentarios de una sola linea con 
		//dos diagonales
		
		/*comentarios
		 * de 
		 * multiples
		 * lineas
		 * 
		 */
		
		//CTRL + S para guardar cambios en la clase en el codigo
		
		//Declaracion de Tipos de Datos
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 */
		
		//Decalrar variables de los tipos de datos pero sin 
		//un valor asignado
		//Aunque las variables puedan contener tipos de datos distintos
		//no pueden repetirse el nombre de las mismas
		byte numero1;
		short numero2;
		int numero3;
		long numero4; 
		
		//Posteriormente puedo asignarles un valor si asi 
		//lo requiero
		numero1=127;
		
		
		//Declarar variables con tipo de dato y valor asignado
		//desde un inicio
		byte numero5= -128; //1 byte
		short numero6= 32767; //2 byte
		int numero7= 2147483647; //4 byte
		long numero8= 2147483648L; //8 bytes
		//Las variables de tipo long
		//para almacenar rangos mas alla de los admitidos en los int
		//necesitan del sufijo ¨L¨
		
		//La variable ¨comodin¨ o mas utilizada para almacenar numeros enteros
		//es la tipo ¨int¨
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
		float numero9= 3.1416F; //los tipó float de datos necesitan el sufijo
		//¨F¨ para contener el valor //4 bytes
		
		double numero10= 3.1416780909078;  //8 bytes de memoria
		//y no necesita sufijo
		
		//la variables comodin mas utilizada es la de tipo ¨double¨
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * booleanos
		 * caracter
		 */
		
		boolean evalua = true; //Estas tipos de datos facilitan el trabajo 
		//al evaluar condiciones o expresiones. Solo admiten TRUE or FALSE
		
		char caracter = 'a'; //Puede Contener o almacencar un solo caracter
		//y se asigna o guarda el mismo entre comilla simple
		//Puede almacenar un espacio, simbolo, una letra, etc
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO/ TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO WRAPPER
		 * 
		 * Cuando estemos frente a un tipo de dato no prmitivo
		 * lo identificaremos facilmente por que se trata de una clase
		 * (es decir, el nombre del tipo de dato comienza con
		 * mayusculas)
		 * 
		 */
		
		//Cadena de texto o secuencia de caracteres
		String cadena = "Hola Generacion 159";
		String nombre = "Judiel Landa Tejeda";
		
		//El tipo de dato String admite secuencias de caracteres,
		//incluyendo simbolos, espacios, signos de puntuacion,
		//numeros, etc.
		//Sin embargo, si almacenamos numeros en un tipo de dato
		//String, se almacena como texto y no como numero.
		
		//Tipos de dato Wrapper o Envoltorio
		//Son tipos de dato que son clases y por ese echo van
		//a otorgale
		//otras funcionalidades o propiedades
		//a las variables declaradas 
		
		byte x = 127;
		Byte by = 127;
		Short sh = 10000;
		
		//Si yo utilizo mi varibales x que es un dato primitivo 
		//x, al agregarle un punto, no me permite realizar alguna
		//otra accion
		
		//Si yo utilizo mi variable by que es un tipo de dato wrapper
		//veamos que ocurre al ponter un punto. delante del nombre 
		by.toString(); //Aqui este metodo me permite convertir el 
		//valor contenido en byte a cadena de texto 
		
		//Como darle salida en consola a nuestros datos
		//para poder visualizarlos
		//Ejemplo, imprimir en pantalla lo contenido en alguna variable, por 
		//ejemplo, la variable nombre
		
		System.out.println(nombre);
		System.out.println(cadena);
		
		//syso/ sout + ctrl + espacio
		System.out.println("hola mundo");
		
		//Concatenar = unir valores para mostrarlos en una impresion
		System.out.println("hola mundo mi nombre es " + nombre);
		
		//Para ejecutar las sumas, cuando entramos en concatenacion 
		//hay que encerrar la operacion entre parentesis
		System.out.println("El resultado de la suma " + (127+5));
	
		
		
	} //cierre del main
	
} //cierre de la clase


