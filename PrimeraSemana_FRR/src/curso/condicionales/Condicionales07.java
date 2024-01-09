package curso.condicionales;

import java.util.Scanner;

public class Condicionales07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de pasajeros en el viaje");
		
		int pasajeros = entrada.nextInt();
		
		if (pasajeros > 100) {
			System.out.println("el precio por pasajero es de $65 euros, el costo total del viaje es $" + 65 * pasajeros);
		} else if (pasajeros < 100 && pasajeros > 49) {
			System.out.println("el precio por pasajero es de $70 euros, el costo total del viaje es $" + 70 * pasajeros);
		} else if (pasajeros < 50 && pasajeros > 29) {
			System.out.println("el precio por pasajero es de $95 euros, el costo total del viaje es $" + 95 * pasajeros);
		} else {
			System.out.println("el precio por pasajero es de " + 4000 / pasajeros + " 80el costo total del viaje es $4000");
		}

	}

}
