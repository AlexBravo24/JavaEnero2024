package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_FRR {
 
		//PROGRAMA QUE DETERMINA SI UNA PALABRA ES UN PALINDROMO
	
	public static void main(String[] args) {
		
		System.out.println("ingrese una palabra");
		
		Scanner entrada = new Scanner(System.in);
	
        String cadena = entrada.nextLine();
        
        String cadenaInvertida = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");

}
}
}