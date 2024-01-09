package curso;

import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//Vamos a declarar primero un string donde almacenar 
		//la linea o lineas de texto por leer
		
		String linea;
		
		//muchas veces, cuando intentamos recuperar info
		//de un archivo externo o conversacion de datos
		//que pueda tener algun "error" de comunicacion
		//recurriremos a la estructura try & catch (se oprime try + ctrl+espacio)
		
		try {//intentaremos ejecutar el siguiente codigo
			//Clase File - Representar el archivo en memoria
			File archivo=new File("C:\\Users\\ye957\\Desktop\\fichero.txt");
			
			//FileReader - nos permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader - puede leer el contenido del archivo
			
			BufferedReader buffer = new BufferedReader(fr);
			//asignamos la linea de texto en el archivo
			//a nuestro string declarado previamente
			//para que mientras haya lineas por leer, estas se visualicen
			
			while((linea=buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			linea=buffer.readLine();
			
			System.out.println(linea);
			
			
		} catch (Exception e) {//si algo ocurre, se atrapa aqui
			//y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			//si queremos ver el error, imprimimos el mismo de donde se guardo 
		}

	}

}
