package curso.condicionales;

import java.util.Scanner;

public class Condicionales12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa tu nombre");
			String nombre = entrada.nextLine();
		
		System.out.println("ingrese su altura en metros");
				double altura = entrada.nextDouble();
				
		System.out.println("ingrese su peso en kilogramos");
				double peso = entrada.nextInt();
				
				double imc = peso / (altura * altura);				
				
			if (imc < 16) {
				System.out.println(nombre + " estás en criterio de ingreso al hospital");
			} else if (imc >= 16 && imc < 17) {
				System.out.println(nombre + " estás en infrapeso");
			} else if (imc >= 17 && imc < 18) {
				System.out.println(nombre + " estás en bajo peso");
			} else if (imc >= 18 && imc < 25) {
				System.out.println(nombre + " estás en peso normal");
			} else if (imc >= 25 && imc < 30) {
				System.out.println(nombre + " tienes sobrepeso");
			} else if (imc >= 30 && imc < 35) {
				System.out.println(nombre + " tienes sobrepeso crónico");
			} else if (imc >= 35 && imc < 40) {
				System.out.println(nombre + " tienes obesidad premorbida");
			} else if (imc > 40) {
				System.out.println(nombre + " tienes obesidad morbida");
			} else {
				System.out.println("error");
			}

}
}