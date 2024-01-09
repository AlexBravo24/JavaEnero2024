package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter
		//para escribir informacion en un archivo
		
		//delcaramos una cadena de texto para pasarla como 
		//valor a nuestro archivo
		
		String texto="\nPrueba Clase FileWriter"; // la \n es para darle un salto de linea
		
		try {
			File archivo=new File("C:\\Users\\ye957\\Desktop\\fichero.txt");
			
			//ya que tenemos identificado el archivo para escribir
			//Hacemos uso de la clase FileWriter
			FileWriter line=new FileWriter(archivo,true); //para que se respete el contenido
			//del archivo, indico "true" para que no lo sobreescriba, si no que añada la 
			//informacion unicamente
			
			//procedemos a escribir el o l acadena de texto en el archivo
			
			line.write(texto);
			
			//confirmamos el cambio o el guardado en el archivo
			
			line.close();
			
			
		} catch (Exception e) {
			e.printStackTrace(); //con printStackTrace, se imprime el error que tengamos
		}
	}

}
