package ciclos.curso_AUCDO;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a, b;
		
		System.out.println("Que numero desea multiplicar?");
		a = sc.nextInt();
		
		System.out.println("Hasta que numero?");
		b = sc.nextInt();
		
		for (int i = 1; i <= b; i++) {
			System.out.println(i + "x" + a + " = "+i*a);
		}

	}

}
