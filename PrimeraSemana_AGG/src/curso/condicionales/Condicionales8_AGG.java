package curso.condicionales;

import java.util.Scanner;

public class Condicionales8_AGG {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero
		//en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		//Nota1:En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		//Nota2:Si el n�mero del dado introducido es menor que 1 o mayor que 6,
		//se mostrar� el mensaje: �ERROR: n�mero incorrecto�.

		Scanner entrada=new Scanner(System.in);
		
		int resultado;
		
		System.out.println("Introduce el resultado del lanzamineto:");
		resultado=entrada.nextInt();
		
		if (resultado==1)
			{System.out.println("La cara opuesta es: seis");}
		if(resultado==2)
			{System.out.println("La cara opuesta es: cinco");}
		if(resultado==3)
			{System.out.println("La cara opuesta es: cuatro");}
		if(resultado==4)
			{System.out.println("La cara opuesta es: tres");}
		if(resultado==5)
			{System.out.println("La cara opuesta es: dos");}
		if(resultado==6)
			{System.out.println("La cara opuesta es: uno");}
		if(resultado<1 || resultado>6)
			{System.out.println("ERROR: n�mero incorrecto");}
		
	}

}
