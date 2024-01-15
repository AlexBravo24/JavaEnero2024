package curso.condicionales;

import java.util.Scanner;

public class Condicionales13_AMGC {

	public static void main(String[] args) {
		/* 13. Una institución benéfica recibe anualmente una donación proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte
		 * en la bolsa de acuerdo a lo siguiente:
		 * 
		 * Si el monto de la donación es de $10000 o más:
		 * * 30% se destina al centro de salud,
		 * * 50% al comedor de niños y
		 * * el resto se invierte en la bolsa.
		 * 
		 * Si el monto de la donación es menor que $10000:
		 * * 25% se destina al centro de salud
		 * * 60% al comedor de niños y
		 * * el resto se invierte en la bolsa.
		 * 
		 * La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double donacion;
		double salud;
		double niños;
		double bolsa;
		
		System.out.println("Ingrese la donación anual recibida:");
		donacion = entrada.nextInt();

		
		if (donacion>=10000) {
			salud = donacion * 0.30;
			niños = donacion * 0.50;
			bolsa = donacion * 0.20;
		} else {
			salud = donacion * 0.25;
			niños = donacion * 0.60;
			bolsa = donacion * 0.15;
		}
		
		System.out.println("Anualmente cada rubro recibirá las siguientes cantidades:");
		System.out.println("Centro de salud: $" + salud);
		System.out.println("Comedor de niños: $" + niños);
		System.out.println("Inversión en bolsa: $" + bolsa);
	}

}
