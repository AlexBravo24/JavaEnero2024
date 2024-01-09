package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USO DE LAS CLASES File, FileReader y BufferedReader
		
		//vamos a crear un string donde almacenar la linea
		//o las lineas de texto por leer
		
		String linea;
		
		//En ocasiones, cuando intentamos recuperar informacion
		//de un archivo externo o conversion de datos
		//que pueda tener algun error de comunicacion
		//recurriremos a la estructura try & catch
		
		try { //intentaremos ejecutar el siguiente codigo
			//Clase file - Representar el archivo en memoria
			
			
			File archivo = new File("C:\\Users\\ferna\\OneDrive\\Escritorio\\fichero.txt");
			
			//Hay que abrirlo en modo lectura
			//FileReader - permite crear el archivo modo lectura
			
			FileReader fr = new FileReader(archivo);
			
			//Hay que comenzar a leerlo
			//BufferedReader - Puede leer el contenido
			
			BufferedReader buffer = new BufferedReader(fr);
			
			//Asignamos las lineas de texto en el archivo a nuestro String
			//declarado previamente
			//para que mientras haya lineas que leer, estas se visualicen
			while ((linea = buffer.readLine()) !=null){
			
				System.out.println(linea);
				
			}
						
		} catch (Exception e) {  //si algo ocurre, se atrapa aqui
			//ejecutamos lo siguiente
			
			System.out.println("no se pudo encontrar el archivo");
			//si queremos ver el error, imprimimos el mismo en ek qye se guardó el error
			e.printStackTrace();
		}

	}

}
while()