package com;

public class principal {

	public static void main(String[] args) {
		
		
		almacenamiento disco = new almacenamiento("Western Digital", "SSD-M2", "1TB");
		memoria ram = new memoria("ADATA", "DDR5", "32GB");
		steamdeck consola = new steamdeck("consola", "Steam", "1TB", disco, ram);
		System.out.println(consola);
		
	}

}