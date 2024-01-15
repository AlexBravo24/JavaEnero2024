package com.servicio;

import com.Respuesta.Ticket;
import com.modelo.Cuenta;

public interface IMetodos {

	//Esta interface va a contener el listado de metodos
	//abstractos o instrucciones que la clase encargada de la
	//logica tendra que implementar y resolver
	
	//Es decir, nuestro Cajero es el que la implementara
	
	//Consultar una cuenta de banco
	
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recurso
	
	public Ticket retirar (int numeroCuenta, double monto);
	
	//Depositar recurso
	
	public Ticket depositar (int numeroCuenta, double monto);
	
	

}
