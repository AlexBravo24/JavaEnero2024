package curso.condicionales;

import java.util.Scanner;

public class Condicionales13_AMGC {

	public static void main(String[] args) {
		/* 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte
		 * en la bolsa de acuerdo a lo siguiente:
		 * 
		 * Si el monto de la donaci�n es de $10000 o m�s:
		 * * 30% se destina al centro de salud,
		 * * 50% al comedor de ni�os y
		 * * el resto se invierte en la bolsa.
		 * 
		 * Si el monto de la donaci�n es menor que $10000:
		 * * 25% se destina al centro de salud
		 * * 60% al comedor de ni�os y
		 * * el resto se invierte en la bolsa.
		 * 
		 * La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double donacion;
		double salud;
		double ni�os;
		double bolsa;
		
		System.out.println("Ingrese la donaci�n anual recibida:");
		donacion = entrada.nextInt();

		
		if (donacion>=10000) {
			salud = donacion * 0.30;
			ni�os = donacion * 0.50;
			bolsa = donacion * 0.20;
		} else {
			salud = donacion * 0.25;
			ni�os = donacion * 0.60;
			bolsa = donacion * 0.15;
		}
		
		System.out.println("Anualmente cada rubro recibir� las siguientes cantidades:");
		System.out.println("Centro de salud: $" + salud);
		System.out.println("Comedor de ni�os: $" + ni�os);
		System.out.println("Inversi�n en bolsa: $" + bolsa);
	}

}
