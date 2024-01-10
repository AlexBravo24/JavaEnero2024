package curso.condicionales;

import java.util.Scanner;

public class Condicionales10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un mes del año (numero del 1 al 12)");
				int mes = entrada.nextInt();
				
		switch (mes) {
		case 1:
			System.out.println("enero tiene 31 días");
			break;
		case 2:
			System.out.println("febrero tiene 28 o 29 días");
			break;
		case 3:
			System.out.println("marzo tiene 31 días");
			break;
		case 4:
			System.out.println("abril tiene 30 días");
			break;
		case 5:
			System.out.println("mayo tiene 31 días");
			break;
		case 6:
			System.out.println("junio tiene 30 días");
			break;
		case 7:
			System.out.println("julio tiene 31 días");
			break;
		case 8:
			System.out.println("agosto tiene 31 días");
			break;
		case 9:
			System.out.println("spetiembre tiene 30 días");
			break;
		case 10:
			System.out.println("octubre tiene 31 días");
			break;
		case 11:
			System.out.println("noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("diciembre tiene 31 días");
			break;
		default:
			System.out.println("no existe ese mes");
			break;
		}
				
				

	}

}
