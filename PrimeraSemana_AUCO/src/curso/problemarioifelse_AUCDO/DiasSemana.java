package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int dia;
		
		System.out.println("elija un dia de la semana del 1 al 7");
		dia = sc.nextInt();
		
		switch (dia) {
		
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabada");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			
			default:
				System.out.println("Error de dia");
				break;
		}
		
	}

}
