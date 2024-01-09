package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USO DE LA CASE FileWriter
		//para escrbir en un archivo
		
		//declaramos una cadena de texto para pasarla como valor a nuestro archivo
		
		String texto = "\nPrueba CLase FileWriter";
		
		try {
			
		File archivo = new File("C:\\Users\\ferna\\OneDrive\\Escritorio\\fichero.txt");
		
		//ya que tenemos identificado el archivo para escribir
		//hacemos uso de la clase filewriter
		
		FileWriter line = new FileWriter(archivo, true);
		//para que se respete el contenido del archivo, indico true
		//para que no lo sobreescriba, si no para que añada la informacion unicamente
		
		//procedemos a escribir el texto en el archivo		
		line.write(texto);
		
		//confirmamos el cambio o el guardado en el archivo		
		line.close();
			
		} catch (Exception e) {
			System.out.println("No se encontró el archivo especificado");
			e.printStackTrace();
		}

	}

}
