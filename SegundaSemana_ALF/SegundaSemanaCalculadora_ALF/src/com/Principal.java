package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//CREAR UN OBJETO DE LA CLASE CIENTIFICA 
		Cientifica atributos = new Cientifica("casio","rojo","Mxdh",520,"2v");
		
		Cientifica operaciones = new Cientifica();
		
		System.out.println(atributos);
		
		operaciones.sumar();
		operaciones.restar();
		operaciones.dividir();
		operaciones.multiplicar();
		operaciones.tomarTemperatura();
		
		
		

	}

}
