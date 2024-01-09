package com.condicionales;

import java.util.Scanner;

public class Condicionales13_EGC {

	public static void main(String[] args) {
//		13. Una institución benéfica recibe anualmente una 
//		donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo 
//		invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donación es de $10000 o más: 30% 
//		se destina al centro de salud, 50% al comedor de niños 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donación es menor que $10000: 25% se 
//		destina al centro de salud, 60% al comedor de 
//		niños y el resto se invierte en la bolsa.
//		La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		Scanner scan = new Scanner(System.in);
		System.out.println("De cuanto es la donación?");
		double donacion = scan.nextDouble();
		double centroSalud = 0;
		double comedor = 0;
		double bolsa = 0;
		double inversion = 0;
		if (donacion >= 10000) {
			centroSalud = 0.25 * donacion;
			comedor = 0.6 * donacion;
			inversion = (donacion - (centroSalud + comedor));
		} else {
			centroSalud = 0.3 * donacion;
			comedor = 0.5 * donacion;
			inversion = (donacion - (centroSalud + comedor));
		}
		System.out.println("Este año la donación fue de $" + donacion + " por lo que un total"
				+ " de $" + centroSalud + " serán destinados al centro de salud, $" + comedor +
				" seran destinados al comedor de niños y $" + inversion + " será invertido en la bolsa.");
	}

}
