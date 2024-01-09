package curso.condicionales;

import java.util.Scanner;

public class condicionales1_JLT {

	
	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales

	Scanner entrada = new Scanner(System.in);

	int x;
	int y;
	
	System.out.println("ESTE PROGRAMA COMPARA SI 2 NUMEROS SON IGUALES O CUAL DE ELLOS ES MAYOR");
	System.out.println("Ingresa el primer valor");
	x= entrada.nextInt();
	System.out.println("Ingresa el segundo valor");
	y= entrada.nextInt();
	
	if(x==y)
		 System.out.println(  x + " es igual al numero " + y );
		else
		 {
			if(x>y)
				System.out.println( x + " es mayor que el numero " + y);
			else
				System.out.println( x + " es menor que el numero " + y);
	}
	
	}
}
