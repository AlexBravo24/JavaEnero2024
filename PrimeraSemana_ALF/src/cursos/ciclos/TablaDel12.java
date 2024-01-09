package cursos.ciclos;

import java.util.Scanner;

public class TablaDel12 {
	//1.- Programa un algoritmo que realice la tabla de multiplicar del 12 

	public static void main(String[] args) {
		System.out.println("Tabla de multiplicar del número 12");
//		Scanner entrada= new Scanner(System.in);
//		System.out.println("Intoruce un numero positivo");
//		int n1 = entrada.nextInt();
//		
		int n1 = 12;
		for (int n2 = 1; n2 <=10; n2++) {
			
			System.out.println(n1+" x "+n2+" = "+ (n1*n2));
		}
	}

}
