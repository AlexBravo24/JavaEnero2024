package curso;

import java.util.Scanner;

public class AceptacionSolicitud {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la edad
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese la nota
        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();

        // Solicitar al usuario que ingrese el sexo (M o F)
        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        // Calcular la aceptación de la solicitud
        String resultado = calcularAceptacion(edad, nota, sexo);

        // Mostrar el resultado
        System.out.println("Resultado de la solicitud: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para calcular la aceptación de la solicitud
    public static String calcularAceptacion(int edad, int nota, char sexo) {
        // Verificar los criterios de aceptación
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                return "POSIBLE";
            } else if (sexo == 'F') {
                return "ACEPTADA";
            }
        }

        // Si no cumple con los criterios anteriores, la solicitud no es aceptada
        return "NO ACEPTADA";
    }
}
