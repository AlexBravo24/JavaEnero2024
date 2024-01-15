package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class AlumnosBus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int alumnos, bus;
		bus = 4000;
		System.out.println("Seleccione el numero de alumnos");
		alumnos = sc.nextInt();
		
		
		if (alumnos >=100) {
			System.out.println("Cada alumno deberan pagar 65 euros c/u y en total: "+(alumnos*65)+" euros");
		}else if (alumnos >=50 && alumnos<=99) {
			System.out.println("Los alumnos deberan pagar 70 euros c/u y en total "+(alumnos*70)+" euros");	
		}else if (alumnos >=30 && alumnos<=49) {
			System.out.println("Los alumnos deberan pagar 95 euros c/u y en total "+(alumnos*70)+" euros");
		}else if (alumnos <=30) {
			System.out.println("Los alumnos deberan pagar "+(bus/alumnos)+" euros c/u");
		}

	}

}
