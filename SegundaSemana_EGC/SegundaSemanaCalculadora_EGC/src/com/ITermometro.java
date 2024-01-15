package com;

public interface ITermometro {
	
	//Lo que hacemos en las interfaces es declarar unicamente metodos abstractos
	//No se requiere el modificador ABSTRACT por que ya está implicito
	
	public void tomarTemperatura();
	
	// Posible pregunta:
	//De donde toman comportamientos los objetos?
	//Respuesta:
	//1.- Metodos propios
	//2.- De otras clases, incluyendo clases abstractas
	//4.- de Interfaces

}
