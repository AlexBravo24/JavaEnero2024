package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int mes;
		
		System.out.println("elija un mes del 1 al 12");
		mes = sc.nextInt();
		
		
		switch (mes) {
		
		
		case 1:
			System.out.println("Enero: 31 dias");
			break;
		case 2:
			System.out.println("Febrero: 29 dias");
			break;
		case 3:
			System.out.println("Marzo: 31 dias");
			break;
		case 4:
			System.out.println("Abril: 30 dias");
			break;
		case 5:
			System.out.println("Mayo: 31 dias");
			break;
		case 6:
			System.out.println("Junio: 30 dias");
			break;
		case 7:
			System.out.println("Julio: 31 dias");
			break;
		case 8:
			System.out.println("Agosto: 31 dias");
			break;
		case 9:
			System.out.println("Septiembre: 30 dias");
			break;
		case 10:
			System.out.println("Octubre: 31 dias");
			break;
		case 11:
			System.out.println("Noviembre: 30 dias");
			break;
		case 12:
			System.out.println("Diciembre: 31 dias dias");
			break;
		
			default:
				System.out.println("Error de mes");
				break;
		}
	}

}
