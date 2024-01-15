package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear un objeto de composición.
		
		//Creamos primero la pantall
		Pantalla pantalla = new Pantalla(1.64, "AMOLED", "Circular");
		
		//Establecemos las mediciones
		Mediciones monitoreo = new Mediciones(true, true, false);
		
		//Creamos nuestro reloj
		Reloj smartwatch = new Reloj("Smartwatch", "HUAWEI", "WATCH D", "Verde olvio", pantalla, monitoreo);
		
		//Imprimimos en consola nuestro reloj
		System.out.println(smartwatch);

	}

}
