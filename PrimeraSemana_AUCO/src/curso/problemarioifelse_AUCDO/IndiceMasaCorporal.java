package curso.problemarioifelse_AUCDO;

import java.util.Scanner;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int imc, peso, altura, alt2;
		
		
		System.out.println("Cual es su peso?");
		peso = sc.nextInt();
		System.out.println("Cual es su altura?");
		altura = sc.nextInt();
		
		alt2 = altura*altura;
		imc = peso/alt2;
		 
		if (imc == 16) {
			System.out.println("Criterio de entrar al hospital");
		}else if(imc == 17){
			System.out.println("Infra peso");
		}else if(imc == 18){
			System.out.println("Bajo peso");
		}else if(imc >= 19 || imc <=24){
			System.out.println("Peso normal");
		}else if(imc >= 25 || imc <=29){
			System.out.println("Sobre peso (Obesidad grado 1)");
		}else if(imc >= 30 || imc <=34){
			System.out.println("Sobre cronico (Obesidad grado 2)");
		}else if(imc >= 35 || imc <=40){
			System.out.println("Obesidad premorbida (Obesidad grado 3)");
		}else if(imc > 40){
			System.out.println("Obesidad morbida (Obesidad grado 4)");
		}
		
	}

}
