package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica operaciones = new Cientifica("Casio", "Blanca", "mediano", "2020");
		
		
		System.out.println(operaciones);
		operaciones.realizarOperaciones();
		
		operaciones.tomarTemperatura();
		
		

	}

}
