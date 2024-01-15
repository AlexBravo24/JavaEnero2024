package ciclos.curso_AUCDO;

import java.util.Scanner;

public class Inversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double dinero;
		System.out.println("Cuanto desea invertir?");
		dinero = sc.nextDouble();
		int mes = 1;
		
		while (mes<=12) {
			dinero = dinero*1.2;
			mes++;
			System.out.println(dinero);
		}
		System.out.println(dinero);
	}

}
