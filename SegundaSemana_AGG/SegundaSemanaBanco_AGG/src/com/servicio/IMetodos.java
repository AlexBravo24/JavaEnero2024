package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	//esta interfase va a contener el listado de 
	//metodos abstractos o instrucciones que la clase encargada de la logica
	//tendrà que implementar y resolver
	
	//Es decir, nuestro cajero es el que la implementará
	
	//consultar una cuenta de banco
	
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos
	
	public Ticket retirar (int numeroCuenta, double monto);
	
	//Depositar recursos
	
	public Ticket depositar (int numeroCuenta, double monto);
	
	
	
}
