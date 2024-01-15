package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class EnviosMundo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int paquete;
		int zona;
		
		
		System.out.println("Cual es el peso de su paquete?");
			paquete = sc.nextInt();
		
		if (paquete <= 5 && paquete >=1) {
	
		}else {
			System.out.println("Lo sentimos, el paquete no cumple con nuestros parametros de seguridad");
		}
		
		System.out.println("Precione un numero deacuerdo al destino deseado: \n1.-America del norte \n2.-America del sur \n3.-America Central \n4.-Asia \n5.-Europa");
			
			zona = sc.nextInt();
		
		switch (zona) {
		
			case 1:
				System.out.println("El paquete con destino a Americe del norte tendra un cosot de "+(paquete*24)+" euros");
				break;
			case 2:
				System.out.println("El paquete con destino a Americe del sur tendra un cosot de "+(paquete*20)+" euros");
				break;
			case 3:
				System.out.println("El paquete con destino a Americe Central tendra un cosot de "+(paquete*21)+" euros");
				break;
			case 4:
				System.out.println("El paquete con destino a Asia tendra un cosot de "+(paquete*18)+" euros");
				break;
			case 5:
				System.out.println("El paquete con destino a Europa tendra un cosot de "+(paquete*10)+" euros");
				break;
			default:
				System.out.println("Lo sentimos, aun no llegamos ahi.");
				break;
			
		}
	}

}
