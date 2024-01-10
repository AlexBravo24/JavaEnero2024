package curso;

import java.util.Scanner;

public class Ejercicio9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un n�mero del 1 al 7 para representar el d�a de la semana: ");
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
	                diaSemana = "Mi�rcoles";
	                break;
	            case 4:
	                diaSemana = "Jueves";
	                break;
	            case 5:
	                diaSemana = "Viernes";
	                break;
	            case 6:
	                diaSemana = "S�bado";
	                break;
	            case 7:
	                diaSemana = "Domingo";
	                break;
	            default:
	                System.out.println("ERROR: N�mero incorrecto. Debe ser entre 1 y 7.");
	                return;
	        }

	        System.out.println("El n�mero " + numeroDia + " corresponde a " + diaSemana);
	    }
}
