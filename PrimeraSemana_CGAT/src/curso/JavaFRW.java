package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, File reader y  BufFeredReader
		
		//Vamos a declarar primero un string donde almacenar
		//la línea o lineas por leer
		String linea;
		
		//Muchas veces, cuando intentamos recuperar info
		//de un archivo externo o conversion de datos
		//que pueda tener un "error" de comunicación
		//recurriremos a la estructura try & catch
		
		
		try { //Intentaremos ejecutar el siguiente código
			//Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\HP\\Desktop\\fichero.txt");
		
			
			//FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader (archivo);
			
			//BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader (fr);
		
			//Asignamos la linea de texto en el archivo a nuestro
			//String declarado previamente
			//para que mientras haya lineas por leer, esas se visualicen
			while ((linea = buffer.readLine()) !=null) {			
			System.out.println(linea);
			}
		  
		}catch (Exception e) { //si algo ocurre, se atrapa aqui
			// y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			//Si queremos ver el error, imprimimos el mismo de donde se guardo en el objeto "e"
			e.printStackTrace();
		} 
	}

}
