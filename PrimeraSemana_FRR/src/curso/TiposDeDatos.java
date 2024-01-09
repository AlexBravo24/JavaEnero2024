package curso; //nombre del paquete

public class TiposDeDatos { //nombre de la clase y apertura 

	public static void main(String[] args) {//apertura del main
		//el metodo principal nos permite ese punto de entrada y ejecucion 
		//de un programa 
		
		//comentarios de una sola linea con
		//dos diagonales
		
		/*comentarios 
		 * de 
		 * multiples 
		 * lineas
		 */
		
		//CTRL+S guardar cambios del codigo
		
		//DECLARACION DE TIPOS DE DATOS 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 * 
		 */
		//DECLARAR VARIABLES SIN UN VALOR ASIGNADO
		//AUNQUE LAS VARIABLES TENGAN TIPOS DE DATOS
		//DISTINTOS, NO SE PUEDE REPETIR EL NOMBRE 
		byte numero1;
		short numero2;
		int numero3;
		long numero4;
		
		//POSTERIORMENTE SE LES PUEDE ASIGNAR UN VALOR
		numero1=127;
		
		//DECLARAR VARIABLES DESDE UN INICIO CON VALOR INICIAL
		//Y TIPO
		byte numero5 = 127; //1 byte
		short numero6 = 32767; //2 bytes
		int numero7 = 213243243; // 4 bytes
		long numero8 =65465765765314877L; //8bytes
		//los tipo long se usan para guardar valores mas grandes
		//requieren la "L" al final si sobrepasa su capacidad
		
		//la variable comodin es la tipo "int"
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 * (DECIMALES)
		 */
		
				float numero9 = 3.1416F; //tipo float requieren 
				//subfijo "F" para poder contener el valor
				
				double numero10 =3.1415664665465; //8 bytes de memoria
				//no necesita subfijo
				//la variable comodin mas utilizada es la de tipo "double
				
				/* TIPOS DE DATOS PRIMITIVOS 
				 * BOOLEANOS
				 * CARACTER
				 */
				
				boolean evalua = true; //solo verdadero o falso
			    //evaluan condiciones o expresiones
				
				char caracter = 'a';//puede contener un caracter a la vez
				//se asigna o guarda entre comilla simple
				//espacios, simbolos, letras. Solo una a la vez
				
				/*TIPOS DE DATOS NO PRIMITIVOS
				 * TIPOS DE DATO OBJETO
				 * TIPOS DE DATO REFERENCIALES
				 * TIPOS DE DATO WRAPPER
				 * 
				 * CUANDO ESTEMOS FRENTE A UN TIPO DE DATO NO PRIMITIVO
				 * LO IDENTIFICAREMOS FACILMENTE PORQUE SE TRATA DE UNA 
				 * CLASE. EL TIPO DE DATO EMPIEZA CON MAYUSCULA
				 * 
				 */
				
				//CADENA DE TEXTO O SECUENCIA DE CARACTERES
				String cadena = "Hola Generacion 159";
				String nombre = "Fernando Rivera Rodriguez";
				
				//String admite secuencias de caracteres incluyendo simbolos
				//espacios, signos de puntuacion, numeros etc
				//si almacenamos numeros en esta clase, se almacenan como texto
				
				//TIPOS DE DATO WRAPPER
				//son tipos de dato clases y por este hecho van a otorgarle 
				//otras propiedades y funcionalidades 
				//a las variables declaradas
				
				byte x = 127;
				Byte by = 127;
				Short sh = 10000;
				
				//si yo utilizo mi variable x que es un dato primitivo
				//x. al agregarle un punto, no me permite realizar
				//otra accion
				
				//si yo utilizo mi variable by que es wrapped
				//veamos que ocurre si pongo un punto al frente
				by.toString(); //aqui me permite convertir el 
				//valor contenido en byte como cadena de texto
				
				//COMO DARLE SALIDA EN CONSOLA A NUESTROS DATOS
				
			    //PARA PODER VISUALIZARLOS
				//EJEMPLO IMPRIMIR EN PANTALLA LO CONTENIDO
				//EN ALGUNA VARIABLE
				
				System.out.println(nombre); //ln realiza un cambio de linea para realizar 
				//la siguiente impresión
				//syso + CTRL + espacio 
				System.out.println("hola mundo");
				System.out.println(cadena);
				
				//concatenar une valores pero no los suma
				System.out.println("hola mundo mi nombre es "+ nombre);
				System.out.println("el resultado de la suma es "+ (127+13));
				//cuando se quiere realizar una suma este debe encerrarse entre parentesis
				
				
		
	} //llave de cierre del main
	
} //llave del cierre de la clase 
