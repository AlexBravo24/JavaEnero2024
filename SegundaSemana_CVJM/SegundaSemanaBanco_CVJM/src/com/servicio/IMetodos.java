package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	/*Listado de metodos abstractos
	 * 
	 * Esta interface va a contener el listado de metodos abstractos o instrucciones
	 * que la clase encargada de la logica tendra que implementar y resolver
	 * 
	 * Es decir, nuestro Cajero es el que la implementará
	 * 
	 * Definir metodos que el Cajero llevara a cabo con retorno
	 * 
	 * 1er Metodo: Para consultar una cuenta de banco
	 */
	
	
	//Metodo: public   Vamos a regresar: info de cuenta de banco   Metodo: consultar
	//nos va a pedir un parametro una varibale de tipo entero llamado numeroCuenta
	
	//Debemos importar Cuenta del paquete en donde se encuentra (para que se quite el 
	//error)
	
	public Cuenta consultar(int numeroCuenta);
	
	
	//Retirar recursos/saldo a la cuenta
	
	//Devolver la informacion si se lleva a cabo correctamente la operacion
	//Parametros(): de donde voy a retirar y cuanto
	
	public Ticket retirar (int numeroCuenta, double monto);
	
	//Deposiar recursos
	//Parametros(): a donde voy a depositar y cuanto
	public Ticket depositar (int numeroCuenta, double monto);
	
	
}

