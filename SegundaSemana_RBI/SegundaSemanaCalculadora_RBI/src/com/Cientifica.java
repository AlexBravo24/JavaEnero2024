package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private String a�o;
	

    public Cientifica() {
        
    }
    
    

    public Cientifica(String marca, String color, String tama�o, String a�o) {
		super(marca, color, tama�o);
		this.a�o = a�o;
	}
    
    



	public String getA�o() {
		return a�o;
	}



	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
	
	



	@Override
	public String toString() {
		return "Cientifica [a�o=" + a�o + ", toString()=" + super.toString() + "]";
	}



	// Implementaci�n de los m�todos abstractos
    @Override
    public void sumar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer n�mero para sumar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo n�mero para sumar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    @Override
    public void restar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer n�mero para restar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo n�mero para restar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    @Override
    public void multiplicar() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer n�mero para multiplicar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo n�mero para multiplicar: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 * num2;
        System.out.println("Resultado de la multiplicaci�n: " + resultado);
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
            System.out.println("Resultado de la divisi�n: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    // M�todo para realizar operaciones espec�ficas de la calculadora cient�fica
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
            System.out.print("Seleccione una operaci�n (0-4): ");
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
                    System.out.println("Opci�n no v�lida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }



	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura del dia de hoy normal");
		
	}

}

