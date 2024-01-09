package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		
		// Uso de la clase FileWriter
		//Para escribir infromación en un archivo
		
		//Declaramos una cadena de texto para pasarla como valor a nuestro archivo
		String texto = "\nPrueba Clase FileWriter";
		
		try {
			//Representar el archivo en memoria
			File archivo = new File("C:\\Users\\cinte\\Desktop\\fichero.txt");
			
			//Ya que tenemos identificado el archivo para escribir, hacemos uso de la clase
			//FileWriter
			
			//FileWriter line = new FileWriter(archivo); //No respetaría el contenido del archivo, lo borra
			//Al agregar "true", respeta el contenido del archivo, no borra, solo añade información:
			FileWriter line = new FileWriter(archivo, true);
			
			//Procedemos a escribir la cadena de texto en el archivo
			line.write(texto);
			
			//Confirmamos el cambio o el guardado en el archivo
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
