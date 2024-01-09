package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// uso de las clases File, FileReader y BufferedReader
		
		//Vamos a declarar primero un string donde almacenar la linea o lineas de texto po r leer
		String linea;
		
		//Muchas veces, cuando intentamos recuperar informacion de un archivo externo
		//o conversion de datos que pueda tener algun "error" de comunicacion recurriremos
		// a la estructura try & catch
		
		try { //Intentaremos ejecutar el siguiente codigo 
			//Clase File - Representar el archivo en memoria
			
			File archivo = new File("C:\\Users\\pc\\Desktop\\fichero.txt");
			
			//FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader  - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Asignamos la linea de tecto en el archivo a nuestro String declarado previamente
			//Para que mientras haya lineas por leer, estas se visualizen 
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);	
			}
			
			
			
		} catch (Exception e) { //Si algo ocurre, se atrapa aqui y ejecutamos lo siguiente
			
			System.out.println("No se puedo encontrar el archivo");
			e.printStackTrace();
		}

	}

}
