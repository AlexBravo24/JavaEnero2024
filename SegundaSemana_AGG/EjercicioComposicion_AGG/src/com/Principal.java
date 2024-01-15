package com;

public class Principal {

	public static void main(String[] args) {
		//crear un objeto de composicion
		//ejemplo - un celular que cuente con marca, color y precio
		//Y ademas con una camara y procesador, estos ultimos
		//son objetos que forman parte del celular, pero tambien
		//tienen sus propios atributos
		
		//Creamos tipos de camara
		Camara cam=new Camara(12.5, "Sin Flash");
		Camara cam1=new Camara(50, "Con Flash");
		Camara cam2=new Camara(25, "Con Flash");
		Camara cam3=new Camara(10, "Sin Flash");
		
		//creamos el tipo de procesador
		Procesador ram=new Procesador(60, 20);
		Procesador ram1=new Procesador(60,+ 100);
		Procesador ram2=new Procesador(50,+80);
		Procesador ram3=new Procesador(60,+80);
		
		//creamos nuestro celular
		Celular iphone=new Celular("Apple", "morado", 25000, cam1, ram1);
		Celular alcatel=new Celular("Alcatel", "Blanco", 5500, cam3, ram);
		Celular motorola=new Celular("Motorola", "Negro", 11000, cam2, ram3);
		
		//Imprimimos en consola nuestro nuevo celular
		
		System.out.println(iphone);
		System.out.println(alcatel);
		System.out.println(motorola);
		
		
		
		
	}

}
