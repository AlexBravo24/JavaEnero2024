package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asientos asientos = new Asientos("Asiento", "Cuero");
		Llantas llantas = new Llantas("Michelin", "Normal");
		Auto auto = new Auto("Audi", "Camioneta", "Negro", 2015, llantas, asientos);
		
		System.out.println(auto.toString());
		
	}

}
