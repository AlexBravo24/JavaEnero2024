package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de las clases File, FileReader y BufferedReader
		
		// Vamos a declarar primero un String donde almacenar
		// la línea o líneas de texto por leer
		
		String linea;
		
		// Muchas veces, cuando intentamos recuperar información
		// de un archivo externo o conversión de datos 
		// que pueda tener algún "error" de comunicación,
		// recurriremos a la estructura "try & catch"
		
		try { // Intentaremos ejecutar el siguiente código
			
			// Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\Dani\\Desktop\\fichero.txt");
			
			// FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			// BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			// Asignamos la línea de texto en el archivo a nuestro
			// String declarado previamente
			
			// Para que, mientras haya líneas por leer, estas se visualicen
			while((linea = buffer.readLine()) !=null) { // Mientras sea diferente de nulo
				System.out.println(linea);
			}
			
			
		} catch (Exception e) { // Si algo ocurre, se atrapa aquí
			// y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			
			// Si queremos ver el error, imprimimos el mismo de donde
			// se guardó en el objeto "e"
			e.printStackTrace();
		}

	}

}
