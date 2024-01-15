package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	//en eset paquete se encuentra conida la clase que creara los objetos que realizaran las operaciones 
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	private int folio=1; //variable euxiliar para incrementar el folio del ticket
	
	public Cajero() {}
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Instanciamos una cuenta pra devolver ese valor
		Cuenta cuenta = null;
		//la cuenta que vamos a consultar esta guardada en un hashmap entonces la asignamos si es que exista
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un ticket vacio
		Ticket ticket = null;
		
		//antes de realizar un retiro, primero necesitamos buscar la cuenta, si la cuenta existe entonces la podemos manipular 
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez localizamos la cuenta y la podemos manipular, existen validaciones antes de poder realizar dicha operacion 
			//vamos a cear un ejemplo de que el cajero solo permite retirar cierta cantidad 
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de 9000");
				return ticket;
		}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("el retiro dejaria por debajo del minimo la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//entonces ahora si emitimos un nuevo ticket 
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else { //si la cuenta no existe
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//validamos si el monto a depositar es mayor que el saldo maximo que permite la cuenta 
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return ticket;
		}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("el saldo excederia el maximo permitido en la cuenta");
				return ticket;
			}else {//si el deposito puede realizarce 
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("no hay una cuenta asociada a este cliente ");
			return ticket;
		}
		
	}
	

}
