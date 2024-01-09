package curso;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//ENTRADA DE DATOS POR TELCLADO
		//UTILIZAMOS A LA CLASE SCANNER
		
		Scanner entrada = new Scanner(System.in);
		/*una vez que podemos ingresar datos con el teclado, se guardan
		 * temporalmente, por lo que hay que buscar las variables
		 * adecuadas para guardar esos datos
		 */
		
		int numero;
		System.out.println("introduce un numero");
		numero=entrada.nextInt();
		
		System.out.println("introduce otro numero");
		int numero2=entrada.nextInt();
		
		System.out.println("la suma de ambos numeros es: " + (numero+numero2));
		
		String nombre;
		
		System.out.println("escribe tu nombre");
		entrada.nextLine(); //metodo .nextLine para poder ingresar mas de una palabra
		/*El metodo .nextLine, nos permite consumir los espacios 
		 * que obviamente tambien son caracteres. En ocasiones, cuando ya utilizamos el scanner, se queda
		 * "volando" un espacio en buffer y cuando entra en accion lo que hace es consumir ese espacio vacío
		 */
		nombre=entrada.nextLine();
		System.out.println("tu nombre es: " +nombre);
		
	int n = 10;
	
	int divisor = 3;
	//el simbolo / solo te hace divisiones con numeros enteros exactos, sin embargo con los demcimales
	//te lo redondea al inmediato inferior
	//si utilizamos el operador mobulo "%" te devuelve el valor del residuo de la division
	int resultado = (n/divisor);
	
	System.out.println(resultado);
	
	
	
		
	}

}
