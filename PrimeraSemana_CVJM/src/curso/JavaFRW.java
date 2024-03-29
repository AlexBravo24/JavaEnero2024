package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferdReader
		
		/*Vamos a declara primero un String donde almacenar 
		 * la linea o lineas de texto por leer
		 */

		String linea;
		
		//Muchas veces cuando intentamos recuperar informacion 
		//de un archivo externo o conversion de datos que pueda
		//tener algun ""error" de comunicacion recurriremos a
		//la estructura try & catch
		
		try {//Intentaremos ejecutar el siguiente codigo
			//CLASE FILE- Representa el archivo en memoria 
			File archivo = new File("C:\\Users\\Valeria Juarez\\Desktop\\nota.txt");
			
			//FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader- Puede leer contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Asignamos la linea de texto en el archivo a nuestro
			//String declarado previamente
			
			//Para que mientras haya lineas por leer, estas
			//se visualicen
			while ((linea= buffer.readLine())!=null) {
				
			
			System.out.println(linea);
			
			}
			
		} catch (Exception e) { //Si algo ocurre, se  atrapara 
			//aqui y el error se atrapa en el objeto y se 
			//ejecuta lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			
			//Si queremos ver el error, imprimimos el mismo de
			//donde se guado en el objeto "e"
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
