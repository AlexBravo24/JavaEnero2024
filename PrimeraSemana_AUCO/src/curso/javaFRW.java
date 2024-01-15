package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFRW {

	public static void main(String[] args) {
		
		//Uso de clases file, FileReader y BufferedReader
		//Vamos almacenar primero  un String donde almacenar
		
		String linea;
		
		//Muchas veces al intentar recuparar inf de un archivo esterno
		//que pueda tener error de comunicacion, hay que recurrir a la 
		//estructura try & catch
		
		try {
			//Class File - representa el archivo en memoria
			File archivo = new File("C:\\Users\\Lex\\Desktop\\Fichero.txt");
			
			//FileReader - permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader - puede leer el archivo
			BufferedReader buffer = new BufferedReader (fr);
			
			//Asignamos la linea de txt a nuestro archivo String declarado antes 
			
			//Mientras linea no sea igual a "null" seguira leyendo todo el archivo
			while((linea = buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			//por otro lado el comando sin un while lee una sola linea
			//linea = buffer.readLine();
			
			
			
		} catch (Exception e) { //Si algo ocurre se atrapa aqui
			//y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			e.printStackTrace();//Imprime el error mandado
		}
		
		
		
		
	}

}
