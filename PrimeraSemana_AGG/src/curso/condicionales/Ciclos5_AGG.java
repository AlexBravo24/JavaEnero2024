package curso.condicionales;

import java.util.Scanner;

public class Ciclos5_AGG {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año
		//si todo el dinero lo reinvierte?
	
		Scanner entrada=new Scanner(System.in);
		
		double inversion;
		double interes=0.02;
		int mes;
		System.out.println("Cuanto deseas invertir?");
		inversion=entrada.nextInt();
		System.out.println("A cuantos meses deseas tu inversión?");
		mes=entrada.nextInt();
		
		for (int r=1; r<=mes; r++)   //r=réditos
		{inversion =(inversion+(inversion*interes));
		
		System.out.println("mes "+ r + " tu total es de: " + inversion);
		}		
				
	}

}
