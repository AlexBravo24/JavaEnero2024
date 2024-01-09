package com;

import java.util.Scanner;// este paquete nos sirbe para introducir datos por teclado

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ENTRADA DE DATOS POR TECLADOS
		 * Utilizamos la clase llamada Scnner*/
		//se posiciona el cursor en la pala scanner eh importamos el paquete llamado java.util.scanner
//		Scanner entrada = new Scanner(System.in);
//		
//		//introducir datos por medio del teclado
//		int numero;
//		System.out.println("Introduce un numero entero:");
//		numero=entrada.nextInt();
//		System.out.println("Introduce otro numero entero:");
//		int numero2 = entrada.nextInt();
//		System.out.println("La suma de ambos numeros es: "+ (numero+numero2));
//		
//		String nombre;
//		System.out.println("Introduce tu nombre:");
//		entrada.nextLine();//El metodo nextLine consume los espacios y reinicia la variable para volver a guardar
//		// en este caso un dato del tripo string o texto segun se necesite
//		nombre = entrada.nextLine();
//		System.out.println("Tu nombre es :"+ nombre);
		
		// para comentar todo seleccionamos lo que queremos comentar y ctrl+7
		
		/*OPERADOR DE MODULO DE DIVISOR*/
		
		int n1 = 10;
		int divisor = 2;
		int resultado = n1/divisor;
		int residuo =  n1%divisor;

		//El opreador % devuelve el residuo de la division 
		System.out.println("El resultado es : "+ resultado + " y el residuo es: " + residuo);
		
		
		
		
		

	}

}
