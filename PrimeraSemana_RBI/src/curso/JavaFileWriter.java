package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir informacion en un archivo 
		
		//Declaramos una cadena de texto para pasarla como valor a nuestro archivo
		String texto = "\nPrueba Clase FileWriter";
		
		try {
			File archivo = new File("C:\\Users\\pc\\Desktop\\fichero.txt");
			
			//Ya que tenemos identificado el archivo para escribir hacemos uso de la clase FileWriter
			FileWriter line = new FileWriter(archivo, true);
			//Para que se respete el contenido del archivo, indico true para que no sobreescriba, si no que 
			//añada la informacion unicamente 
			
			//Procedemos a escribir el texto en la cadena de texto en el archivo
			
			line.write(texto);
			
			//confirmamos el cambio o el guardado en el archivo
			line.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
