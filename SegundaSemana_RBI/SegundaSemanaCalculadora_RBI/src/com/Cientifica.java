package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private String año;
	

    public Cientifica() {
        
    }
    
    

    public Cientifica(String marca, String color, String tamaño, String año) {
		super(marca, color, tamaño);
		this.año = año;
	}
    
    



	public String getAño() {
		return año;
	}



	public void setAño(String año) {
		this.año = año;
	}
	
	



	@Override
	public String toString() {
		return "Cientifica [año=" + año + ", toString()=" + super.toString() + "]";
	}



	// Implementación de los métodos abstractos
    @Override
    public void sumar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número para sumar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número para sumar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    @Override
    public void restar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número para restar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número para restar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    @Override
    public void multiplicar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número para multiplicar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número para multiplicar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 * num2;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    @Override
    public void dividir() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador para dividir: ");
        double numerador = scanner.nextDouble();

        System.out.print("Ingrese el denominador para dividir: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    // Método para realizar operaciones específicas de la calculadora científica
    public void realizarOperaciones() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una operación (0-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }



	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura del dia de hoy normal");
		
	}

}

