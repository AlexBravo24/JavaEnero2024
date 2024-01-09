package curso.condicionales;

import java.util.Scanner;

public class Condicionales11_LDGR {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ZONA UBICACIÓN       - COSTO/KILOGRAMO");
		System.out.println("1. América del Norte - 24,00 euros");
		System.out.println("2. América Central   - 20,00 euros");
		System.out.println("3. América del Sur   - 21,00 euros");
		System.out.println("4. Europa            - 10,00 euros");
		System.out.println("5. Asia              - 18,00 euros");
		
		double an=1;
		double ac=2;
		double as=3;
		double e =4;
		double a =5;
		
		
		System.out.println("Ingrese el número de zona de envío (del 1 al 5):");
		int numero = entrada.nextInt();
		
		System.out.println("Ingrese el peso en kg de su paquete:");
		int peso = entrada.nextInt();
		
		if(peso<=5 && numero==an) {
			System.out.println("Su costo de envío sería:");
			System.out.println((24.00*peso) + " euros");
		}
		
		if(peso<=5 && numero==ac) {
			System.out.println("Su costo de envío sería:");
			System.out.println((20.00*peso) + " euros");
		}
		
		if(peso<=5 && numero==as) {
			System.out.println("Su costo de envío sería:");
			System.out.println((21.00*peso) + " euros");
		}
		
		if(peso<=5 && numero==e) {
			System.out.println("Su costo de envío sería:");
			System.out.println((10.00*peso) + " euros");
		}
		
		if(peso<=5 && numero==a) {
			System.out.println("Su costo de envío sería:");
			System.out.println((18.00*peso) + " euros");
		}
		
		if(peso>5) {
			System.out.println("Los paquetes con un peso superior a 5 kg no son transportados, por \r\n" + 
					"cuestiones de logística y seguridad");
		}
		

	}

}
