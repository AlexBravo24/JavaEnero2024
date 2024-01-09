package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		//Uso de la clase FileWriter
		//para describir informacion en un archivo
		
		//Declaramos una cadena de texo para pasarla
		//como valor a nuestro archivo
		
		String texto = "\nPrueba Clase FileWriter";
		
		try {
			File archivo = new File("C:\\Users\\Invitado1\\Desktop\\texto.txt");
		    //ya que tenemos identidicado el archivo para escribir
			//hacemos uso de la clase FileWriter
			FileWriter line = new FileWriter (archivo, true); 
			//para respetar la inf se añade , true 
			//asi no lo reescribe.
			//procedemos a escribir la cadena de texto en el archivo
			line.write(texto);
			
			//confirmamos el cambio o guardado en el archivo
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//github primer vinculo, sing up, cuenta creada
	}

}
