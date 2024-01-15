package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Almacenamiento disco = new Almacenamiento("kingston","SSD",480);
		Memoria ram = new Memoria("ADATA","DDR4",16);
		
		Computadora pc = new Computadora("Laptop", "HP", "440", disco, ram);
		
		System.out.println(pc.toString());
		
	}

}
