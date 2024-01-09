package curso;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la donaci�n anual: ");
        double montoDonacion = scanner.nextDouble();

        double centroSalud;
        double comedorNinos;
        double inversionBolsa;

        if (montoDonacion >= 10000) {
            centroSalud = montoDonacion * 0.30;
            comedorNinos = montoDonacion * 0.50;
            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
        } else {
            centroSalud = montoDonacion * 0.25;
            comedorNinos = montoDonacion * 0.60;
            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
        }

        System.out.println("El centro de salud recibir�: $" + centroSalud);
        System.out.println("El comedor de ni�os recibir�: $" + comedorNinos);
        System.out.println("La inversi�n en bolsa ser� de: $" + inversionBolsa);
    }
}
