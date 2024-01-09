package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		// Para escribir una informacion en un archivo
		
		//Declaramos una cadena de texto para pasarla
		//como valor a nuestro archivo
		
		String texto = "\nPrueba Clase FileWriter";
		
		try {
			File archivo = new File("C:\\Users\\HP\\Desktop\\fichero.txt");	
		//Ya que tenemos identificado el archivo para escribir
		//hacemos uso e la clase FileWriter
		FileWriter line = new FileWriter(archivo, true);
		//Para que se respete el contenido del archivo, indico true
		//para que no lo sobreescriba, sino que añada la info unicamente
		
		//Procedemos a escribir en la cadena de texto en el arhivo
		line.write(texto);
		
		//confirmamos el cambio o el guardado en el archivo
		line.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
