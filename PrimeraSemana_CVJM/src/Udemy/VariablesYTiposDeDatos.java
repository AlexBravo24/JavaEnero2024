package Udemy;

public class VariablesYTiposDeDatos {

	public static void main(String[] args) {
		
		/*Reglas para definir el nombre de una variable
		 * 1. Puede contener letras, digitos, _ y $
		 * 2.Debe comenzar con una letra, _, $
		 * 3. Inicia con letra minuscula y sin espacios 
		 * 4. Es sensibla a mayusculas y minusculas
		 * 5. No se puede usar palabras reservadas (int, boolean, etc)
		
		 */
		
		
		
		// 1. Declarar e inicializar variables
		int miNumero=10;
		//2. Imprimir 
		System.out.println("Mi numero 1 es: "+ miNumero);
		
		int _miVariable=20;
				System.out.println("Mi numero 2 es: "+_miVariable);
				
		int $miVariable=30;
		System.out.println("Mi numero 3 es: "+ $miVariable);
		
		//Tamaño de VARIABLES
		
		//INT
		System.out.println("Entero tamaño bits: "+Integer.SIZE);
		System.out.println("Entero valor minimo: "+Integer.MIN_VALUE);
		System.out.println("Entero valor maximo: "+Integer.MAX_VALUE);
		
		//long
		System.out.println("Entero tamaño bits: "+Long.SIZE);
		System.out.println("Entero valor minimo: "+Long.MIN_VALUE);
		System.out.println("Entero valor maximo: "+Long.MAX_VALUE);
		
		//float
		System.out.println("Decimal tamaño bits: "+Float.SIZE);
		System.out.println("Decimal valor minimo: "+Float.MIN_VALUE);
		System.out.println("Decimal valor maximo: "+Float.MAX_VALUE);
		
		
		//Variable tipo VAR (a partir de la version 10 e JAVA)
		
		/* La variable tipo VAR es dinamica
		 * Este tipo puede identificar el tipo de variable que 
		 * se esta utilizando
		 * 
		 * Pero se tiene que establecer obligatoriamente el valor 
		 * de la variable
		 * 
		 * Se puede reemplazar cualquier tipo de variable primitiva
		 * por var
		 * 
		 */
		
		//CONSTANTES
		
		//Denifir constante (No se puede modificar el valor)
		
		final int Mi_constante =10;
		// Mi_constante =20; arroja error por querer cambiar el 
		// valor de la constante 
		System.out.println(Mi_constante);
		
		//Constante PI
		 final float Pi= 3.1416F;
		 System.out.println(Pi);
		 
		 //Constante PI de la clase Math
		 System.out.println("Constante Math.PI: " + Math.PI);
		 
		 // Constante segundos por minuto
		 final int SegundosPorMinuto= 60;
		 System.out.println("Constante segundos por minuto: " + SegundosPorMinuto);
		 
		 //INTRODUCIR VALORES
		 
		 

	}

}
