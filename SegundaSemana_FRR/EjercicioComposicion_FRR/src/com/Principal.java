package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camara camara = new Camara("sony", 48);
		
		Procesador procesador = new Procesador("Snapdragon", 1.1);
		
		Celular celular = new Celular("Samsung", "rojo", 4500, procesador, camara);
		
		
		System.out.println(celular);
	}

}
