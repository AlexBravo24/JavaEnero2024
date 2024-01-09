package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		//Uso de las clases File, FileReader y BufferedReader
		
		//Vamos a declarar primero un string donde almacenar
		//la linea o lineas de texto por leer
		String linea;
		
		//Muchas veces, cuando intentamos recuperar info 
		//de un archivo externo o conversion de datos que 
		//que pueda tener algun "error" de comunicacion 
		//recurriremos a la esctructura try & catch
		
		try { //intentaremos el siguiente codigo
			//clase File- Representar el archivo en memoria
			File archivo = new File("C:\\Users\\Invitado1\\Desktop\\texto.txt"); //importar click derecho
			
			//FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader (archivo);
			
			//bufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Asignamos la lineas de texto en el archivo a nuestro
			//String declarado previamente
			//para que mientras haya lineas por leer, estas se visualicen 
			while ((linea = buffer.readLine()) !=null) {
			
			//linea = buffer.readLine();
			System.out.println(linea);
			}
		    } catch (Exception e) { //si algo ocurre, se atrapa aqui
			//y ejecutamos lo siguiente
			// TODO: handle exception
		    	System.out.println("No se pudo encontrar el Archivo"); 
		    	
		    //Si queremos ver el error, imprimimos el mismo de donde se guardo en el objeto
		    	e.printStackTrace();
		    
		}

	}

}
