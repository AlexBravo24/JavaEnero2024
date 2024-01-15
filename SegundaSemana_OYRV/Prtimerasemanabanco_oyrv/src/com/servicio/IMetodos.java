package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//esta interface va a contener el listado de metodos abstractos o instrucciones que la clase encargada de la logica tendria que impletar y resolver, es decir, nuestro cajero es el que la implementara
	
	//Consultar una cuenta de banco 
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos 
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Dpositarle recursos 
	public Ticket depositar(int numeroCuenta, double monto);
	

}
