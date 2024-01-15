package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Esta interfase va a contener el listado de metodos abstractos
	//o instrucciones que la clase encargada de la lógica tendrá que implementar y resolver
	
	//Es decir, nuestro cajero es el que la implementará
	
	//primero vamos a crear el metodo para consultar una cuenta}
	public Cuenta consultar(int numeroCuenta);
	
	//Retiro de efectivo
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Depositar efectivo
	public Ticket depositar(int numeroCuenta, double monto);
	

}
