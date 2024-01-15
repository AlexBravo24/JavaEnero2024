package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{

	private String sucursal;
	private Map <Integer, Cuenta> cuentas;
	private int folio = 1; //Variable auxiliar para incrementar el folio del ticket
	
	public Cajero() {
		
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		Cuenta cuenta = null;
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			if(monto > 9000) {
				System.out.println("Sólo puedes retirar un máximo de 9000");
				return ticket;
			}else if(monto > cuenta.getSaldo()) {
				System.out.println("Saldo insuficiente");
				return ticket;
			}else {
				//Se puede realizar correctamente el retiro de saldo
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else{
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}

	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			if(monto > 9000) {
				System.out.println("Sólo puedes depositar un máximo de 9000");
				return ticket;
			} else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("Sólo puedes depositar un máximo de "+cuenta.getSaldoMax());
				return ticket;
			}else {
				//Se puede realizar correctamente el retiro de saldo
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("El numero de cuenta no está asociado a ninguna cuenta");
			return ticket;
		}
		
	}

}
