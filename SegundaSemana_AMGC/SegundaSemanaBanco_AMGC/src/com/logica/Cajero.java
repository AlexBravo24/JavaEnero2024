package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	//En este paquete se ecuentra contenida la clase que creará los objetos que realizaran
	//las operaciones
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	private int folio=1; //Variable aux para incrementar el folio del ticket
	
	public Cajero() {
		
	}
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		//Instanciamos una cuenta para devolver ese valor
		Cuenta cuenta = null;
		//La cuenta que vamos a consultar está guardada en un HashMap. Entonces la
		//asignamos si existe.
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un ticket vacío
		Ticket ticket = null;
		
		//Antes de realizar un retiro, primero necesitamos buscar la cuenta
		//Si la uenta existe, entonces la podemos manipular
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			//Una vez localizamos la cuenta y la podemos manipular
			//Existen validaciones antes de poder realizar un retiro
			//Vamos a crear un ejemplo donde el cajero solo permite retirar cierta cantidad
			if(monto>9000) {
				System.out.println("Solo puedes retirar un máximo de $9000");
				return ticket;
			} else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
			} else if (cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
			} else { //Si el retiro puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Entonces ahora sí emitimos un nuevo Ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else { //Si la cuenta no existe
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			//Validamos si el monto a depositar es mayor que el saldo máximo que permite la cuenta
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket;
			} else if ((cuenta.getSaldo()+monto) > cuenta.getSaldoMax()) {
				System.out.println("El saldo excedería el máximo permitido en la cuenta");
				return ticket;
			} else { //Si el depósito puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Entonces ahora sí emitimos un nuevo Ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}

		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	} //Se cierra el método depositar
	
	
}
