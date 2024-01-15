package curso;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaFileWriter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Uso de clase File Wriote para escribir en unarchivo txt
		
		//declaramos una cadena de texto
//		String texto = "\nPrueba";
		String texto;
		
		System.out.println("\n");
		System.out.println("Escribre...");
		texto = sc.next();
		
		try {
			//direccion del archivo
			File archivo = new File("C:\\Users\\Lex\\Desktop\\Fichero.txt");
			
			//uso de FileWrite
			FileWriter line = new FileWriter(archivo, true);
			//True es para que respete el contenido pasado y no sobreescriba, solo añada aparte.
			
			//Escribimos
			line.write(texto);
			
			//Confirmamos el cambio (guardamos)
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
