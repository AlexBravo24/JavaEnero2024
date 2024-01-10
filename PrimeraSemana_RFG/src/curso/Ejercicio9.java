package curso;

import java.util.Scanner;

public class Ejercicio9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número del 1 al 7 para representar el día de la semana: ");
	        int numeroDia = scanner.nextInt();
	        String diaSemana = "";

	        switch (numeroDia) {
	            case 1:
	                diaSemana = "Lunes";
	                break;
	            case 2:
	                diaSemana = "Martes";
	                break;
	            case 3:
	                diaSemana = "Miércoles";
	                break;
	            case 4:
	                diaSemana = "Jueves";
	                break;
	            case 5:
	                diaSemana = "Viernes";
	                break;
	            case 6:
	                diaSemana = "Sábado";
	                break;
	            case 7:
	                diaSemana = "Domingo";
	                break;
	            default:
	                System.out.println("ERROR: Número incorrecto. Debe ser entre 1 y 7.");
	                return;
	        }

	        System.out.println("El número " + numeroDia + " corresponde a " + diaSemana);
	    }
}
