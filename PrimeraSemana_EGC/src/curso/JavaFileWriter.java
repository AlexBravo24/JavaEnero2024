package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter
		// Para escribir informacion en un archivo

		// declaramos una cadena de texto para pasarla
		// como valor a nuestro archivo

		String texto = "\nPrueba Clase FileWriter 2";// Se utiliza \n para salto de linea

		try {
			File archivo = new File("C:\\Users\\USER1\\Desktop\\CursoCETEQRemoto\\DÍA 4\\fichero.txt");

			// ya que tenemos identificado el archivo para escribir
			// hacemos uso de la clase FileWriter
			FileWriter line = new FileWriter(archivo, true);
			//para que se respete el contenido del archivo indico
			// true para que no sobreescriba sino que añada la informacion
			
			//procedemos a escribir la cadena de texto en el archivo
			line.write(texto);
			
			//confirmamos el cambio en el archivo con:
			line.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
	}

}
