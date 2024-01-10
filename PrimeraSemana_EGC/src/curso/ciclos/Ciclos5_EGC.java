package curso.ciclos;

import java.util.Scanner;

public class Ciclos5_EGC {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá
		 * al cabo de un año si todo el dinero lo reinvierte?
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Caunto desea invertir?");
		double inversion = scan.nextDouble();
		
		System.out.println("A cuantos meses?");
		int meses = scan.nextInt();
		int mes = 1;
		while(mes <= meses) {
			inversion = inversion + (inversion*.02);
			mes++;
		}
		System.out.printf("Después de "+ meses +" meses, la cantidad final sería: $" + inversion);

	}

}
