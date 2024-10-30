package com;


public class Principal {

	public static void main(String[] args) {
	Camara cam = new Camara("Lenovo", 3);
	
	Procesador pro = new Procesador("Snapdragon","8gb");
	
	Celular zFlip3 = new Celular ("Samsung", "3", 256, "morado", cam, pro);
	
	System.out.println(zFlip3);
	

	}
}
