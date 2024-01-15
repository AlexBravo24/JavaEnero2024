package com;

public class Principal {

	public static void main(String[] args) {
		
		Modelo modelo = new Modelo("Xbox One", "2021");
		Almacenamiento almacenamiento = new Almacenamiento("Adata", "SSD M2", 1000);
		Procesador procesador = new Procesador("Zen 2", "AMD", "8");
		
		Consola consola = new Consola("Microsoft", "2021", modelo, almacenamiento, procesador);
		
		System.out.println(consola);
		
		
		

	}

}
