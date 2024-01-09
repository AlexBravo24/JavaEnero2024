package curso;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número obtenido al lanzar el dado (entre 1 y 6): ");
        int numeroDado = scanner.nextInt();

        String caraOpuesta = "";

        switch (numeroDado) {
            case 1:
                caraOpuesta = "Seis";
                break;
            case 2:
                caraOpuesta = "Cinco";
                break;
            case 3:
                caraOpuesta = "Cuatro";
                break;
            case 4:
                caraOpuesta = "Tres";
                break;
            case 5:
                caraOpuesta = "Dos";
                break;
            case 6:
                caraOpuesta = "Uno";
                break;
            default:
                System.out.println("ERROR: Número incorrecto. Debe ser entre 1 y 6.");
                return;
        }

        System.out.println("La cara opuesta es: " + caraOpuesta);
    }

}
