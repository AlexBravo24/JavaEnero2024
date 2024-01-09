package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		/*Uso de la clases file, filereader+ bufferedReader
		 * 
		 * Vamos a declarar un string donde almacenar
		 * la linea o lineas de texto
		 * 
		 */
		String linea;	
		/*Muchas veces cuando intentamos recuperar informacion 
		 * de un archivo externo o conversion de datos
		 * que pueda tener algun error de comunicasion
		 * recurremos ala estructura try catch*/
		
		try {//Intentaremos ejecutar el sigueinte codigo
			//clase file - representa el archivo en memoria
			File archivo = new	File("C:\\Users\\FREDY\\Desktop\\fichero.txt");
			
			//FileReader- Permite abrir el archivo modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader - puede leer el contenido del archivo
			
			BufferedReader buffer = new BufferedReader(fr);
			 //Asignamos la linea de texto en el archivo 
			//a nuestro string declarado previamente
			
			while((linea = buffer.readLine()) !=null){
				System.out.println(linea);
				
			}
			
			
		} catch (Exception e) {//Si algo ocurre se atrapa qui
			//y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			//para ver la traza de error, imprimimos de donde se guardo en el objeto e.
			e.printStackTrace();
			
		}
	}

}
