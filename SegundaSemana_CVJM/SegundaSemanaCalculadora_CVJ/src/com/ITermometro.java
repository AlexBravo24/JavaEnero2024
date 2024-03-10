package com;

public interface ITermometro {
	
	/*Los que hacemos en las interfaces en las intefaces: es declarar unicamente
	 * metodos abstractos (determinar acciones sin definirlas) y poder heredar
	 * esos metodos o acciones.
	 * No se requiere el modificador 'abstract' porque la interfase por si sola
	 * es abstracta
	 * 
	 */

	public void tomasTemperatura(); //Lo reconoce como metodo abstracto
	//No se puede declarar la accion porque las interfaces solo pueden tener 
	//declarados metodos abstractos para que una clase defina como se haran 
	//las acciones
	
	
	//LA CLASE CIENTIFICA SE ENCARGARÁ DE DEFINIR COMO SE EJECUTARÁ ESTA ACCION 
	
	/* Pregunta examen 
	 * 
	 * ¿De donde toman comportamientos los objetos?
	 * R: 1. metodos propios 
	 * 2. De otras clases, incluyendo clases abstractas
	 * 3. Interfaces
	 */
}
