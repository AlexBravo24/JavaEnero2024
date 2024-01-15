package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	/*Esta interface va a contener el listado de metodos
	 * abstractos o instrucciones que la clase encargada
	 * de la logica tendra que implementar y resolver
	 * 
	 * Es decir, nuestro cajero es el que la implementara
	 * 
	 * CONSULTAR UNA CUENTA DE BANCO*/
	
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos
	
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Depositar ecursos
	
	public Ticket depositar(int numeroCuenta, double monto);
	
	

}
