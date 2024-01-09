package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

		public static void main(String [] args) {
			//File, FileReader y BufferedReader
			String linea = "";
			try {//Intentaremos ejecutar el siguiente código
				File archivo = new File("/Users/Roberto/Desktop/fichero.txt");
				FileReader fr = new FileReader(archivo);
				BufferedReader buffer = new BufferedReader(fr);
				
				while((linea = buffer.readLine()) != null) {
					System.out.println(linea);
				}
				
						
			}catch (Exception e) {
				System.out.println("Error al leer el archivo");
				e.printStackTrace();
			}		
		}
}
