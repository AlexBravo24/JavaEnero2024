package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class AceptarSolicitud {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota, edad, sexo;
		String nombre;
		
		System.out.println("Agregue su nombre");
		nombre = sc.next();
		System.out.println("Ingrese 1 para Masculino o 2 para Femenino segun sea su caso");
		sexo = sc.nextInt();
		System.out.println("Agregue sus notas");
		nota = sc.nextInt();
		
		if (nota >= 7) {
			System.out.println("Agregue una edad");
				edad = sc.nextInt();
				if (edad >=18) {
					System.out.println("Usd Ha sido aceptdo");
				} else {
					System.out.println("A sido rechazado, usd debe ser mayor de edad");
				}
		} else {
			System.out.println("A sido rechazado. mejore sus notas y vuelva a intentar");
		}

	}

}
