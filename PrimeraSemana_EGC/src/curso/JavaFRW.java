package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File,
		// FileReader y BufferedReader
		// vamos a declarar un String donde
		// almacenar la o las líneas de texto
		// por leer

		String line;

		// Muchas veces cuando intentamos recuperar
		// Informacion de un archivo externo
		// o conversion de datos
		// que pueda tener algún "error" de
		// comunicacion recurriremos a la
		// estructura try & catch

		try {// Intentaremos ejecutar el siguiente codigo
				// clase File - Representar al archivo en memoria

			File archivo = new File("C:\\Users\\USER1\\Desktop\\CursoCETEQRemoto\\DÍA 4\\fichero.txt");

			// FileReader nos permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);

			// BufferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);

			// asignamos la linea de texto en el archivo
			// a nuestro String declarado previamente
			// line = buffer.readLine(); para imprimir solo 1 línea
			// para que mientras haya lineas por leer,
			// estas se visualicen

			while ((line = buffer.readLine()) != null) {
				
				System.out.println(line);
			}

		} catch (Exception e) {// Si algo ocurre, se atrapa aqui
			// y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			e.printStackTrace();// imprime trace del error

		}

	}

}
