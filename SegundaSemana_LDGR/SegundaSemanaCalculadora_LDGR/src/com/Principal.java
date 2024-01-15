package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear un Objeto de la clase Cientifica
		Cientifica calc1 = new Cientifica("CASIO", "CAS-12345", "Negro", 2024);
		
		System.out.println(calc1);
		
		calc1.sumar();
		
		calc1.restar();
		
		calc1.multiplicar();
		
		calc1.dividir();
		
		calc1.tomarTemperatura();

	}

}
