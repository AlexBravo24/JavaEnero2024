package curso;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");

        // Verificar si se ingres� un n�mero real
        if (scanner.hasNextDouble()) {
            // Leer el peso del usuario
            double peso = scanner.nextDouble();

            // Solicitar al usuario que ingrese su altura en metros
            System.out.print("Ingrese su altura en metros: ");

            // Verificar si se ingres� un n�mero real
            if (scanner.hasNextDouble()) {
                // Leer la altura del usuario
                double altura = scanner.nextDouble();

                // Calcular el �ndice de Masa Corporal (IMC)
                double imc = peso / (altura * altura);

                // Determinar el diagn�stico seg�n el valor de IMC
                String diagnostico;

                if (imc < 16) {
                    diagnostico = "Criterio de ingreso en hospital";
                } else if (imc >= 16 && imc < 17) {
                    diagnostico = "Infrapeso";
                } else if (imc >= 17 && imc < 18) {
                    diagnostico = "Bajo peso";
                } else if (imc >= 18 && imc < 25) {
                    diagnostico = "Peso normal (saludable)";
                } else if (imc >= 25 && imc < 30) {
                    diagnostico = "Sobrepeso (obesidad de grado I)";
                } else if (imc >= 30 && imc < 35) {
                    diagnostico = "Sobrepeso cr�nico (obesidad de grado II)";
                } else if (imc >= 35 && imc < 40) {
                    diagnostico = "Obesidad prem�rbida (obesidad de grado III)";
                } else {
                    diagnostico = "Obesidad m�rbida (obesidad de grado IV)";
                }

                // Mostrar el resultado
                System.out.printf("Su �ndice de Masa Corporal (IMC) es %.2f.\n", imc);
                System.out.println("Diagn�stico: " + diagnostico);
            } else {
                // Mensaje de error si no se ingres� un n�mero real para la altura
                System.out.println("Error: Ingrese un n�mero real para la altura.");
            }
        } else {
            // Mensaje de error si no se ingres� un n�mero real para el peso
            System.out.println("Error: Ingrese un n�mero real para el peso.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
