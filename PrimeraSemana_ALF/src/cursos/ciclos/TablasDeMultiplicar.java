package cursos.ciclos;

import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		
		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("Elija el rango de los numeros a multiplicar");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		int n1 = entrada.nextInt();
		System.out.println("Introduce por cual lo quieres multiplicar");
		int n2 = entrada.nextInt();
		
		for (int n3 = 1 ; n3 <= n2; n3++) {
			
			System.out.println(n1+" x "+n3+" = "+ (n1*n3));
		}

	}

}
