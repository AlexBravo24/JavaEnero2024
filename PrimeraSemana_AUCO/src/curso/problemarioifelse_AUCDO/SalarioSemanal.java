package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class SalarioSemanal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas, extras;
		System.out.println("Cuantas horas trabajo?");
		horas = sc.nextInt();
		
		if (horas <= 40) {
			System.out.println("Su salrio semanal es de "+horas*16);
		}else {
			extras = horas - 40;
			horas = (40*16)+(extras*20);
			System.out.println("Su salariom semanal es de "+horas);
		}
		
	}

}
