package curso.condicionales;

import java.util.Scanner;

public class Condicionales13_LDGR {

	public static void main(String[] args) {
		
//		Una institución benéfica recibe anualmente una donación proveniente 
//		de Europa y lo reparte entre un centro de salud, un comedor de niños 
//		y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			
//			Si el monto de la donación es de $10000 o más: 30% se destina al
//			centro de salud, 50% al comedor de niños y el resto se invierte 
//			en la bolsa.
//			
//			Si el monto de la donación es menor que $10000: 25% se destina al
//			centro de salud, 60% al comedor de niños y el resto se invierte 
//			en la bolsa.
//			
//			La institución desea saber cuánto de dinero destinará a 
//			cada rubro anualmente.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el monto de su donación:");
		int donacion = entrada.nextInt();
		
		if(donacion>=10000) {
			System.out.println("Centro de salud: $" + (donacion*0.30));
			System.out.println("Comedor de niños: $" + (donacion*0.50));
			System.out.println("Inversión en la bolsa: $" + (donacion*0.20));
		}
		
		if(donacion<10000) {
			System.out.println("Centro de salud: $" + (donacion*0.25));
			System.out.println("Comedor de niños: $" + (donacion*0.60));
			System.out.println("Inversión en la bolsa: $" + (donacion*0.15));
		}

	}

}
