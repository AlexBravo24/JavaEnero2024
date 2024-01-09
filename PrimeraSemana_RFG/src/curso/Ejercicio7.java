package curso;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        int costoAlumno = 0;
        int costoTotal;

        if (cantidadAlumnos >= 100) {
            costoAlumno = 65;
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoAlumno = 70;
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoAlumno = 95;
        }

        if (cantidadAlumnos < 30) {
            costoTotal = 4000;
        } else {
            costoTotal = cantidadAlumnos * costoAlumno;
        }

        System.out.println("El costo por alumno es de: " + costoAlumno + " euros");
        System.out.println("El pago a la compañía de autobuses es de: " + costoTotal + " euros");
    }
}
