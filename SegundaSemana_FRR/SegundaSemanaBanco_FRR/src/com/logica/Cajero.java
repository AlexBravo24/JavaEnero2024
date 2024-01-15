package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	private int folio = 1; //variable auxiliar para incrementar el folio del ticket
	
	public Cajero () {
		
	}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	

	@Override
	public Cuenta consultar(int numeroCuenta) {
		//Instanciamos una cuenta para devolver su valor
		Cuenta cuenta = null;
		//La cuenta que vamos a consultar esta guardada en un hasmap
		//Entonces la asignamos, si es que existe
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		//instanciamos un ticket vacio
		Ticket ticket = null;
		
		//Antes de realizar un retiro, primero necesitamos buscar la cuenta
		//Si la cuenta existe, entonces la podemos manipular
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez localizamos la cuenta y la podemos manipular
			//existen validaciones antes de poder realizar dicha operacion
			//vamos a crear un ejemplo de que solo puede retirar cierta cantidad
			if(monto > 9000) {
				System.out.println("El monto excede el maximo permitido");
				return ticket;
			}else if(cuenta.getSaldo() < monto) {
				System.out.println("Saldo insuficiente");
				return ticket;
			}else if(cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por dejabo del minimo de cuenta");
				return ticket;
			}else { //el retiro puede realizarse
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				//entonces ahora si emitimos un nuevo tiket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else //si la cuenta no existe
			System.out.println("No hay una cuenta asosiada a ese cliente");
		return ticket;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//validamos si el monto a depositar es mayor que el saldo maximo que permite la cuenta
			if(monto > cuenta.getSaldoMax()) {
				System.out.println("el monto excede el saldo maximo permitido en la cuenta");
				return ticket;
			} else if (cuenta.getSaldo() > cuenta.getSaldoMax()) {
				System.out.println("el saldo excederia el maximo de la cuenta");
				return ticket;
			} else { //si el deposito puede realizarse
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
				
	}		else {
		System.out.println("no hay una cuenta asociada  ese cliente");
		return ticket;	
	}			
	}

	//En este paquete se encuentra contenida la clase
	//que creará los objetos que realizarán lasoperaciones
	
	

}
