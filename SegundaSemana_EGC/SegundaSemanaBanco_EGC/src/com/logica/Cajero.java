package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	// En este paquete está contenida la clase
	// que creara los objetos que realizaran
	// las operaciones

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;

	private int folio = 1; // Variable auxiliar para incrementar el folio del ticket

	public Cajero() {

	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Instanciamos una cuenta para devolver ese valor
		Cuenta cuenta = null;
		// La cuenta que vamos a consultar está guardada en un
		// HashMap. Entonces la asignamos, si es que existe
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un ticket vacio
		Ticket ticket = null;

		// Antes de realizar un retiro necesitamos buscar la cuenta
		// Si la cuenta existe la podemos manipulas
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// Una vez localizamos la cuenta y la podemos manipular.
			// Existen validaciones antes de poder realizar dicha operacion.
			// vamos a crear un ejemplo de que el cajero solo permite retirar
			// cierta cantidad
			if (monto > 9000) {
				System.out.println("El monto excede el maximo diario permitido, del 9000.");
				return ticket;
			} else if (cuenta.getSaldo() < monto) {
				System.out.println("Saldo insuficiente para el retiro.");
				return ticket;
			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del minimo a la cuenta");
				return ticket;
			} else {// Si el retiro pude realizarse
					// Se actualiza el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}

		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// Validamos si el monto a depositar es mayor que el saldo maximo que permite la
			// cuenta
			// que permite la cuenta
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("El monto excedería el máximo permitido en la cuenta");
				return ticket;
			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo excedería el máximo permitido en la cuenta");
				return ticket;
			} else {// si el deposito puede realizarse
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

}
