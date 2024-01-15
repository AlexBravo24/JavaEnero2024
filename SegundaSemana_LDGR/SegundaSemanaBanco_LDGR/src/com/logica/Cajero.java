package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos { // implements es para interfaces
	
	// En este paquete se encuentra contenida la clase que crear�
	// los objetos que realizar�n las operaciones
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas; 
	
	private int folio=1; // Variable auxiliar para incrementar
	// el folio del Ticket
	
	public Cajero() {
		// Constructor vac�o
	}
	
	// Constructor con todos los par�metros (excepto folio)
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	
	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Instanciar una cuenta para devolver ese valor
		Cuenta cuenta = null;
		// La cuenta que vamos a consultar est� guardada en
		// un HashMap. Entonces la asignamos, si es que existe
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un Ticket vac�o
		Ticket ticket = null;
		
		// Antes de realizar un retiro, primero necesitamos
		// buscar la cuenta. Si la cuenta existe, entonces
		// la podemos manipular 
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// Una vez localizamos la cuenta y la podemos manipular,
			// existen validaciones antes de poder realizar
			// dicha operaci�n
			
		// Vamos a crear un ejemplo de que el cajero solo 
		// permite retirar cierta cantidad
			if(monto>9000) {
				System.out.println("Solo puedes retirar un m�ximo de $9000");
				return ticket;
			} else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente");
				return ticket;
			} else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejar�a por debajo del m�nimo a la cuenta");
				return ticket;
			} else { // Si el retiro puede realizarse
				// Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				// Entonces ahora s� emitimos un nuevo Ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
			}
		} else { // Si la cuenta no existe
			System.out.println("No hay una cuenta asociada");
			return ticket;
		}
		
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		
		Ticket ticket = null;
		
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			// Validamos si el monto a depositar es mayor que
			// el saldo m�ximo que permite la cuenta
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo m�ximo permitido en la cuenta");
				return ticket;
			} else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo exceder�a el m�ximo permitido en la cuenta");
				return ticket;
			} else { // Si el dep�sito puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
			
		} else { // Si la cuenta no se encuentra
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}
	
	
}
