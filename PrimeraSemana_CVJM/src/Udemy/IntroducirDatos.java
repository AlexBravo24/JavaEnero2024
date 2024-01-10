package Udemy;

import java.util.Scanner;

public class IntroducirDatos {

	public static void main(String[] args) {
		
		// Se tiene que introducir un argumento para decir 
		//de donde la consola va a tomar la informacion 

	Scanner entrada= new Scanner(System.in);
	
	// No see tiene que introducir un argumento
	
	IntroducirDatos objeto2= new IntroducirDatos();
	
	
	//PARA CAMBIAR UNA VARIABLE DE TIPO STRING A TIPO INT
	
	//Se utiliza para solo usar el metodo .nextLine y no tener 
	//que agregar "entrada.nextLine();" nuevamente para que haga 
	//un salto de linea y poder introducir los valores de la cadena
	
	//int entero =Integer.parseInt(consola.nextLine());
	//Clase:Integer
	//Método:parseInt
	
	
	System.out.println("Introduce un numero: ");
	int numero= Integer.parseInt(entrada.nextLine());

	System.out.println("Introduce otro numero: " );
	int numero2= Integer.parseInt(entrada.nextLine());
	
	System.out.println("La suma de los dos numeros es: " + (numero+numero2));
	
	
	
	System.out.println("Introduce tu nombre: ");

	
	String nombre = entrada.nextLine();
	
	System.out.println("Tu nombre es: " + nombre);
	
	//Para ahorrarnos una variable para guardar info
	
	System.out.print("Proporciona un numero: ");
	int x = new Scanner (System.in).nextInt();
	
	//System.out.print("Proporciona un numero: ");
	//int x = Interger.parseInt(new Scanner (System.in).nextLine());
		
		
	}

}
