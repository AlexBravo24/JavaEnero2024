package curso.condicionales;

import java.util.Scanner;

public class Condicionales1_CVJM {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por 
		//teclado e indique cuál es mayor o si son iguales. 
		
	
		System.out.println("Introduce el primero numero");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println("Introduce el segundo numero");
		int b = new Scanner(System.in).nextInt();
		
		if (a>b) { 
			System.out.println("El numero a= "+a+ " es mayor que el numero b= "+ b);
		} else if  (a<b) {
			System.out.println("El numero b= "+b+ " es mayor que el numero a= " + a);
		}else {
			System.out.println("El numero a= "+a+" y b= "+b+" son iguales");}
	
		
		
		
		
		
	}

}
