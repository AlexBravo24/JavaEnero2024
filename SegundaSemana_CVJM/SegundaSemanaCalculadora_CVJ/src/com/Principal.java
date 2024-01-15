package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calc1 = new Cientifica();
		
		System.out.println("Ingrese la accion deseada; \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir");
		int x = new Scanner (System.in).nextInt();
		switch (x) {
		case 1:
			calc1.sumar();
			break;
		case 2:
			calc1.restar();
			break;
		case 3:
			calc1.multiplicar();
			break;
		case 4:
			calc1.dividir();
			break;
		default: System.out.println("ERORR. Digite la opción disponible");
			break;
		}
		
		calc1.tomasTemperatura();
		
	}

}
