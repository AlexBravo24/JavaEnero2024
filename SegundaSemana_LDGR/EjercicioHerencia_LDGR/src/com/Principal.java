package com;

public class Principal {

	public static void main(String[] args) {
		
		Espada espada1 = new Espada("Espada com�n", 100, 150);
		
		EspadaDeFuego espada2 = new EspadaDeFuego("Espada de fuego", 150, 200, "Quema al oponente durante 5 seg", 10 + " de da�o por segundo mientras el oponente est� quemado", 50 + " puntos de resistencia adicional");
		
		System.out.println(espada1);
		
		System.out.println(espada2);

	}

}
