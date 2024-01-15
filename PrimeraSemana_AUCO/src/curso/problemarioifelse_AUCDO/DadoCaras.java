package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class DadoCaras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int cara;
		
		System.out.println("Coloque el numero de cara");
		cara = sc.nextInt();
		
		switch (cara) {
			
		case 1:
			System.out.println("opuesto: SEIS");
			break;
		case 2:
			System.out.println("opuesto: CINCO");
			break;
		case 3:
			System.out.println("opuesto: CUATRO");
			break;
		case 4:
			System.out.println("opuesto: TRES");
			break;
		case 5:
			System.out.println("opuesto: DOS");
			break;
		case 6:
			System.out.println("opuesto: UNO");
			break;
			
			default:
				System.out.println("ERROR, numero incorrecto");
				break;	
		}

	}

}
