package com;

public class Principal {

	public static void main(String[] args) {
		
		// CREAR UN OBJETO DE COMPOSICIÓN
		// EJEMPLO: UN CELULAR QUE CUENTA CON MARCA, COLOR, PRECIO
		// Y ADEMÁS CON UNA CÁMARA Y PROCESADOR, ESTOS ULTIMOS
		// SON OBJETOS QUE FORMAN PARTE DEL CELULAR, PERO TAMBIEN
		// TIENEN SUS PROPIOS ATRIBUTOS
		
		Camara camara = new Camara("Triple", "16MP+8MP+2MP");
		
		Procesador kirin = new Procesador("Kirin 710 2.2GHz");
		
		Celular huawei = new Celular("6.59 pulgadas, 1080 x 2340 pixeles", "Huawei Y9 Prime", "4 GB", camara, kirin);
		
		System.out.println(huawei);
		
		

	}

}
