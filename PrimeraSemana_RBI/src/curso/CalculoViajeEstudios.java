package curso;

import java.util.Scanner;

public class CalculoViajeEstudios {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        // Calcular el costo total para la compañía de autobuses
        double costoTotal = calcularCostoTotal(numeroAlumnos);

        // Calcular la cantidad que debe pagar cada alumno
        double costoPorAlumno = calcularCostoPorAlumno(numeroAlumnos);

        // Mostrar los resultados
        System.out.println("El costo total para la compañía de autobuses es: " + costoTotal + " euros");
        System.out.println("Cada alumno debe pagar: " + costoPorAlumno + " euros");

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para calcular el costo total para la compañía de autobuses
    public static double calcularCostoTotal(int numeroAlumnos) {
        if (numeroAlumnos >= 100) {
            // Más de 100 alumnos, costo por cada alumno es de 65 euros
            return numeroAlumnos * 65.0;
        } else if (numeroAlumnos >= 50) {
            // De 50 a 99 alumnos, costo por cada alumno es de 70 euros
            return numeroAlumnos * 70.0;
        } else if (numeroAlumnos >= 30) {
            // De 30 a 49 alumnos, costo por cada alumno es de 95 euros
            return numeroAlumnos * 95.0;
        } else {
            // Menos de 30 alumnos, costo de la renta del autobús es de 4000 euros
            return 4000.0;
        }
    }

    // Función para calcular el costo que debe pagar cada alumno
    public static double calcularCostoPorAlumno(int numeroAlumnos) {
        return calcularCostoTotal(numeroAlumnos) / numeroAlumnos;
    }
}

