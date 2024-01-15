package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	// Esta interface va a contener el listado de métodos
	// abstractos o instrucciones que la clase encargada de la
	// lógica, tendrá que implementar y resolver
	
	// Es decir, nuestro Cajero es el que la implementará
	
	// Consultar una cuenta de banco
	public Cuenta consultar(int numeroCuenta);
	
	// Retirar recursos
	public Ticket retirar(int numeroCuenta, double monto);
	
	// Depositar recursos
	public Ticket depositar(int numeroCuenta, double monto);

}
