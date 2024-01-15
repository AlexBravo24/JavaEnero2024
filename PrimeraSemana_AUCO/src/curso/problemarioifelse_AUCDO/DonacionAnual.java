package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class DonacionAnual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int donacion, donacion2, salud, comedor, bolsa;
		
		System.out.println("Cuanto desea donar?");
		donacion = sc.nextInt();
		if (donacion >= 10000) {
			salud = (int) (donacion*0.30);
			comedor =(int) (donacion*0.50);
			donacion2= donacion-salud-comedor;
			System.out.println("La donacion total fue de de "+donacion+" euros");
			System.out.println("La cantidad para el centro de salud sera de "+salud+" euros");
			System.out.println("La cantidad para el comedor de niños sera de "+comedor+" euros");
			System.out.println("El restante de la donacion es de "+donacion2+" euros");
		}else if (donacion < 10000) {
			salud = (int) (donacion*0.25);
			comedor =(int) (donacion*0.60);
			donacion2= donacion-salud-comedor;
			System.out.println("La donacion total fue de de "+donacion+" euros");
			System.out.println("La cantidad para el centro de salud sera de "+salud+" euros");
			System.out.println("La cantidad para el comedor de niños sera de "+comedor+" euros");
			System.out.println("El restante de la donacion es de "+donacion2+" euros");
		}
	}

}
